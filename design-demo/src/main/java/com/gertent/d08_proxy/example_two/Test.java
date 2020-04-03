package com.gertent.d08_proxy.example_two;

/**
 * Created by wangyunfu on 2020/4/3.
 */
public class Test {

    public static void main(String[] args) {
        Person instance = (Person) new JDKMeipo().getInstance(new Customer());
        instance.findLove();
    }
}
