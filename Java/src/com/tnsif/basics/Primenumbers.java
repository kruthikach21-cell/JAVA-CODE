package com.tnsif.basics;

public class Primenumbers {



	public static void main(String[] args) {
		System.out.println("The prime numbers from 1to100 are:");
		for (int num = 2; num <= 100; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }

	}

}


