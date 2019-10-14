package mayiwork.pattern.commandPattern;

import mayiwork.pattern.commandPattern.impl.FeeInfoCaculate;
import mayiwork.pattern.commandPattern.impl.FeeInfoCheck;

/**
 * 命令模式Demo
 * @author gouyingkui
 * @date 2019/10/14 15:51
 */
public class CommandDemo {

    /***
     * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
     * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，
     * 并把该命令传给相应的对象，该对象执行命令。
     */

    public static void main(String[] args) {
        //具体命令实体
        FeeCaculater feeCaculater = new FeeCaculater();
        //组装命令请求
        FeeInfoCaculate feeInfoCaculate = new FeeInfoCaculate();
        feeInfoCaculate.setFeeCaculater(feeCaculater);
        feeInfoCaculate.setNum(1);
        FeeInfoCheck feeInfoCheck = new FeeInfoCheck();
        feeInfoCheck.setFeeCaculater(feeCaculater);
        feeInfoCheck.setName("check");
        //命令调用对象
        CommandBroker commandBroker = new CommandBroker();
        commandBroker.takeCommand(feeInfoCaculate);
        commandBroker.takeCommand(feeInfoCheck);
        commandBroker.executeCommand();
    }

}
