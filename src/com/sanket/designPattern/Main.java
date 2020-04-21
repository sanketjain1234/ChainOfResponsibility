package com.sanket.designPattern;

import com.sanket.designPattern.Handler.DispenserHandler;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DispenserHandler handler = new DispenserHandler();
        handler.handleRequest(2500);

        handler.handleRequest(2750);

        handler.handleRequest(2800);
    }
}
