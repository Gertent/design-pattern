package com.gertent.d18_command.base_18;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
