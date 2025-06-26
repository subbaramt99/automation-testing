package org.datatypes;

import org.child.Father;

public class Child2 extends Father{

	public void child2() {
		int i=1000;
		System.out.println("Child2 "+i);
	}

	public static void main(String[] args) {
		Child2 ch2=new Child2();
		ch2.child2();
		ch2.father();
		ch2.grand();
	}

}
