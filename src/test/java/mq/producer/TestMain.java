package mq.producer;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/18 14:42
 * @Version 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println((int)(Math.random()*99)) ;
        }
    }

}
