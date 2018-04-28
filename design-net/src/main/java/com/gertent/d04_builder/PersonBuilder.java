package com.gertent.d04_builder;

/**
 * @version V1.0
 * @author: Wangyunfu
 * @description:
 * @date: 2018/4/28
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();//组装
}
