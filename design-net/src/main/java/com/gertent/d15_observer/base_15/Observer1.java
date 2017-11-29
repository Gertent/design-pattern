package com.gertent.d15_observer.base_15;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
