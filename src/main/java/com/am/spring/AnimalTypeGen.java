package com.am.spring;

public class AnimalTypeGen implements ObjectTypeGen{
    public String getObjectType() {
        String[] animalType = {"Cat", "Dog", "Horse", "Duck"};
        return animalType[(int) (Math.random() * animalType.length)];
    }
}
