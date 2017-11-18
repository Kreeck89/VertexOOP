package lesson4OOP.facebook.model;

import java.util.Date;

public class Post {

    private String title;
    private String discription;
    private Date datePost;

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

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    @Override
    public String toString() {
        return "Title: "
                + getTitle()
                + "\n"
                + "Discription: "
                + getDiscription()
                + "\n"
                + "Date realise: "
                + getDatePost();
    }
}
