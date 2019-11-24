package mayiwork.thread;

/**
 * @author yingkuigou
 * @date 2019/11/24 22:50
 */
public class LoginServlet {

    private static String userNameRef;

    private static String passwordRef;

    synchronized public static void dopost(String username, String password) {

        try {
            userNameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username= " + userNameRef + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
