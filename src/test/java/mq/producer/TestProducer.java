package mq.producer;

import mayiwork.activeMQ.Producer.ActiveMQProducer;
import mq.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 19:16
 * @Version 1.0
 */
public class TestProducer extends BaseJunit4Test {

    @Autowired
    private ActiveMQProducer activeMQProducer;

    @Test
    public void send() {
        this.activeMQProducer.sendMessage("activemq and spring send message!");
    }

}
