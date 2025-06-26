package org.datatypes;

import org.child.Father;

public class Child1 extends Father{
	public void child1() {
		int i=1000;
		System.out.println("Child1 "+i);
	}

	public static void main(String[] args) {
		Child1 ch1=new Child1();
		ch1.child1();
		ch1.father();
		ch1.grand();

	}

}
