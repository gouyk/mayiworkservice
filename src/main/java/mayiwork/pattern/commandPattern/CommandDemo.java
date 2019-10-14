package mayiwork.pattern.commandPattern;

import mayiwork.pattern.commandPattern.impl.FeeInfoCaculate;
import mayiwork.pattern.commandPattern.impl.FeeInfoCheck;

/**
 * 命令模式Demo
 * @author gouyingkui
 * @date 2019/10/14 15:51
 */
public class CommandDemo {

    public static void main(String[] args) {
        //具体命令实体
        FeeCaculater feeCaculater = new FeeCaculater();
        //组装命令
        FeeInfoCaculate feeInfoCaculate = new FeeInfoCaculate();
        feeInfoCaculate.setFeeCaculater(feeCaculater);
        feeInfoCaculate.setNum(1);
        FeeInfoCheck feeInfoCheck = new FeeInfoCheck();
        feeInfoCheck.setFeeCaculater(feeCaculater);
        feeInfoCheck.setName("check");
        //命令调用
        CommandBroker commandBroker = new CommandBroker();
        commandBroker.takeCommand(feeInfoCaculate);
        commandBroker.takeCommand(feeInfoCheck);
        commandBroker.executeCommand();
    }

}
