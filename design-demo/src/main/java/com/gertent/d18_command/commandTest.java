package com.gertent.d18_command;

import com.gertent.d18_command.base_18.Command;
import com.gertent.d18_command.base_18.Invoker;
import com.gertent.d18_command.base_18.MyCommand;
import com.gertent.d18_command.base_18.Receiver;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class commandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();

    }
}
