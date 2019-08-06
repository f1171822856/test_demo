package com.itheima.provider;

import com.itheima.mail.SpringMailUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class ConsumerListener implements MessageListener {

    @Autowired
    private SpringMailUtils mailUtils;

    @Override
    public void onMessage(Message message) {
        MapMessage map = (MapMessage) message;
        try {
            String email = map.getString("email");
            String password = map.getString("password");
            String subject = map.getString("subject");
            String text = map.getString("text");
            mailUtils.sendMail(email, subject, text, password);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
