package mayiwork.thread.threadTest4;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport类测试
 * @author yingkuigou
 * @date 2020/2/10 21:43
 */
public class LockSupportDemo {

    public static void main(String[] args) {
        System.out.println("being lock");
        /**
         *当一个线程调用 unpark 时，如果参数 thread 线程没有持有 thread 与 LockSupport 类
         * 关联的许可证， 则 让 thread 线程持有。 如果 thread 之前因调用 park（）而被挂起，则调用
         * unpark 后，该线程会被唤醒 。 如果 thread 之前没有调用 park ，则 调用 unpark 方法后 ， 再
         * 调用 park 方法，其会立刻返回 。
         *
         */
        //使当前线程获得许可证
        LockSupport.unpark(Thread.currentThread());
        //默认情况下是持有许可证的，当持有许可证时，调用park会马上返回，当前线程调用park会呗阻塞。
        LockSupport.park();
        System.out.println("end lock");
    }

}
