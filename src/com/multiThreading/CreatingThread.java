package com.multiThreading;

public class CreatingThread implements Runnable {
	
	//By Extending Thread Class
	public void run(){
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThread t1 = new CreatingThread();
		Thread tt1 = new Thread(t1);
		
		CreatingThread t2 = new CreatingThread();
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();
	}

}
