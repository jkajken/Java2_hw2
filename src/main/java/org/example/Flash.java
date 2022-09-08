package org.example;

public class Flash extends Hero implements Printable {
    private int speed;

    public Flash(int health, int speed) {
        super(health);
        this.speed = speed;
    }

    @Override
    public void print() {
        System.out.println( "Flashs health: "+ getHealth()+
                "\nSpeed per second: " + speed+ " km");


    }
}
