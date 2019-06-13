package com.exadel.lombokProject.animals;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = "weight")
public abstract class Animal {
    private String name;
    @Setter private double weight;
}
