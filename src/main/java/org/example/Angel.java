package org.example;

public class Angel extends Hero implements Printable {
    private int wings;

    public Angel(int health, int wings) {
        super(health);
        this.wings = wings;
    }

    @Override
    public void print() {
        System.out.println("Angels health: " + getHealth()+
                "\nAngels wings: " + wings);

    }
}
