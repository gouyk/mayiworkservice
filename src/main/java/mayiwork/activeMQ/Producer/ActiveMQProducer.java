package mayiwork.activeMQ.Producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 19:11
 * @Version 1.0
 */
@Service("activeMQProducer")
public class ActiveMQProducer {

    private JmsTemplate jmsTemplate;

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    @Autowired
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(final String info) {
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(info);
            }
        });
    }

}
