package com.gertent.d15_observer.base_15;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
