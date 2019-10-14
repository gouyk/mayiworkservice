package mayiwork.pattern.proxyPattern.impl;

import mayiwork.pattern.proxyPattern.Image;

/**
 * @author gouyingkui
 * @date 2019/10/14 16:37
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("display " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("load from disk" + filename);
    }
}
