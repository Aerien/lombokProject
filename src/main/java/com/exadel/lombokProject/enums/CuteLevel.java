package com.exadel.lombokProject.enums;

import org.apache.commons.lang3.StringUtils;

public enum CuteLevel {
    FAT_CAT,
    BAD_CAT,
    FLUFFY_CAT,
    LAZY_CAT;

    @Override
    public String toString() {
        String result = StringUtils.lowerCase(name());
        result = StringUtils.replaceChars(result, "_", StringUtils.SPACE);
        return StringUtils.capitalize(result);
    }
}
