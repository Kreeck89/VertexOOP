package lesson4OOP.facebook.dao.impl;

import lesson4OOP.facebook.dao.PostDao;
import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.Post;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class PostDaoImpl implements PostDao {
    @Override
    public List<Post> getAllPost() {
        return Database.getAllPost();
    }

    @Override
    public List<Post> getByTitle(String word) {
        List<Post> listByTitle = new LinkedList<>();
        List<Post> allPost = Database.getAllPost();
        for (Post elem : allPost) {
            if (elem.getTitle().contains(word)) {
                listByTitle.add(elem);
            }
        }
        return listByTitle;
    }

    @Override
    public List<Post> getByDate(Date date) {
        List<Post> listByDate = new LinkedList<>();
        List<Post> allPost = Database.getAllPost();
        for (Post elem : allPost) {
            if (elem.getDatePost() == date) {
                listByDate.add(elem);
            }
        }
        return listByDate;
    }
}
