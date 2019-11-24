package mayiwork.thread;

/**
 * @author yingkuigou
 * @date 2019/11/24 22:56
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        super.run();
        LoginServlet.dopost("b", "bb");
    }
}
