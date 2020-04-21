package com.sanket.designPattern.Handler;

import com.sanket.designPattern.Processor.DispenserProcessor;
import com.sanket.designPattern.Processor.FiveHundredDispenserProcessor;
import com.sanket.designPattern.Processor.OneHundredDispenserProcessor;
import com.sanket.designPattern.Processor.TwoThousandDispenserProcessor;

public class DispenserHandler {

    DispenserProcessor dispenserProcessor;
    public DispenserHandler(){
        dispenserProcessor = new TwoThousandDispenserProcessor();
        DispenserProcessor secondProcessor = new FiveHundredDispenserProcessor();
        DispenserProcessor thirdProcessor = new OneHundredDispenserProcessor();

        secondProcessor.setNextProcessor(thirdProcessor);

        dispenserProcessor.setNextProcessor(secondProcessor);
    }

    public void handleRequest(int amount) {
        if (amount%100 !=0){
            System.out.println("Invalid Amount");
            return;
        }

        dispenserProcessor.doProcess(amount);
    }

}
