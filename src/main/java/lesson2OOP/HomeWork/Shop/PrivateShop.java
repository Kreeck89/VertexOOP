package lesson2OOP.HomeWork.Shop;

import lesson2OOP.HomeWork.customer.DatabaseUsers;
import lesson2OOP.HomeWork.customer.User;
import lesson2OOP.HomeWork.dataBase.BaseOfGoods;
import lesson2OOP.HomeWork.dataBase.GoodsChar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrivateShop {

    private static final String PASSWORD = "macOS";

    public static void main(String[] args) {

        List<User> list = DatabaseUsers.getAllUsers();
        List<GoodsChar> goodsList = BaseOfGoods.goodsList();

        System.out.println(list.get(0));
        list.get(0).setOrder("Microfone");
        System.out.println(list.get(0));

        System.out.println(goodsList.get(1));

        String orderName = "TV";
        int id = 1;
        makeOrder(orderName, id, list, goodsList);

        System.out.println(list.get(1));
        System.out.println(goodsList.get(1));
        System.out.println(goodsList.get(2));

        System.out.println(showMyOrder(list, goodsList));

        orders(list);
    }

    private static void makeOrder(String nameGoods, int idCustomer, List<User> list, List<GoodsChar> goodsList) {
        for (int i = 0; i < goodsList.size(); i++) {
                if (nameGoods.equals(goodsList.get(i).getNameGoods()) & goodsList.get(i).getCount() > 0) {
                    list.get(idCustomer).setOrder(nameGoods);
                    goodsList.get(i).setCount(goodsList.get(i).getCount() - 1);
                }
            }
        }

    private static String showMyOrder(List<User> list, List<GoodsChar> goodsList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your NickName: ");
        String nick = scanner.nextLine();
        System.out.println("Enter your pass: ");
        String pass = scanner.nextLine();
        for (int i = 0; i<list.size(); i++) {
            if (nick.equals(list.get(i).getNickName()) & pass.equals(list.get(i).getPassword())) {
                return String.valueOf(goodsList.get(i));
            }
        }
        return null;
    }
    
    private static void orders(List<User> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password.");
        String pass = scanner.nextLine();
        if (pass.equals(PASSWORD)) {
            Map <String, String> orders = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                orders.put(list.get(i).getNickName(), list.get(i).getOrder());
            }
            for (Map.Entry<String, String> element : orders.entrySet()) {
                System.out.println("Customer: " + element.getKey());
                System.out.println("His orde: " + element.getValue());
            }
        }
    }
}
