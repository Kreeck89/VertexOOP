package facebook.dao.impl;

import facebook.dao.PostDAO;
import facebook.data.Database;
import facebook.model.Post;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class PostDAOImpl implements PostDAO {
    @Override
    public List<Post> getAllPosts() {
        return Database.getAllPosts();
    }

    @Override
    public List<Post> getByTitle(String word) {
        List<Post> list = Database.getAllPosts();
        List<Post> listByTitle = new LinkedList<>();
        for (Post elem : list) {
            if (word.equals(elem.getTitle())) {
                listByTitle.add(elem);
            }
        }
        return listByTitle;
    }

    @Override
    public List<Post> getByDate(Date date) {
        List<Post> list = Database.getAllPosts();
        List<Post> listByDate = new LinkedList<>();
        for (Post elem : list) {
            if (date.equals(elem.getDataPost())) {
                listByDate.add(elem);
            }
        }
        return listByDate;
    }
}
