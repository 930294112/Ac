package com.lanou.service;

/**
 * Created by dllo on 17/11/29.
 */

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * 消息生产者服务类
 */
@Service
public class ProducerService {
    @Resource
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination,String msg){
        System.out.println("发送:" + msg + "到:" + destination);

        //消息生产器
        MessageCreator messageCreator = new MessageCreator() {
            @Override
            //内部类
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        };
        //发送信息
        jmsTemplate.send(destination,messageCreator);
    }

}
