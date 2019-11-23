package mayiwork.pattern.builderPattern;

/**
 * 构建类
 * @author gouyingkui
 * @date 2019/10/15 16:26
 */
public class FoodBuilder {

    public Food getVegFood() {
        Item food = new VegBugre();
        Item drink = new Coke();
        Food food1 = new Food();
        food1.addItem(food);
        food1.addItem(drink);
        return food1;
    }

    public Food getNonVegFood() {
        Item food = new MeatBugre();
        Item drink = new Pepsi();
        Food food1 = new Food();
        food1.addItem(food);
        food1.addItem(drink);
        return food1;
    }

}
