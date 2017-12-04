package aTableWithGlasses.model;

public abstract class AbstractTable implements Tablable {

    private boolean isDry = true;

    @Override
    public void isDryMethod() {
        setDry(false);
    }

    public void setDry(boolean dry) {
        isDry = dry;
    }

    public boolean isDry() {
        return isDry;
    }

    @Override
    public String toString() {
        return "This table is " + !isDry() + " dry.";
    }
}
