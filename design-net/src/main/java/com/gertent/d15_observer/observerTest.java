package com.gertent.d15_observer;

import com.gertent.d15_observer.base_15.MySubject;
import com.gertent.d15_observer.base_15.Observer1;
import com.gertent.d15_observer.base_15.Observer2;
import com.gertent.d15_observer.base_15.Subject;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class observerTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
