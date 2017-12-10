package facebook.service.impl;

import facebook.dao.PostDAO;
import facebook.dao.factory.DAOFactory;
import facebook.dao.impl.PostDAOImpl;
import facebook.model.Post;
import facebook.service.PostService;

import java.util.Date;
import java.util.List;

/**
 * With DAOFactory pattern calls any methods from PostDAO.
 *
 * If methods with parameters, checks "notNull" or "!=0".
 */
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

    @Override
    public void create(Post post) {
        PostDAO postDAO = new PostDAOImpl();
        postDAO.create(post);
    }

    @Override
    public void delete(Long postId) {
        PostDAO postDAO = new PostDAOImpl();
        postDAO.delete(postId);
    }

    @Override
    public void update(Post post) {
        PostDAO postDAO = new PostDAOImpl();
        postDAO.update(post);
    }
}
