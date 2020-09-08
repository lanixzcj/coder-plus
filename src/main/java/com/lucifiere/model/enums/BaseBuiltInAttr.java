package com.lucifiere.model.enums;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author created by XD.Wang
 * Date 2020/9/8.
 */
public enum BaseBuiltInAttr {

    /**
     * 作者
     */
    BASE_AUTHOR("_au");

    private final String key;

    BaseBuiltInAttr(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    public static boolean contain(String l) {
        return Arrays.stream(BaseBuiltInAttr.values()).map(BaseBuiltInAttr::key).allMatch(it -> Objects.equals(l, it));
    }
}
