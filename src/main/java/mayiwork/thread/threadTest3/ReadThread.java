package mayiwork.thread.threadTest3;

/**
 * 读线程
 * @author yingkuigou
 * @date 2020/2/9 23:38
 */
public class ReadThread extends Thread {

    private volatile Boolean ready;

    private volatile Integer num;

    public ReadThread(Boolean ready, Integer num) {
        this.ready = ready;
        this.num = num;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (ready) {//1
                System.out.println(num + num);//2
            }
            System.out.println("read thread ......");
        }
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
