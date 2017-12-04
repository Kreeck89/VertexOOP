package aTableWithGlasses.model;

public abstract class AbstractGlass implements Glassable {

    private boolean isEmpty;
    private AbstractHuman isFree;
    private String formType;

    public AbstractGlass(boolean isEmpty) {
        this.isEmpty = true;
    }

    public AbstractGlass() {
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public AbstractHuman getIsFree() {
        return isFree;
    }

    public void setIsFree(AbstractHuman isFree) {
        this.isFree = isFree;
    }

    public String getFormType() {
            return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }


    public enum FigureType {
        CIRCLE, SQUARE
    }

}
