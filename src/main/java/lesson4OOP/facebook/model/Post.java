package lesson4OOP.facebook.model;

public class Post {

    private String title;
    private String discription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Title: "
                + getTitle()
                + "\n"
                + "Discription: "
                + getDiscription();
    }
}
