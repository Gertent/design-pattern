package com.gertent.d22_mediator.base_22;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/30
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
