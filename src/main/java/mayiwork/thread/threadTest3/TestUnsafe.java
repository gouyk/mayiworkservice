package mayiwork.thread.threadTest3;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 体验一下unsafe类
 * @author yingkuigou
 * @date 2020/2/9 23:06
 */
public class TestUnsafe {

    static Unsafe unsafe;

    static Long stateOffSet;

    private volatile Long state = 0L;

    static {
        //使用反射获取unsafe的成员变量thesafe
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            //设置内容为可存取
            field.setAccessible(true);
            //获取该变量的值
            unsafe = (Unsafe) field.get(null);
            //获取state在testunsafe中的偏移量
            stateOffSet = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
            System.out.println(stateOffSet);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestUnsafe testUnsafe = new TestUnsafe();
        boolean success = unsafe.compareAndSwapInt(testUnsafe, stateOffSet, 0, 2);
        System.out.println(success);
    }

}
