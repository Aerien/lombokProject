package com.exadel.lombokProject.props;

import com.exadel.lombokProject.enums.CuteLevel;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class CutenessConverter implements Converter<CuteLevel> {
    @Override
    public CuteLevel convert(Method method, String s) {
        for (CuteLevel level : CuteLevel.values()) {
            if (s.equals(level.toString())) {
                return level;
            }
        }
        return null;
    }
}
