package mayiwork.thread.threadTest2;

import java.util.Objects;

/**
 * 实现runnable的方式实现 线程
 * @author yingkuigou
 * @date 2020/1/31 17:57
 */
public class RunnableTask implements Runnable {

    private String mes;

    public RunnableTask(String mes) {
        this.mes = mes;
    }

    @Override
    public void run() {
        if (Objects.isNull(mes)) {
            System.out.println("this is runnable thread " + Thread.currentThread().getName());
        }
        else {
            System.out.println("this is runnable thread " + mes + Thread.currentThread().getName());
        }
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
