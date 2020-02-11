package mayiwork.thread.threadTest4;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport.park
 * @author yingkuigou
 * @date 2020/2/10 22:03
 */
public class TestPark {

    public void testPark() {
        LockSupport.park(this);
    }

    public static void main(String[] args) {
        TestPark testPark = new TestPark();
        testPark.testPark();
    }
}

