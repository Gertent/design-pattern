package com.gertent.d02_abstract_factory;

import com.gertent.d02_abstract_factory.base_02.Sender;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public interface Provider {
    public Sender produce();
}
