package com.gertent.d02_abstract_factory;

import com.gertent.d02_abstract_factory.base_02.Sender;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
