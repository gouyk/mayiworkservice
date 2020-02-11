package mayiwork.thread.threadTest3;

/**
 * 使用synchronized的方式
 * @author yingkuigou
 * @date 2020/2/9 22:45
 */
public class ThreadSafeIntegerSynchronized {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    //使用synchronized保证线程安全  赋值时加锁
    public synchronized void setValue(Integer value) {
        this.value = value;
    }
}
