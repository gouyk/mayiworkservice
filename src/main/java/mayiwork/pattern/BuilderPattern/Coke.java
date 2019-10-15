package mayiwork.pattern.BuilderPattern;

import mayiwork.pattern.BuilderPattern.impl.Drink;

/**
 * Drink的实现类
 * @author gouyingkui
 * @date 2019/10/15 16:12
 */
public class Coke extends Drink {

    @Override
    public String name() {
        return "coke";
    }

    @Override
    public double price() {
        return 2.5D;
    }
}
