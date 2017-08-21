package com.maxtrain;

public class JavaTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		string type 
		String name = "Java";
		int len = name.length();
		System.out.println("The length of name is " + len);
//		string nameUpperCase = name.toUpperCase();
		System.out.println("The length of " + name.toUpperCase() + " is " +  name.length());
//	names can be the same, brackets makes it different. indexOf('A')- single character, indexOf("student")-string,
//	indexOf('A', 5)- character, integer.			
//		Number types;
		int anInteger = 0;  /*only numbers without decimals*/
		long aVeryBigInteger = 0;/*when numbers are bigger than integer limit*/
		short aSmallerInteger = 0;/*when numbers are smaller in range. not used often*/
//		Number types with decimals
		float aFloat = 0.0f;
		double aDouble = 0.0;
//		Boolean type true or false
	   Boolean aBoolean = true; /*true or false*/
//	   character : holds single character and uses single quotes
	   char c = 'A';
//	   Types of Types --- scalar and reference.  in scalar you cannot set value to say null. int i = null is not allowed, rather int i; is correct.
//	   In reference you can set to null eg string = null. javaTypes jt = new JavaTypes(); jt=null.
//	   all the about is scalar except string which is reference.
		

	}

}
