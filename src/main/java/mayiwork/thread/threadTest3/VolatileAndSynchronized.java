package mayiwork.thread.threadTest3;

/**
 * 线程同步的问题
 * @author yingkuigou
 * @date 2020/2/9 22:42
 */
public class VolatileAndSynchronized {

    public static void main(String[] args) {

        ThreadNoSafeInteger threadNoSafeInteger = new ThreadNoSafeInteger();
        threadNoSafeInteger.setValue(1);
        ThreadSafeIntegerSynchronized threadSafeIntegerSynchronized = new ThreadSafeIntegerSynchronized();
        threadSafeIntegerSynchronized.setValue(1);
        ThreadSafeIntegerVolatile threadSafeIntegerVolatile = new ThreadSafeIntegerVolatile();
        threadSafeIntegerVolatile.setValue(2);

    }

}
