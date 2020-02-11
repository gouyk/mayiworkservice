package mayiwork.thread.atomic;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author yingkuigou
 * @date 2020/2/9 21:48
 */
public class CopyList {

    private static volatile CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList();

    public static void main(String[] args) throws Exception {
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("babaa");
        arrayList.add("ajajaja");
        //arrayList.add("asdfas");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + "---" + arrayList.get(i));
        }

        Thread threadOne = new Thread(new Runnable() {

            @Override
            public void run() {
                arrayList.set(1, "hi");
                arrayList.remove(3);
                arrayList.remove(2);
            }
        });
        //在启动线程前先获取迭代器里的原始数据
        Iterator<String> itr = arrayList.iterator();
        //启动线程
        threadOne.start();
        //等待结束
        threadOne.join();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
