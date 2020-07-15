package com.leetcode.practice;

public class ExceptionsExample {
	public static void main(String[] args) {
		ExceptionsExample.display();
		int x=5; int y=0;
		try {
			try {
				System.out.println(x/y);
			}
				catch (ArithmeticException e) {
					System.out.println("coming Inner1");
				
			} 
				catch (Exception e) {
					System.out.println("coming Inner2");
					
				}finally {
				System.out.println("coming here");
			}
			
		} catch (Exception e) {
			System.out.println("coming Outer");
			
		}
	}
	 static  {
		System.out.println("static");
	}
	 static void  display(){
			System.out.println("static");
		}

}
