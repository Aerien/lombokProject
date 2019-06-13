package com.exadel.lombokProject.props;

import org.aeonbits.owner.ConfigFactory;

public class PropertyHolder {
    public static CuteLevelProps cuteLevelProps = ConfigFactory.create(CuteLevelProps.class);
    public static CaloriesProps caloriesProps = ConfigFactory.create(CaloriesProps.class);
}
