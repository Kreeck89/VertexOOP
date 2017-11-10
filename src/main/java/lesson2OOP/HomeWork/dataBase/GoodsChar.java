package lesson2OOP.HomeWork.dataBase;

public class GoodsChar {

    private String NameGoods;
    private String madeIn;
    private int count;
    private int price;

    public GoodsChar() {
    }

    public GoodsChar(String nameGoods, String madeIn,int count, int price) {
        NameGoods = nameGoods;
        this.madeIn = madeIn;
        this.count = count;
        this.price = price;
    }

    public String getNameGoods() {
        return NameGoods;
    }

    public void setNameGoods(String nameGoods) {
        NameGoods = nameGoods;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Name of goods: " + getNameGoods() + "\n"
                + "Made in: " + getMadeIn() + "\n"
                + "Price: " + getPrice() + "\n"
                + "Count: " + getCount();
    }
}
