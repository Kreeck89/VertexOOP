package aTableWithGlasses.model.implModel;

import aTableWithGlasses.model.AbstractGlass;

public class GlassCircle extends AbstractGlass {

    public GlassCircle(boolean isEmpty) {
        super(isEmpty);
        setFormType(String.valueOf(FigureType.CIRCLE));
    }

    public GlassCircle() {
        setFormType(String.valueOf(FigureType.CIRCLE));
    }

    @Override
    public void pourFromMe() {
        if (!isEmpty()) {
            setEmpty(true);
            System.out.println("I`m a Circle glass");
        } else {
            System.out.println("Your glass is Empty!");
        }
    }

    @Override
    public String toString() {
        return "Type of glass is: " + getFormType() + "\n"
                + "This Glass is: " + !isEmpty() + " empty," + "\n"
                + "This glass took Human:" + "\n" + getIsFree();
    }
}
