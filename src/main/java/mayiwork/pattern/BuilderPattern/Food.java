package mayiwork.pattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

import mayiwork.pattern.BuilderPattern.Item;

/**
 * 食物构成类
 * @author gouyingkui
 * @date 2019/10/15 16:27
 */
public class Food {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double getCost() {
        double cost = 0d;
        for (Item item : itemList) {
            cost = cost + item.price();
        }
        return cost;
    }

    public String getName() {
        StringBuffer sb = new StringBuffer();
        for (Item item : itemList) {
            sb.append(item.name()).append(" ");
        }
        return sb.toString();

    }
}
