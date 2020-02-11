package mayiwork.thread.threadTest3;

/**
 * 测试基类
 * @author yingkuigou
 * @date 2020/2/9 22:43
 */
public class ThreadNoSafeInteger {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
