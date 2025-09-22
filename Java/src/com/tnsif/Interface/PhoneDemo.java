package com.tnsif.Interface;
 interface Phone {
	void call();
	void sms();
}
 class Jio implements Phone {
	   
    public void call() {
        System.out.println("Call using Jio SIM");
    }

    public void sms() {
        System.out.println("SMS using Jio SIM");
    }
}
 class Samsung implements Phone {
    public void call() {
        System.out.println("Call using Samsung phone");
    }
    public void sms() {
        System.out.println("SMS using Samsung phone");
    }
}
public class PhoneDemo {
	  public static void main(String[] args) {
	        Phone jioSim = new Jio();
	        Phone samsungPhone = new Samsung();
	        jioSim.call();
	        jioSim.sms();
	        samsungPhone.call();
	        samsungPhone.sms();
	    }
	}
