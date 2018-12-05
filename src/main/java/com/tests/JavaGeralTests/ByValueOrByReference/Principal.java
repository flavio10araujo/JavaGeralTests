package com.tests.JavaGeralTests.ByValueOrByReference;

public class Principal {

	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    // we pass the object to foo
	    foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println("C:" + aDog.getName().equals("Max")); // true
	    System.out.println("D:" + aDog.getName().equals("Fifi")); // false 
	}

	public static void foo(Dog d) {
	    System.out.println("A:" + d.getName().equals("Max")); // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    System.out.println("B:" + d.getName().equals("Fifi")); // true
	}
}