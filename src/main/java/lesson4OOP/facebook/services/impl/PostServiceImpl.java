package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.PostDao;
import lesson4OOP.facebook.dao.factory.DaoFactory;
import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.services.PostService;

import java.util.Date;
import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAllPost() {
        PostDao allPost = DaoFactory.getPostDao();
        return allPost.getAllPost();
    }

    @Override
    public List<Post> getByTitle(String word) {
        if (!word.equals("")) {
            return DaoFactory.getPostDao().getByTitle(word);
        }
        return null;
    }

    @Override
    public List<Post> getByDate(Date date) {
        if (date != null) {
            return DaoFactory.getPostDao().getByDate(date);
        }
        return null;
    }
}
