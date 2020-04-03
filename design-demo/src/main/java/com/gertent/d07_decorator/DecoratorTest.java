package com.gertent.d07_decorator;

import com.gertent.d07_decorator.base_07.Source;
import com.gertent.d07_decorator.base_07.Sourceable;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/27
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
