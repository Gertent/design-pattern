package com.gertent.d13_strategy.base_13;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public abstract class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
