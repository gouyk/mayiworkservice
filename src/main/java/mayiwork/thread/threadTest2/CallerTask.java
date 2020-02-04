package mayiwork.thread.threadTest2;

import java.util.concurrent.Callable;

/**
 * 创建带返回值的线程
 * @author yingkuigou
 * @date 2020/1/31 18:18
 */
public class CallerTask implements Callable<String> {

    private String msg;

    public CallerTask(String msg) {
        this.msg = msg;
    }

    @Override
    public String call() throws Exception {
        return msg;
    }
}
