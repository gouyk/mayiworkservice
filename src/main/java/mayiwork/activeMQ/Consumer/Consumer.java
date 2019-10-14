package mayiwork.activeMQ.Consumer;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import mayiwork.activeMQ.Mqconnection;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 16:26
 * @Version 1.0
 */
public class Consumer implements MessageListener {

    private void consume() {
        Connection connection = null;
        Session session = null;
        MessageConsumer consumer = null;

        try {
            connection = Mqconnection.getConnection();
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("mayiworkFirstTopic");
            consumer = session.createConsumer(destination);
            //异步消费消息：实现接口MessageListener，注册监听器 consumer.setMessageListener(this); //(异步接收) ，实现 onMessage方法
            //consumer.setMessageListener(this);
            recived(consumer, session);//同步消息处理

        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            //异步的时候去掉关闭资源的代码
            Mqconnection.close(null, consumer, session, connection);
        }

    }

    /**
     * 异步消费消息：适用于执行时间长的任务，上下文切换不会太频繁，同步则容易被堵塞
     */
    public void onMessage(Message message) {
        try {
            if (message != null) {
                TextMessage textMessage = (TextMessage) message;
                System.out.println(textMessage.getText());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    /**
     * 同步消费消息：适用于执行时间短的任务，这样即使是同步，线程也不容易被堵塞
     * @param consumer
     * @param session
     */
    private void recived(MessageConsumer consumer, Session session) {

        try {
            while (true) {
                //同步消费，两秒钟一次返回，如果recive方法不带参数，则会一直阻塞到消息到达
                TextMessage textMessage = (TextMessage) consumer.receive(2000);
                if (textMessage != null) {
                    System.out.println("I consume a message" + textMessage.getText());
                }
                session.commit();
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume();
    }
}
