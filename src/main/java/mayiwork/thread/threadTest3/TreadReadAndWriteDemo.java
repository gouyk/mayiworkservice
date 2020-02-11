package mayiwork.thread.threadTest3;

/**
 * 测试读写线程 看看指令重排的影响
 * @author yingkuigou
 * @date 2020/2/9 23:46
 */
public class TreadReadAndWriteDemo {

    private static Boolean ready = false;

    private static Integer num = 0;

    public static class ReadThread extends Thread {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) {//1
                    System.out.println(num + num);//2
                }
                System.out.println("read thread ......");
            }
        }
    }

    public static class WriteThread extends Thread {

        @Override
        public void run() {
            ready = true;
            num = 2;
            System.out.println("write thread over.....");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        ReadThread readThread = new ReadThread();
        readThread.start();
        WriteThread writeThread = new WriteThread();
        writeThread.start();

        Thread.sleep(10);

        readThread.interrupt();

        System.out.println("main exit!!");

    }

}
