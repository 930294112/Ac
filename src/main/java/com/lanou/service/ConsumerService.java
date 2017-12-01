package com.lanou.service;

/**
 * Created by dllo on 17/11/29.
 */

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * 消息消费者服务
 */
@Service
public class ConsumerService {
    @Resource
    private JmsTemplate jmsTemplate;

    public TextMessage receive(Destination destination){
        //jmsTemplate.getDefaultDestinationName();
        //jmsTemplate.getDefaultDestination();
        TextMessage textMessage= (TextMessage) jmsTemplate.receive(destination);
        if (textMessage!=null){
            try {
                System.out.println("接收到的消息内容是:" + textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
        return textMessage;
    }
}
