package com.tnsif.collections;
public class Comp implements Comparable<Comp> {
    private String brand;
    private int price;
    private int ram;

    public Comp(String brand, int price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compareTo(Comp c) {
        // Sort by price (ascending)
        if (this.price > c.price)
            return 1;
        else if (this.price < c.price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Comp [Brand = " + brand + ", Price = " + price + ", RAM = " + ram + "]";
    }
}
