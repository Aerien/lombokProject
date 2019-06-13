package com.exadel.lombokProject.props;

import com.exadel.lombokProject.enums.CuteLevel;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:cute-level/catscutelevel.properties")
public interface CuteLevelProps extends Config {
    @Key("first.cat")
    @ConverterClass(CutenessConverter.class)
    @DisableFeature(DisableableFeature.PARAMETER_FORMATTING)
    CuteLevel getFirstCatCuteness();

    @Key("second.cat")
    @ConverterClass(CutenessConverter.class)
    @DisableFeature(DisableableFeature.PARAMETER_FORMATTING)
    CuteLevel getSecondCatCuteness();
}
