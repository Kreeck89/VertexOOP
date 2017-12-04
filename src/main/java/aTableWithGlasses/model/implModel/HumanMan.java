package aTableWithGlasses.model.implModel;

import aTableWithGlasses.model.AbstractHuman;

public class HumanMan extends AbstractHuman {

    public HumanMan(String name, int age) {
        super(name, age);
        setSex(String.valueOf(Sex.MAN));
    }

    public HumanMan() {
        setSex(String.valueOf(Sex.MAN));
    }


}
