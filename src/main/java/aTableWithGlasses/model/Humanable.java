package aTableWithGlasses.model;

public interface Humanable {

    /**
     * Pass exemplar of glass;
     * save to glass variable isFree this.AbstractHuman;
     * and AbstractHuman save to variable setWithGlass this exemplar of glass.
     */
    void takeGlass(AbstractGlass glass);

    /**
     * will free parameters from AbstractHuman and AbstractGlass one another;
     * isFree = null;
     * setWithGlass = null;
     */
    void putGlass();

    /**
     * Check Do Human have a glass,
     * Check is not empty the glass,
     * Example of Tables from List will call pourForMe();
     * and change table`s variable isDry to false;
     */
    void pourWaterOnTable(AbstractTable table);

    /**
     * If Human have a glass will change it`s variable isEmpty to false;
     * if variable is false don`t change it;
     */
    void fillGlass();

    /**
     * Method for print about some exemplars of Abstract class;
     * call method toString;
     */
    void printAboutMe();
}
