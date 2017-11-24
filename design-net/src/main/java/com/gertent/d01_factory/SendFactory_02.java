package com.gertent.d01_factory;

import com.gertent.d01_factory.base_01.MailSender;
import com.gertent.d01_factory.base_01.Sender;
import com.gertent.d01_factory.base_01.SmsSender;

/**
 *  多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
public class SendFactory_02 {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
