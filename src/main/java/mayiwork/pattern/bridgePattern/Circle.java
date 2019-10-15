package mayiwork.pattern.bridgePattern;

/**
 * shape的实现类
 * @author gouyingkui
 * @date 2019/10/15 14:31
 */
public class Circle extends Shape {

    private int x, y, location;

    public Circle(DrawAPI drawAPI, int x, int y, int location) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.location = location;
    }

    @Override
    public void draw() {
        drawAPI.draw(location, x, y);
    }
}
