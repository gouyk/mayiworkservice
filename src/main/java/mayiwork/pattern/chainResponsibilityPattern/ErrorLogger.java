package mayiwork.pattern.chainResponsibilityPattern;

/**
 * @author yingkuigou
 * @date 2019/11/22 23:44
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(Integer level) {
        this.level = level;
        System.out.println("this leve is " + this.level);
    }

    @Override
    void wirte(String message) {
        System.out.println(level + "---" + message);
    }
}
