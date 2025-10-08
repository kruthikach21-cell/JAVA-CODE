package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Collections;

public class CompDemo {
    public static void main(String[] args) {
        ArrayList<Comp> li = new ArrayList<>();

        li.add(new Comp("Dell", 44000, 15));
        li.add(new Comp("HP", 42000, 16));
        li.add(new Comp("Asus", 40000, 17));

        Collections.sort(li);

        for (Comp c : li) {
            System.out.println(c);
        }
    }
}
