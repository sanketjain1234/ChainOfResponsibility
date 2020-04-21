package com.sanket.designPattern.Processor;

public class TwoThousandDispenserProcessor implements DispenserProcessor {

    private static int VALUE_OF_DISPENSER = 2000;

    private DispenserProcessor nextProcessor;

    @Override
    public DispenserProcessor getNextProcessor() {
        return nextProcessor;
    }

    @Override
    public void setNextProcessor(DispenserProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }


    @Override
    public void doProcess(int amount) {

        System.out.println("In TwoThousandDispenserProcessor,");
        int countOfCurrency = amount / VALUE_OF_DISPENSER;
        if (countOfCurrency > 0) {
            System.out.println("Dispensed " + countOfCurrency + " notes of currency with value :" + countOfCurrency * VALUE_OF_DISPENSER);
            amount -= countOfCurrency * VALUE_OF_DISPENSER;
        } else {
            System.out.println("skipping");
        }
        if (nextProcessor != null) {
            nextProcessor.doProcess(amount);
        } else {
            doNothing();
        }

    }

    @Override
    public void doNothing() {

    }
}
