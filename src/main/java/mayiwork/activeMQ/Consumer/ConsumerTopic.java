package mayiwork.activeMQ.Consumer;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import mayiwork.activeMQ.Mqconnection;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 16:26
 * @Version 1.0
 */
public class ConsumerTopic {

    //持久订阅，客户端id设置成唯一
    private String clientId = "durableClient";

    private void consume() {
        Connection connection = null;
        Session session = null;
        MessageConsumer consumer = null;

        try {
            connection = Mqconnection.getConnection();
            connection.setClientID(clientId);
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createTopic("mayiworkFirstTopic");
            //持久性订阅需设置消费者名称
            consumer = session.createDurableSubscriber((Topic) destination, clientId);
            //非持久订阅
            //consumer = session.createConsumer(destination);
            recived(consumer, session);//同步消息处理

        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            Mqconnection.close(null, consumer, session, connection);
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
                //session.commit();
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ConsumerTopic consumer = new ConsumerTopic();
        consumer.consume();
    }
}
