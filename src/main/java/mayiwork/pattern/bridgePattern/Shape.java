package mayiwork.pattern.bridgePattern;

/**
 * 桥接类
 * @author gouyingkui
 * @date 2019/10/15 14:25
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
