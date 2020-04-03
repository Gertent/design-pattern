package com.gertent.d21_visitor.base_21;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
