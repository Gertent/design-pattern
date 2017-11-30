package com.gertent.d22_mediator;

import com.gertent.d22_mediator.base_22.Mediator;
import com.gertent.d22_mediator.base_22.MyMediator;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public class mediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
