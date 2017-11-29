package com.gertent.d18_command.base_18;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/29
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
