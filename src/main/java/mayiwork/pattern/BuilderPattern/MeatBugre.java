package mayiwork.pattern.BuilderPattern;

import mayiwork.pattern.BuilderPattern.impl.Bugre;

/**
 * 肉食
 * @author gouyingkui
 * @date 2019/10/15 16:20
 */
public class MeatBugre extends Bugre {

    @Override
    public String name() {
        return "meat food";
    }

    @Override
    public double price() {
        return 5.5d;
    }
}
