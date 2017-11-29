package com.gertent.d13_strategy.base_13;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }

}
