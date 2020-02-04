package mayiwork.thread.threadTest1;

/**
 * @author yingkuigou
 * @date 2019/11/24 22:17
 */
public class MyThread extends Thread {

    private Integer count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count = count - 1;
        System.out.println("由" + currentThread().getName() + "计算count=" + count);
    }
}
