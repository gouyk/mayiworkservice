package mayiwork.activeMQ.Producer;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import mayiwork.activeMQ.Mqconnection;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 16:02
 * @Version 1.0
 */
public class Producer {

    Connection connection = Mqconnection.getConnection();

    Session session = null;

    MessageProducer producer = null;

    /**
     * 生产消息
     */

    public void produce() {

        try {
            connection.start();
            /**
             * false:不支持事物，true:支持事物
             * 一、事物性会话中，事物提交的时候消息被确认
             * 二、非事务性回话中,消息何时被确认分三种情况：
             * 1、Session.AUTO_ACKNOWLEDGE：客户成功的从receive方法返回或者从 MessageListener.onMessage方法成功返回的时候， 会话自动确认
             * 2、Session.CLIENT_ACKNOWLEDGE：客户通过消息的 acknowledge 方法确认.在这种模式中，确认是在会话层上进行的，确认一个被消费的消息将自动确认所有已被会话消费的消息
             * 3、Session.DUPS_ACKNOWLEDGE：该选择只是会话迟钝第确认消息的提交。如果JMS provider 失败，那么可能会导致一些重复的消息
             */
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            //消息队列
            Destination destination = session.createQueue("mayiworkFirstTopic");
            producer = session.createProducer(destination);
            /**
             * PERSISTENT:消息持久化,默认消息持久，优点保证消息不丢失
             * NON_PERSISTENT：非持久化：优点性能更强
             */
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            sendMessage(producer, session);

        } catch (JMSException e) {
            e.printStackTrace();
        }finally {
            Mqconnection.close(producer,null,session,connection);
        }

    }

    private void sendMessage(MessageProducer producer, Session session) throws JMSException {
        String message = "I am a message producer";
        TextMessage textMessage = session.createTextMessage();
        textMessage.setText(message);
        producer.send(textMessage);
        session.commit();
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.produce();
    }

}
