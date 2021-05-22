package com.javapractice;

public class ChildClass extends ParentClass {
	public void myMethod() {
		System.out.println("I am a method from Child Class");
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.myMethod();
		ParentClass parentClass = new ParentClass();
		parentClass.myMethod();

		/*
		 * Type mismatch: cannot convert from ParentClass to ChildClass
		 *  ChildClass childClass2 = new ParentClass(); 
		 *  childClass2.myMethod();
		 */

		ParentClass parentClass2 = new ChildClass();
		parentClass2.myMethod();

	}
}
