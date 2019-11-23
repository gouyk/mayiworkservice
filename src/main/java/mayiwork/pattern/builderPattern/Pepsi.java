package mayiwork.pattern.builderPattern;

import mayiwork.pattern.builderPattern.impl.Drink;

/**
 * Drink的实现类
 * @author gouyingkui
 * @date 2019/10/15 16:13
 */
public class Pepsi extends Drink {

    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public double price() {
        return 2.0d;
    }
}
