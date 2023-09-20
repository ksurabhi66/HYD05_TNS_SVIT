package com.svit.dayseven.finall;

public class FinalVariable {
    final int speedlimit; // constant

    public FinalVariable() {
        speedlimit = 90; // Initialize the final variable in the constructor
    }

    void run() {
        // You cannot modify a final variable, so remove the assignment here
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        // obj.run(); // You can call run(), but it won't change the final variable.
    }
}
