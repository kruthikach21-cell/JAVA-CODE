package com.tnsif.keywords;



class Counter {
   
    static int count = 0;

    
    Counter() {
        count++;
    }

    
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class Statickeyword {
    public static void main(String[] args) {
       
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.displayCount();
    }
}


