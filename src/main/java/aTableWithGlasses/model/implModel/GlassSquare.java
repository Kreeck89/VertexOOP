package aTableWithGlasses.model.implModel;

import aTableWithGlasses.model.AbstractGlass;

public class GlassSquare extends AbstractGlass {

    public GlassSquare(boolean isEmpty) {
        super(isEmpty);
        setFormType(String.valueOf(FigureType.SQUARE));
    }

    public GlassSquare() {
        setFormType(String.valueOf(FigureType.SQUARE));
    }

    @Override
    public void pourFromMe() {
        if (!isEmpty()) {
            setEmpty(true);
            System.out.println("I`m a Square glass");
        } else {
            System.out.println("Your glass is Empty!");
        }
    }

    @Override
    public String toString() {
        String s;
        try {
            return "Type of glass is: " + getFormType() + "\n"
                    + "This Glass is: " + !isEmpty() + " empty," + "\n"
                    + "This glass took Human:" + "\n" + getIsFree().toString();
        } catch (NullPointerException e) {
            s = "Type of glass is: " + "GlassSquare" + "\n"
                    + "This Glass is: " + !isEmpty() + " empty," + "\n"
                    + "This glass is FREE!";
        }
        return s;
    }
}
