package mayiwork.pattern.proxyPattern.impl;

import mayiwork.pattern.proxyPattern.Image;

/**
 * @author gouyingkui
 * @date 2019/10/14 16:39
 */
public class ProxyImage implements Image {

    //需要代理的类
    private RealImage realImage;

    //执行真实类的方法
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage("pic");
        }
        realImage.display();
    }
}
