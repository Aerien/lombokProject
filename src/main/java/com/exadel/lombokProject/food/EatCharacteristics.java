package com.exadel.lombokProject.food;

import com.exadel.lombokProject.enums.CatPosition;
import com.exadel.lombokProject.enums.DayPart;
import lombok.Builder;
import lombok.Getter;

@Builder(builderClassName = "FoodCollector", buildMethodName = "createCharacteristics")
@Getter
public class EatCharacteristics {
    private double foodQuantity;
    private DayPart dayPart;
    private CatPosition position;
}
