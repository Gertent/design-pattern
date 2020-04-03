package com.gertent.d14_template;

import com.gertent.d14_template.base_14.AbstractCalculator;
import com.gertent.d14_template.base_14.Plus;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class templateTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
