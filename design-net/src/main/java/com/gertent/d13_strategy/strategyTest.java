package com.gertent.d13_strategy;

import com.gertent.d13_strategy.base_13.ICalculator;
import com.gertent.d13_strategy.base_13.Plus;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class strategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
