package com.exadel.lombokProject.food;

import lombok.*;

@ToString
@EqualsAndHashCode(doNotUseGetters = true)
@RequiredArgsConstructor
public class KittyCat {
    @NonNull private String name;
    @NonNull @Setter @Getter private double weight;
    @ToString.Exclude @Setter @Getter private int calories;
}
