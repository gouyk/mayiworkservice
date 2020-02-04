package mayiwork.thread.threadTest2;

/**
 * 继承的方式创建线程
 * @author yingkuigou
 * @date 2020/1/31 17:45
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println("this is my thread" + getName());
    }
}
