package mayiwork.pattern.BuilderPattern.impl;

import mayiwork.pattern.BuilderPattern.Item;
import mayiwork.pattern.BuilderPattern.Packing;

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
