package com.gertent.d03_singleton;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public enum SingletonEnum {
    INSTANCE;
    Object object;
    SingletonEnum() {
        object = new Object();
    }

    public Object getInstance(){
        return object;
    }

}
