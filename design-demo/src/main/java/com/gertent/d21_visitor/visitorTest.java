package com.gertent.d21_visitor;

import com.gertent.d21_visitor.base_21.MySubject;
import com.gertent.d21_visitor.base_21.MyVisitor;
import com.gertent.d21_visitor.base_21.Subject;
import com.gertent.d21_visitor.base_21.Visitor;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public class visitorTest {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}
