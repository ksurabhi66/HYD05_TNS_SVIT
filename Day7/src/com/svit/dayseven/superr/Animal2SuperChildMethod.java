package com.svit.dayseven.superr;
public class Animal2SuperChildMethod extends Animal2SuperParentMetho {

    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat(); // Calls the eat() method from the parent class
        bark();      // Calls the bark() method from this class
        eat();       // Calls the eat() method from this class
    }

    public static void main(String[] args) {
        Animal2SuperChildMethod a1 = new Animal2SuperChildMethod();
        a1.work();
    }
}
