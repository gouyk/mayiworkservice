package mayiwork.pattern.bridgePattern.impl;

import mayiwork.pattern.bridgePattern.DrawAPI;

/**
 * 基础接口的实现
 * @author gouyingkui
 * @date 2019/10/15 14:22
 */
public class RedDraw implements DrawAPI {

    @Override
    public void draw(int location, int x, int y) {
        System.out.println("red draw:" + location + "x:y" + x + ":" + y);
    }
}
