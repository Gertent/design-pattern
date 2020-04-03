package com.gertent.d06_adapter;

import com.gertent.d06_adapter.base.Source;
import com.gertent.d06_adapter.base.Targetable;

/**
 * @Description 类的适配器模式,有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * @Author wyf
 * @Date 2017/11/27
 */
public class Adapter_01 extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
