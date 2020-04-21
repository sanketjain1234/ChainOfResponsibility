package com.sanket.designPattern.Processor;

public interface DispenserProcessor {

    void doProcess(int amount);
    void doNothing();
    void setNextProcessor(DispenserProcessor processor);
    DispenserProcessor getNextProcessor();
}
