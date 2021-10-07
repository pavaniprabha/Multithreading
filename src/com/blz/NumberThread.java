package com.blz;

public class NumberThread extends Thread{
   CharRunnable charRunnable;
   NumberThread(CharRunnable charRunnable) {
	   this.charRunnable=charRunnable;
   }
	@Override
	public void run() {
		for(int i = 0; i <= 100; i++) {
			if(CharRunnable.ch != 'Z') {
				System.out.println(i);	
			}
			else {
				break;
			}
		}
	}
}
