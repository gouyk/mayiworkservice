package mayiwork.pattern.ChainResponsibilityPattern;

/**
 * @author yingkuigou
 * @date 2019/11/22 23:50
 */
public class ChainPatterDemo {

    public static AbstractLogger getChainLoggers() {
        AbstractLogger errorloger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugloger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infologer = new InfoLogger(AbstractLogger.INFO);
        infologer.setNextLogger(debugloger);
        debugloger.setNextLogger(errorloger);
        return infologer;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getChainLoggers();
        logger.logMessage(AbstractLogger.ERROR, "error level");
        logger.logMessage(AbstractLogger.DEBUG, "debug level");
        logger.logMessage(AbstractLogger.INFO, "info level");
    }

}
