package com.gertent.d10_bridge;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/27
 */
public class MyBridge extends Bridge {

    @Override
    public void method(){
        getSource().method();
    }
}
