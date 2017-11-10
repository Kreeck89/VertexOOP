package lesson3OOP.work9.data;

import java.util.LinkedList;
import java.util.List;

public class DateBase {

    public static List<String> getGoodSites () {
        List<String> listGood = new LinkedList<>();
        listGood.add("https://facebook.com");
        listGood.add("https://google.com.ua");
        listGood.add("i.ua");
        return listGood;
    }

    public static List<String> getBadSites () {
        List<String> listBad = new LinkedList<>();
        listBad.add("https://vk.ru");
        listBad.add("ok.ru");
        listBad.add("https://mail.ru");
        listBad.add("yandex.ru");
        return listBad;
    }



}
