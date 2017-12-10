package facebook.controller;

import facebook.model.Post;
import facebook.service.PostService;
import facebook.service.factory.ServiceFactory;

import java.util.Date;
import java.util.List;

/**
 * Implementation of any methods from {@link PostService}
 */
public class PostController {

    public static void main(String[] args) {

        PostService allPostMethods = ServiceFactory.getAllPostsMethods();
//        for (Post elem : allPostMethods.getAllPosts()) {
//            System.out.println(elem);
//            System.out.println();
//        }
//        String title = "Title Example 1";
//        List<Post> listByTitle = allPostMethods.getByTitle(title);
//        for (Post elem : listByTitle) {
//            System.out.println(elem);
//        }
//
//        Date date = new Date();
//        List<Post> listByDate = allPostMethods.getByDate(date);
//        for (Post elem : listByDate) {
//            System.out.println(elem);
//        }

        Post post = new Post();
        post.setTitle("TitleBIG");

        allPostMethods.delete(1l);
        allPostMethods.create(post);
        allPostMethods.update(post);
    }
}
