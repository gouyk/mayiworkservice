package mayiwork.thread.threadTest3;

/**
 * 使用volatile的方式保证变量的可见性
 * @author yingkuigou
 * @date 2020/2/9 22:47
 */
public class ThreadSafeIntegerVolatile {

    //使用volatile的方式保证可见性
    private volatile Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
