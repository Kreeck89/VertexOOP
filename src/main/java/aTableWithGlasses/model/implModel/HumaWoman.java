package aTableWithGlasses.model.implModel;

import aTableWithGlasses.model.AbstractHuman;

public class HumaWoman extends AbstractHuman {

    public HumaWoman(String name, int age) {
        super(name, age);
        setSex(String.valueOf(Sex.WOMAN));
    }

    public HumaWoman() {
        setSex(String.valueOf(Sex.WOMAN));
    }
}
