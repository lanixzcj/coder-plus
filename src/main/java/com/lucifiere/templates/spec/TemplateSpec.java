package com.lucifiere.templates.spec;

import com.lucifiere.common.FileSetting;

import java.util.Objects;

/**
 * 定义模板
 *
 * @author wuhuilin
 * Date 2020-8-23.
 */
public class TemplateSpec {

    private String id;

    private FileSetting fileSetting;

    private String path;

    private String description;

    private boolean isEmbed = false;

    public static TemplateSpec of(FileSetting fileSetting, String path, String description) {
        var spec = new TemplateSpec();
        spec.setPath(path);
        spec.setDescription(description);
        spec.setFileSetting(fileSetting);
        return spec;
    }

    public static TemplateSpec of(String prefix, String suffix, String ext, String path, String description) {
        var spec = new TemplateSpec();
        spec.setPath(path);
        spec.setDescription(description);
        spec.setFileSetting(FileSetting.of(prefix, suffix, ext));
        return spec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FileSetting getFileSetting() {
        return fileSetting;
    }

    public void setFileSetting(FileSetting fileSetting) {
        this.fileSetting = fileSetting;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEmbed() {
        return isEmbed;
    }

    public void setEmbed(boolean embed) {
        isEmbed = embed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var that = (TemplateSpec) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
