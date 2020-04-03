package com.gertent.d01_factory.base_01;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
