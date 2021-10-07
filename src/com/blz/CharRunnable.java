package com.blz;

public class CharRunnable implements Runnable{
   static  char ch;
	public boolean A = false;
	
	@Override
	public void run() {
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			if(ch !='Z') {
		 System.out.println(ch);
	}else {
		A = true;
		System.out.println(ch);
	  }
    }      
 }
}
