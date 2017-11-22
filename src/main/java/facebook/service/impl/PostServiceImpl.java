package facebook.service.impl;

import facebook.dao.PostDAO;
import facebook.dao.factory.DAOFactory;
import facebook.model.Post;
import facebook.service.PostService;

import java.util.Date;
import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAllPosts() {
        PostDAO allPostsMethods = DAOFactory.getPostDAOMethods();
        return allPostsMethods.getAllPosts();
    }

    @Override
    public List<Post> getByTitle(String word) {
        if (!word.equals("")) {
            return DAOFactory.getPostDAOMethods().getByTitle(word);
        }
        return null;
    }

    @Override
    public List<Post> getByDate(Date date) {
        if (date != null) {
            return DAOFactory.getPostDAOMethods().getByDate(date);
        }
        return null;
    }
}
