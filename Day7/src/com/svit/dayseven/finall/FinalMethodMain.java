package com.svit.dayseven.finall;

public class FinalMethodMain extends FinalMethod1 {
    void myRun() {
        System.out.println("Running safely with 100kmph");
    }

    public static void main(String[] args) {
        FinalMethodMain f1 = new FinalMethodMain();
        f1.myRun(); // Call the new method instead of run()
    }
}
