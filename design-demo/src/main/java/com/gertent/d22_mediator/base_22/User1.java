package com.gertent.d22_mediator.base_22;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
