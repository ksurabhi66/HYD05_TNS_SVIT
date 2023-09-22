package com.coreconcepts.filehandling;


import java.io.File;
import java.io.IOException;
public class Createfile {

	
	public static void main(String[] args) {
		try {
			
		      File myObj= new File("Demo.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println(" Already exists.");
		      }
			
		} catch (IOException e) {
			
			System.out.println("An error occurred.");
		    e.printStackTrace();
			
		}
	}

}
