package lesson2OOP.HomeWork.dataBase;

import java.util.LinkedList;
import java.util.List;

public class BaseOfGoods {

    public static List<GoodsChar> goodsList() {
        List<GoodsChar> goodsChars = new LinkedList<>();
        goodsChars.add(new GoodsChar());
        goodsChars.add(new GoodsChar("TV", "Samsung", 5, 1_000));
        goodsChars.add(new GoodsChar("Microfone", "Siemens", 12, 5_000));
        return goodsChars;
    }


}
