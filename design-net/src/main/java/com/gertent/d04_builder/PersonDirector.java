package com.gertent.d04_builder;

/**
 * @version V1.0
 * @author: Wangyunfu
 * @description:
 * @date: 2018/4/28
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        //按照 身体--->头部--->四肢 的顺序创建人物
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
