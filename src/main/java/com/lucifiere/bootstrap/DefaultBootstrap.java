package com.lucifiere.bootstrap;

import com.lucifiere.common.GlobalConfig;
import com.lucifiere.exporter.CodeExporter;
import com.lucifiere.extract.table.TableExtractor;
import com.lucifiere.resovler.antlr.AntlrResolver;

public class DefaultBootstrap extends Bootstrap {

    private GlobalConfig.Creator creator = new GlobalConfig.Creator();

    public DefaultBootstrap setWorkspacePath(String workspacePath) {
        creator.setWorkspacePath(workspacePath);
        return this;
    }

    public DefaultBootstrap setInputPath(String inputPath) {
        creator.setInputPath(inputPath);
        return this;
    }

    public DefaultBootstrap setOutputPath(String outputPath) {
        creator.setOutputPath(outputPath);
        return this;
    }

    public DefaultBootstrap setDdlName(String ddlName) {
        creator.setDdlName(ddlName);
        return this;
    }

    public DefaultBootstrap setTemplatesPath(String templatesPath) {
        creator.setTemplatesPath(templatesPath);
        return this;
    }

    @Override
    protected GlobalConfig configureContext() {
        return creator.setExporter(CodeExporter.class)
                .setExtractor(TableExtractor.class)
                .setResolver(AntlrResolver.class)
                .init();
    }

}
