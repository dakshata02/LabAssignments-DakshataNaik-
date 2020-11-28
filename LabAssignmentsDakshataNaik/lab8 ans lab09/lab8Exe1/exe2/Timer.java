package com.capgemini.training.lab8.exe2;

import java.time.LocalDateTime;

public class Timer implements Runnable{

	@Override
	public void run() {
		 
	        for(int i=0;i<1000000;i++) {
	        	try {
	        		System.out.println(Thread.currentThread().getName()+" running :"+LocalDateTime.now());
					Thread.sleep(10000);
					System.out.println(Thread.currentThread().getName()+" running :"+LocalDateTime.now());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	                       
	        }
	        System.out.println(Thread.currentThread().getName()+" end at :"+LocalDateTime.now());

	 

	    }

		
		
	}

	


