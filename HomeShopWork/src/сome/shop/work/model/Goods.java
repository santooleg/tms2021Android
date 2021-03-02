package сome.shop.work.model;

import java.util.Objects;
import java.util.Set;

public class Goods implements Comparable {
    private int id;
    private String name;
    private String type;
    private int price;

    public Goods() {
    }
    private Set<GoodsInOrder> goodsInOrders;

    public Goods(int id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Set<GoodsInOrder> getGoodsInOrders() {
        return goodsInOrders;
    }

    public void setGoodsInOrders(Set<GoodsInOrder> goodsInOrders) {
        this.goodsInOrders = goodsInOrders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return getId() == goods.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
