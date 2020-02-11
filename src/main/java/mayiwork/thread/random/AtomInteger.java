package mayiwork.thread.random;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author yingkuigou
 * @date 2020/2/9 17:18
 */
public class AtomInteger {

    //创建一个Long型的原子计数器
    private static AtomicLong atomicLong = new AtomicLong();

    //初始化数组
    private static Integer[] arrayOne = new Integer[] {0, 1, 2, 4, 5, 0, 9, 12, 0, 5, 11};

    private static Integer[] arrayTwo = new Integer[] {1, 5, 2, 0, 5, 0, 9, 0, 1, 5, 0, 0};

    public static void main(String[] args) throws Exception {
        //计数arrayone中的0的个数
        Thread threadOne = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < arrayOne.length; i++) {
                    if (arrayOne[ i ].intValue() == 0) {
                        atomicLong.incrementAndGet();
                    }
                }
            }
        });
        //计数arraytwo中0的个数
        Thread threadTwo = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < arrayTwo.length; i++) {
                    if (arrayTwo[ i ].intValue() == 0) {
                        atomicLong.incrementAndGet();
                    }
                }
            }
        });
        //启动线程
        threadOne.start();
        threadTwo.start();
        //等待线程执行完毕
        threadOne.join();
        threadTwo.join();
        System.out.println("count 0:" + atomicLong);
    }
}
