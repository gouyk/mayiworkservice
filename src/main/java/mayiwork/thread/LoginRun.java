package mayiwork.thread;

/**
 * @author yingkuigou
 * @date 2019/11/24 22:57
 */
public class LoginRun {

    public static void main(String[] args) {
        Alogin alogin = new Alogin();
        System.out.println("alogin start " + alogin.isAlive());
        alogin.start();
        System.out.println("alogin end " + alogin.isAlive());
        BLogin bLogin = new BLogin();
        bLogin.start();
    }
}
