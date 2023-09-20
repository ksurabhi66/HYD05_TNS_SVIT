package com.svit.dayseven.multipleinheritance;
public class MultipleLanguage extends MultipleFrontend implements MultipleBackend {

    String language = "Java";

    // Implement method of interface
    public void connectServer() {
        System.out.println(language + " can be used as backend language.");
    }

    public static void main(String[] args) {

        // Create an object of MultipleLanguage class
        MultipleLanguage java = new MultipleLanguage();

        java.connectServer();
        
        // Call the inherited method of MultipleFrontend class
        java.frontendMethod(java.language);
    }
}

