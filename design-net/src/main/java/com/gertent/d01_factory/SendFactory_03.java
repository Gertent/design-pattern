package com.gertent.d01_factory;

import com.gertent.d01_factory.base_01.MailSender;
import com.gertent.d01_factory.base_01.Sender;
import com.gertent.d01_factory.base_01.SmsSender;

/**
 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SendFactory_03 {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
