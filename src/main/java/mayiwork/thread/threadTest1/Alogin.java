package mayiwork.thread.threadTest1;

/**
 * @author yingkuigou
 * @date 2019/11/24 22:55
 */
public class Alogin extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(currentThread().getName() + "--" + isAlive());
        LoginServlet.dopost("a", "aa");
    }
}
