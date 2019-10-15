package mayiwork.pattern.BuilderPattern.impl;

import mayiwork.pattern.BuilderPattern.Packing;

/**
 * Packing的实现类
 * @author gouyingkui
 * @date 2019/10/15 16:07
 */
public class Bottle implements Packing {

    @Override
    public void pack() {
        System.out.println("bottle");
    }
}
