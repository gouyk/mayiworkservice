package mayiwork.pattern.chainResponsibilityPattern;

/**
 * 日志抽象类
 * @author yingkuigou
 * @date 2019/11/22 23:21
 */
public abstract class AbstractLogger {

    public static final Integer INFO = 0;

    public static final Integer DEBUG = 1;

    public static final Integer ERROR = 2;

    protected Integer level;

    //责任链的下一个链条
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger) {
        nextLogger = abstractLogger;
    }

    public void logMessage(Integer level, String message) {
        if (this.level <= level) {
            wirte(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void wirte(String message);
}
