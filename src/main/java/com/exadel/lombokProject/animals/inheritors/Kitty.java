package com.exadel.lombokProject.animals.inheritors;

import com.exadel.lombokProject.animals.Animal;
import com.exadel.lombokProject.enums.CuteLevel;
import com.exadel.lombokProject.food.EatCharacteristics;
import com.exadel.lombokProject.food.KittyCat;
import com.exadel.lombokProject.humans.Owner;
import lombok.*;
import org.apache.log4j.Logger;

@ToString(callSuper = true)
@Setter
@Getter
@EqualsAndHashCode(callSuper = true, of = {"cuteLevel", "owner"})
public class Kitty extends Animal {
    private CuteLevel cuteLevel;
    private Owner owner;
    private KittyCat dailyFood;
    private static final Logger logger = Logger.getLogger(Kitty.class);

    public Kitty(String name, double weight) {
        super(name, weight);
        logger.info("Kitty was born!");
    }

    public void eatSomeFood(EatCharacteristics characteristics) {
        if (dailyFood.getWeight() == 0.0) {
            logger.warn("There is lack of dailyFood! Cat is nervous!");
            return;
        }

        double foodLeft = dailyFood.getWeight() - characteristics.getFoodQuantity();
        if (foodLeft <= 0) {
            logger.warn("Cat have eaten all existed food, you have to buy more food");
            dailyFood.setWeight(0.0);
        } else {
            dailyFood.setWeight(foodLeft);
            logger.info("The cat ate, the cat pleased.");
        }
    }

    @SneakyThrows(InterruptedException.class)
    public void killCat() {
        logger.error("Cat is dead!");
        switch (cuteLevel) {
            case BAD_CAT:
                break;
            default:
                String message = "The owner " + owner.toString() + " mourns";
                logger.info(message);
        }
        throw new InterruptedException("Poor poor kitty...");
    }
}
