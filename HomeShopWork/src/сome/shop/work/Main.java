package сome.shop.work;

import сome.shop.work.model.Goods;
import сome.shop.work.model.Shop;

public class Main {
    public static void main(String[] args) {
        Goods gd1 = new Goods(1, "Box1", "Boxis", 10);
        Goods gd2 = new Goods(2, "Box2", "Boxis", 30);
        Goods gd3 = new Goods(6, "Box3", "Boxis", 23);
        Goods gd4 = new Goods(1, "Box4", "Boxis", 40);
        Goods gd5 = new Goods(5, "Box5", "Boxis", 20);
        Goods gd6 = new Goods(7, "Box6", "Boxis", 11);

        Shop max = new Shop();

        max.addGood(gd1);
        max.addGood(gd2);
        max.addGood(gd3);
        max.addGood(gd4);
        max.addGood(gd5);
        max.addGood(gd6);

        max.infoShop();
        max.remove(3);
        max.remove(2);
        System.out.println("New list");
        max.infoShop();
        System.out.println("New list");
        Goods r = new Goods(7,"RR","rrr",33);
        max.edit(r);
        max.infoShop();
    }
}
