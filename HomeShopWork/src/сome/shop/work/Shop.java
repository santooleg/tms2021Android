package сome.shop.work;

import сome.shop.work.model.Goods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shop extends Goods{
    List<Goods> list = new ArrayList<Goods>();

    public List<Goods> getList() {
        return list;
    }
}
