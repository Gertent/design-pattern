package com.gertent.d21_visitor.base_21;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
