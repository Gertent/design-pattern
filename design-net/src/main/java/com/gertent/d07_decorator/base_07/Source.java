package com.gertent.d07_decorator.base_07;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/27
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
