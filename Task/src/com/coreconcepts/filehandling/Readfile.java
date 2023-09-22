package com.coreconcepts.filehandling;

import java.io.File;
import java.io.IOException;
public class Readfile {


	public static void main(String[] args) {
		try {
			
		      File myObj = new File("Demo3.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
			
		} catch (IOException e) {
			
			System.out.println("An error occurred.");
		    e.printStackTrace();
			
		}
	}

}
