package mayiwork.thread.threadTest3;

/**
 * 写线程
 * @author yingkuigou
 * @date 2020/2/9 23:44
 */
public class WriteThread extends Thread {

    private volatile Boolean ready;

    private volatile Integer num;

    @Override
    public void run() {
        ready = true;
        num = 2;
        System.out.println("write thread over.....");
    }

    public WriteThread(Boolean ready, Integer num) {
        this.ready = ready;
        this.num = num;
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
