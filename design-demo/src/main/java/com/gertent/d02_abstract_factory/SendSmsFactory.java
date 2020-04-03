package com.gertent.d02_abstract_factory;

import com.gertent.d02_abstract_factory.base_02.Sender;
import com.gertent.d02_abstract_factory.base_02.SmsSender;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
