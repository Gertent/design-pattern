package com.gertent.d20_state;

import com.gertent.d20_state.base_20.Context;
import com.gertent.d20_state.base_20.State;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class stateTest {
    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
