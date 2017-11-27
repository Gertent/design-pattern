package com.gertent.d06_adapter;

import com.gertent.d06_adapter.base.Source;
import com.gertent.d06_adapter.base.Sourceable;
import com.gertent.d06_adapter.base.Targetable;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/27
 */
public class AdapterTest {

    public static void main(String[] args) {
//        //类适配器
//        Targetable target = new Adapter_01();
//        target.method1();
//        target.method2();
//
//        //对象适配器
//        Source source = new Source();
//        Targetable target2 = new Adapter_02(source);
//        target2.method1();
//        target2.method2();

        //接口适配器
        Sourceable sub1 = new SourceSub1();
        Sourceable sub2 = new SourceSub2();

        sub1.method1();
        sub1.method2();
        sub2.method1();
        sub2.method2();

    }

}
