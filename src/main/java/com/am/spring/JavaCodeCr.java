package com.am.spring;

public class JavaCodeCr implements CodeCr{
    private ObjectTypeGen classNameGen;

    public ObjectTypeGen getClassNameGen() {
        return classNameGen;
    }

    public void setClassNameGen(ObjectTypeGen classNameGen) {
        this.classNameGen = classNameGen;
    }

    public JavaCodeCr() {
    }

    public String getClassExample() {
        return "public class " + classNameGen.getObjectType() + " {\n   \n}";
    }
}
