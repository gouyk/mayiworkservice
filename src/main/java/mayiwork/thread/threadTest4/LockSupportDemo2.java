package mayiwork.thread.threadTest4;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport类测试
 * @author yingkuigou
 * @date 2020/2/10 21:43
 */
public class LockSupportDemo2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("child thread park");
                //调用park方法 挂起自己
                //调用park方法挂起自己，只有中断时才退出
                while (!Thread.currentThread().isInterrupted()) {
                    LockSupport.park();
                }
                System.out.println("child thread unpark");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread begin unpark");
        //调用 unpark方法让 thread线程持有许可证，然后park方法返回
        //LockSupport.unpark(thread);
        //中断子线程
        thread.interrupt();
    }

}
