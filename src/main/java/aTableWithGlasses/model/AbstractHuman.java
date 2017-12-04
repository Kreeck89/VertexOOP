package aTableWithGlasses.model;

public abstract class AbstractHuman implements Humanable {

    private String name;
    private String sex;
    private int age;
    private AbstractGlass withGlass;

    public AbstractHuman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AbstractHuman() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AbstractGlass getWithGlass() {
        return withGlass;
    }

    public void setWithGlass(AbstractGlass withGlass) {
        this.withGlass = withGlass;
    }

    public enum Sex {
        MAN, WOMAN
    }

    @Override
    public String toString() {
        String s;
        try {
            return "Name: " + getName() + "\n"
                    + "sex: " + getSex() + "\n"
                    + "age: " + getAge() + "\n"
                    + "Have a glass: " + getWithGlass().getFormType();
        } catch (NullPointerException e) {
            s = "Name: " + getName() + "\n"
                    + "sex: " + getSex() + "\n"
                    + "age: " + getAge() + "\n"
                    + "You don`t have a glass";
        }
        return s;
    }

    @Override
    public void takeGlass(AbstractGlass glass) {
        this.setWithGlass(glass);
        glass.setIsFree(this);
    }

    @Override
    public void putGlass() {
        this.getWithGlass().setIsFree(null);
        this.setWithGlass(null);
    }

    @Override
    public void pourWaterOnTable(AbstractTable table) {
        if (this.getWithGlass() != null & !this.getWithGlass().isEmpty()) {
            this.getWithGlass().pourFromMe();
            table.isDryMethod();
        }
    }

    @Override
    public void fillGlass() {
        if (this.getWithGlass() != null) {
            this.getWithGlass().setEmpty(false);
        }
    }

    @Override
    public void printAboutMe() {
        System.out.println(this.toString());
    }
}

