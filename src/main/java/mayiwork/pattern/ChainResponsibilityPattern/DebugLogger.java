package mayiwork.pattern.ChainResponsibilityPattern;

/**
 * @author yingkuigou
 * @date 2019/11/22 23:46
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(Integer level) {
        this.level = level;
        System.out.println("this leve is " + this.level);
    }

    @Override
    void wirte(String message) {
        System.out.println(level + "---" + message);
    }

}
