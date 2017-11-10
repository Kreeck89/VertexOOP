package lesson3OOP.work9.service;

import lesson3OOP.work9.data.DateBase;
import lesson3OOP.work9.exeptions.BadCreditalsE;
import lesson3OOP.work9.exeptions.NoStartWPE;
import lesson3OOP.work9.exeptions.NoUrlE;
import lesson3OOP.work9.exeptions.SiteNFE;

import java.util.List;

public class Services {

    public static void main(String[] args) {
        Services services = new Services();
        services.passUrl("https://vk.ru");

    }

    private void passUrl(String url) {
        List<String> badSites = DateBase.getBadSites();
        List<String> goodSites = DateBase.getGoodSites();

        if (null == url) {
            throw new NoStartWPE();
        } else if (!url.startsWith("https://")) {
            throw new NoUrlE();
        }
        for (String elem : goodSites) {
            if (url != elem) {
                throw new SiteNFE();
            }
        }
        for (String elem : badSites) {
            if (url == elem) {
                throw new BadCreditalsE();
            }
        }
    }
}
