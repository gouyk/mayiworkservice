package mayiwork.activeMQ.Listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.listener.SessionAwareMessageListener;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 18:58
 * @Version 1.0
 */
public class MessageQueueListener implements SessionAwareMessageListener<Message> {

    public void onMessage(Message message, Session session) throws JMSException {
        if (message instanceof TextMessage) {
            System.out.println("consumer message：---" + ((TextMessage) message).getText());
        }
    }
}
