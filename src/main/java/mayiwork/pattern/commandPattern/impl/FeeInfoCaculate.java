package mayiwork.pattern.commandPattern.impl;

import mayiwork.pattern.commandPattern.Command;
import mayiwork.pattern.commandPattern.FeeCaculater;

/**
 * 计算费用
 * @author gouyingkui
 * @date 2019/10/14 15:49
 */
public class FeeInfoCaculate implements Command {

    private FeeCaculater feeCaculater;

    private Integer num;

    @Override
    public void execute() {
        feeCaculater.caculate(num);
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public FeeCaculater getFeeCaculater() {
        return feeCaculater;
    }

    public void setFeeCaculater(FeeCaculater feeCaculater) {
        this.feeCaculater = feeCaculater;
    }
}
