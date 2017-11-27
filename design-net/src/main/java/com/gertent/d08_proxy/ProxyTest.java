package com.gertent.d08_proxy;

import com.gertent.d08_proxy.base_08.Sourceable;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/27
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
