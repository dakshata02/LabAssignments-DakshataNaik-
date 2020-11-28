package com.capgemini.training.lab8.exe2;



public class TesterTimer {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable=new Timer();
		Thread t1=new Thread(runnable,"worker-1");
		t1.start();
	///	t1.sleep(100000);
		//t1.start();

	}

}
