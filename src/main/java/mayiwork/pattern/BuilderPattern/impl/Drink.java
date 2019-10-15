package mayiwork.pattern.BuilderPattern.impl;

import mayiwork.pattern.BuilderPattern.Item;
import mayiwork.pattern.BuilderPattern.Packing;

/**
 * 饮料的抽象类
 * @author gouyingkui
 * @date 2019/10/15 16:09
 */
public abstract class Drink implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
