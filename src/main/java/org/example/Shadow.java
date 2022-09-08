package org.example;

public class Shadow extends Hero implements Printable{
    private int propagationArea;

    public Shadow(int health, int propagationArea) {
        super(health);
        this.propagationArea = propagationArea;
    }

    @Override
    public void print() {
        System.out.println( "Shadows health: "+ getHealth()+
                "\nPropagation Area of shadow: " +propagationArea );

    }
}
