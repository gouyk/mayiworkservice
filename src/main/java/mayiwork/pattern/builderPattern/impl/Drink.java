package mayiwork.pattern.builderPattern.impl;

import mayiwork.pattern.builderPattern.Item;
import mayiwork.pattern.builderPattern.Packing;

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
