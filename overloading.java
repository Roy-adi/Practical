package com;

public class addition {

	 static int add(int a, int b){
		return(a+b);
		
	}
	 static int add(int a, int b, int c){
		 return (a+b+c);
	 }
	 class overloading{
		 public static void main (String args[]) {
			 System.out.println(addition.add(10, 12));
			 System.out.println(addition.add(15, 16,17));
		 }
	 }

}
