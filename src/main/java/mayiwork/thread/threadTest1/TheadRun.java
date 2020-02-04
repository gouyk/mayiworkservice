package mayiwork.thread.threadTest1;

/**
 * @author yingkuigou
 * @date 2019/11/24 22:39
 */
public class TheadRun {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread threadA = new Thread(myThread, "A");
        Thread threadB = new Thread(myThread, "B");
        Thread threadC = new Thread(myThread, "C");
        Thread threadD = new Thread(myThread, "D");
        Thread threadE = new Thread(myThread, "E");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();

    }
}
