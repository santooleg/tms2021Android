package сome.shop.work.model;

import java.util.*;

public class Shop {

    private Set<Goods> products;

    public Shop() {
        products = new LinkedHashSet<>();
    }

    public boolean addGood(Goods gds) {
        return products.add(gds);
    }

    public void infoShop() {
        for (Goods s : products) {
            System.out.println(s);
        }
    }

    public void remove(int id) {
        for (Goods ce : products) {
            if (ce.getId() == id) {
                products.remove(ce);
                return;
            }
        }
    }
}

