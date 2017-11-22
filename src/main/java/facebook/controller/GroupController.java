package facebook.controller;

import facebook.model.Group;
import facebook.service.GroupService;
import facebook.service.factory.ServiceFactory;

import java.util.List;

public class GroupController {

    public static void main(String[] args) {

        GroupService allGroupMethods = ServiceFactory.getAllGroupsMethods();
        for (Group elem : allGroupMethods.getAllGroups()) {
            System.out.println(elem);
            System.out.println();
        }

        String name = "Vertex group";
        List<Group> listByName = allGroupMethods.getByName(name);
        for (Group elem : listByName) {
            System.out.println(elem);
        }

        int followers = 5000;
        List<Group> listByFollowers = allGroupMethods.getByFollowers(followers);
        for (Group elem : listByFollowers) {
            System.out.println(elem);
            System.out.println();
        }
    }
}
