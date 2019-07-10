package com.am.spring;

public class VBNetCodeCr implements CodeCr {
    private ObjectTypeGen animalTypeGen;

    public VBNetCodeCr(ObjectTypeGen animalTypeGen) {
        this.animalTypeGen = animalTypeGen;
    }

    public String getClassExample() {
        return "Public Class " + animalTypeGen.getObjectType() + "()\n   \nEnd Class";
    }
}
