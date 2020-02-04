package mayiwork.thread.threadTest2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 主方法
 * @author yingkuigou
 * @date 2020/1/31 17:46
 */
public class TestMain {

    public static void main(String[] args) {
        //创建线程第一种方式，继承thread类
        TestThread testThread = new TestThread();
        testThread.start();
        //第二种方式，实现runnable接口
        String mes = "mes";
        RunnableTask runnableTask = new RunnableTask(mes);
        new Thread(runnableTask).start();
        new Thread(runnableTask).start();
        //第三种方式，使用futuretask 带有返回值
        //创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask("returnString"));
        //启动线程
        new Thread(futureTask).start();
        try {
            //等待执行结果
            String returnString = futureTask.get();
            System.out.println(returnString);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
