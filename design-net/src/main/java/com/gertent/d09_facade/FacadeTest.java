package com.gertent.d09_facade;

/**
 * @Description
 * @Author wyf
 * @Date 2017/11/27
 */
public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
