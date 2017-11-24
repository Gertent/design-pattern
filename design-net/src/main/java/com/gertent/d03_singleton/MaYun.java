package com.gertent.d03_singleton;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/24
 */
public enum MaYun {
    himself; //定义一个枚举的元素，就代表MaYun的一个实例
    private String anotherField;
    MaYun() {
    //MaYun诞生要做的事情
    //这个方法也可以去掉。将构造时候需要做的事情放在instance赋值的时候：
    /** himself = MaYun() {
     * //MaYun诞生要做的事情
     * }
     **/
    }
    public String splitAlipay() {
        System.out.println("Alipay是我的啦！看你丫Yahoo绿眉绿眼的望着。。。");
        return "hello";
    }
}
//Call：MaYun.himself.splitAlipay();
