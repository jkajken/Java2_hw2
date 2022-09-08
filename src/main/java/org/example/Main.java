package org.example;

public class Main {
    public static void main(String[] args) {
        Printable[] printable = {createObject("Angel"), createObject("Shadow"),
                createObject("Flash")};
        for (Printable print : printable) {
            print.print();
        }
        
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Angel":
                return new Angel(250, 6);
            case "Shadow":
                return new Shadow(500, 25);
            case "Flash":
                return new Flash(300, 5);
        }
        return null;
    }
}