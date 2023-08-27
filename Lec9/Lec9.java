package Lec9;

import java.util.Scanner;

public class Lec9 {
    
	public static void main(String[] args) {
		System.out.println("Main is Start");
		addtwoNumber();
		Sub();
		System.out.println("Main is end");	
	}
	
	public static void addtwoNumber() {
		System.out.println("addtwoNumber is start");
		int a=12;
		int b=13;
		int c=a+b;
		System.out.println(c);
		
		System.out.println("addtwoNumber is End");
	
	}
	
	public static void Sub() {
		System.out.println("Sub is Start");
		int a=12;
		int b=13;
		int c= a-b;
		System.out.println(c);
		System.out.println("Sub is End");
	}

}
