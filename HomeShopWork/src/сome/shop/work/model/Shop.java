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

    public Set<Goods> getProducts() {
        return products;
    }

    public void setProducts(Set<Goods> products) {
        this.products = products;
    }

    public void infoShop() {
        for (Goods s : products) {
            if( s == null){
                System.out.println("Товара нет в магазине!");
            }
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

    public void edit(Goods newP) {
        boolean edit = false;
        for (Goods p : products) {
            if (p.getId() == newP.getId()) {
                p.setName(newP.getName());
                p.setType(newP.getType());
                p.setPrice(newP.getPrice());
                edit = true;
                break;
            }
        }
    }

}
