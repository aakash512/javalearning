//Task - write a program to print student details by create external class and using object 

package com.javalearning;

class Student {
	static String collegename; // for every one college name is same so that why i am using a static variable
	/// for every student name , id number , marks are different so thats why i am
	/// using instance variables here
	String name;
	int idNumber;
	int marks;

}

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student(); // when we create a object for a class then it will call the constructor
		Student.collegename = "Aa";/// as college name is static variable i can call it just by using the class name . variable name
		a.name = "mahesh";
		a.idNumber = 420;
		a.marks = 100;
		System.out.println(a.name + " Details");
		System.out.println("Name of the student : " + a.name + " idNumbers : " + a.idNumber + " markss : " + a.marks+" collegename : "+Student.collegename);
		Student b = new Student(); // when we create a object for a class then it will call the constructor
		b.name = "aa";
		b.idNumber = 520;
		b.marks = 99;
		System.out.println(b.name + " Details");
		System.out.println("Name of the student : " + b.name + " idNumbers : " + b.idNumber + " markss : " + b.marks + " collegename : " + Student.collegename);
	}

}
