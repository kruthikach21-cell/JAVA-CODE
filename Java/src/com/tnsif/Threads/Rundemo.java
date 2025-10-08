package com.tnsif.Threads;

public class Rundemo {
	public static void main(String[] args) {
		Runnableinterface rn=new Runnableinterface();
		Thread t1=new Thread(rn);
		t1.start();

	}
}
