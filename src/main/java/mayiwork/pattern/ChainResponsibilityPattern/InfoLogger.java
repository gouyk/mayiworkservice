package mayiwork.pattern.ChainResponsibilityPattern;

/**
 * @author yingkuigou
 * @date 2019/11/22 23:48
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(Integer level) {
        this.level = level;
        System.out.println("this leve is " + this.level);
    }

    @Override
    void wirte(String message) {
        System.out.println(level + "---" + message);
    }
}
