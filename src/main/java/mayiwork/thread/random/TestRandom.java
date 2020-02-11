package mayiwork.thread.random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * testRandom
 * @author yingkuigou
 * @date 2020/2/9 16:46
 */
public class TestRandom {

    public static void main(String[] args) {

        //Random random = new Random();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 1; i <= 5; i++) {
            System.out.println(random.nextInt(5));
        }
    }

}
