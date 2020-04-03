package com.gertent.d21_visitor.base_21;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
