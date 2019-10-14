package mayiwork.pattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式调用类
 * @author gouyingkui
 * @date 2019/10/14 15:53
 */
public class CommandBroker {

    private List<Command> commands = new ArrayList<>();

    /**
     * 添加命令
     * @param command
     */
    public void takeCommand(Command command) {
        commands.add(command);
    }

    /**
     * 执行命令
     */
    public void executeCommand() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
