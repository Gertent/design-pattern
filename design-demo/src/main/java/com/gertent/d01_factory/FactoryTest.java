package com.gertent.d01_factory;

import com.gertent.d01_factory.base_01.Sender;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory_01 factory = new SendFactory_01();
        Sender sender01 = factory.produce("sms");
        sender01.Send();

        SendFactory_02 sendFactory_02=new SendFactory_02();
        Sender sender02 = sendFactory_02.produceSms();
        sender02.Send();

        Sender sender03 = SendFactory_03.produceMail();
        sender03.Send();
    }
}
