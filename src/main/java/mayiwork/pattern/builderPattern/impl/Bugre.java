package mayiwork.pattern.builderPattern.impl;

import mayiwork.pattern.builderPattern.Item;
import mayiwork.pattern.builderPattern.Packing;

/**
 * 食物的抽象类
 * @author gouyingkui
 * @date 2019/10/15 16:15
 */
public abstract class Bugre implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wapper();
    }

    @Override
    public abstract double price();
}
