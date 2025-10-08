package com.tnsif.Threads;

public class Threadextends  extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

} 


