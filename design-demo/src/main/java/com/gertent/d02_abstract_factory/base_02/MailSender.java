package com.gertent.d02_abstract_factory.base_02;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
