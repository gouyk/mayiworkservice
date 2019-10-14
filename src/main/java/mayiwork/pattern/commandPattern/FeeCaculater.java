package mayiwork.pattern.commandPattern;

/**
 * 具体费用计算的行为类
 * @author gouyingkui
 * @date 2019/10/14 15:40
 */
public class FeeCaculater {

    private String action = "fee";

    private Integer num = 1;

    /**
     * 检查费用
     */
    public void check(String name) {

        System.out.println("check fee" + action + name);
    }

    /**
     * 计算费用
     * @param num
     */
    public void caculate(Integer num) {

        System.out.println("计算费用" + this.num + num);
    }

}
