package com.blz;

public class MainClass {
 
	public static void main(String[] args) {
	
	NumberThread numberThread = new NumberThread(null);
//	numberThread.setDaemon(true);
	CharRunnable charRunnable = new CharRunnable();
	Thread CharThread = new Thread(charRunnable);
	
	numberThread.start();
	CharThread.start();
	}

}
