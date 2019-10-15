package mayiwork.pattern.BuilderPattern;

import mayiwork.pattern.BuilderPattern.impl.Bugre;

/**
 * 素食
 * @author gouyingkui
 * @date 2019/10/15 16:19
 */
public class VegBugre extends Bugre {

    @Override
    public String name() {
        return "veg food!";
    }

    @Override
    public double price() {
        return 3.0d;
    }
}
