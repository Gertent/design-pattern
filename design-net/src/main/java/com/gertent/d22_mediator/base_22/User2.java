package com.gertent.d22_mediator.base_22;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
