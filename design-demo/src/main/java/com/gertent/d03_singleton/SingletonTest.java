package com.gertent.d03_singleton;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(MaYun.himself.splitAlipay());
        Object instance = SingletonEnum.INSTANCE.getInstance();
    }
}
