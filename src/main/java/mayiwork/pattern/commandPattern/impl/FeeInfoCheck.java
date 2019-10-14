package mayiwork.pattern.commandPattern.impl;

import mayiwork.pattern.commandPattern.Command;
import mayiwork.pattern.commandPattern.FeeCaculater;

/**
 * 命令实体类 获取费用系数
 * @author gouyingkui
 * @date 2019/10/14 15:43
 */
public class FeeInfoCheck implements Command {

    private FeeCaculater feeCaculater;

    private String name;

    @Override
    public void execute() {
        feeCaculater.check(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FeeCaculater getFeeCaculater() {
        return feeCaculater;
    }

    public void setFeeCaculater(FeeCaculater feeCaculater) {
        this.feeCaculater = feeCaculater;
    }
}
