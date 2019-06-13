package com.exadel.lombokProject;

import com.exadel.lombokProject.animals.inheritors.Kitty;
import com.exadel.lombokProject.enums.CatPosition;
import com.exadel.lombokProject.enums.DayPart;
import com.exadel.lombokProject.food.EatCharacteristics;
import com.exadel.lombokProject.food.KittyCat;
import com.exadel.lombokProject.humans.Owner;
import lombok.Cleanup;

import static com.exadel.lombokProject.props.PropertyHolder.caloriesProps;
import static com.exadel.lombokProject.props.PropertyHolder.cuteLevelProps;

public class Main {
    public static void main(String[] args) {


        Owner owner1 = new Owner();
        owner1.setName("Jane");
        owner1.setSurname("Doe");
        owner1.setAge(30);
        Owner owner2 = new Owner();
        owner2.setName("John");
        owner2.setSurname("Daugherty");
        owner2.setAge(25);

        KittyCat shawerma = new KittyCat("Shawerma", 1.0);
        shawerma.setCalories(caloriesProps.getShawermaCalories());
        KittyCat royalFood = new KittyCat("RoyalFood", 2.0);
        royalFood.setCalories(caloriesProps.getRoyalFoodCalories());

        EatCharacteristics morningFood = EatCharacteristics.builder().foodQuantity(0.5).dayPart(DayPart.MORNING).position(CatPosition.LIES).createCharacteristics();
        EatCharacteristics noonFood = EatCharacteristics.builder().foodQuantity(1).dayPart(DayPart.AFTERNOON).position(CatPosition.SITTING).createCharacteristics();
        EatCharacteristics eveningFood = EatCharacteristics.builder().foodQuantity(0.5).dayPart(DayPart.EVENING).position(CatPosition.SITTING).createCharacteristics();


        @Cleanup("killCat") Kitty janesCat = new Kitty("Mew-Mew", 3.0);
        janesCat.setOwner(owner1);
        janesCat.setCuteLevel(cuteLevelProps.getFirstCatCuteness());
        janesCat.setDailyFood(royalFood);
        System.out.println(janesCat);
        janesCat.eatSomeFood(morningFood);
        janesCat.eatSomeFood(noonFood);
        janesCat.eatSomeFood(eveningFood);

        @Cleanup("killCat") Kitty johnsCat = new Kitty("Caesar", 8.0);
        johnsCat.setOwner(owner2);
        johnsCat.setCuteLevel(cuteLevelProps.getSecondCatCuteness());
        johnsCat.setDailyFood(shawerma);
        System.out.println(johnsCat);
        johnsCat.eatSomeFood(morningFood);
        johnsCat.eatSomeFood(noonFood);
        johnsCat.eatSomeFood(eveningFood);
    }
}
