package com.exadel.lombokProject.props;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:calories/catsfoodcalories.properties")
public interface CaloriesProps extends Config {
    @Key("royal.food")
    int getRoyalFoodCalories();

    @Key("shawerma.food")
    int getShawermaCalories();
}
