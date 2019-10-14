package mayiwork.activeMQ;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @Author: gouyingkui
 * @Date: 2018/9/17 15:43
 * @Version 1.0
 */
public class Mqconnection {

    private static ConnectionFactory connectionFactory = null;

    private static void initConnectFactory() {
        /**
         *  failover:activitymq断线重连
         *  randomize：true-随机连接，可以有效地控制客户端在多个broker上的负载均衡。false-首先连接到主节点，并在主节点不可用时只连接到辅助备份代理
         *  priorityBackup=true:指定本地broker
         *  以上配置例子，客户端将尝试连接并保持连接到本地broker。 如果本地broker失败，它当然会故障转移到远程。
         *  但是，由于使用priorityBackup参数，客户端将不断尝试重新连接到本地。 一旦客户端可以这样做，客户端将重新连接到它，而不需要任何手动干预
         */
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://47.93.54.199:61616");

    }

    public static Connection getConnection() {

        if (connectionFactory == null) {
            initConnectFactory();
        }
        try {
            Connection connection = connectionFactory.createConnection();
            return connection;
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭源
     * @param producer
     * @param consumer
     * @param session
     * @param connection
     */

    public static void close(MessageProducer producer, MessageConsumer consumer, Session session,
            Connection connection) {
        try {
            if (producer != null) {
                producer.close();
            }
            if (consumer != null) {
                consumer.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

}
