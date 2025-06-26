package org.child;

import org.example.Parent1;

public class Child2 extends Parent1{
	public void child2() {
		int i=3000;
		System.out.println("Child2 Property "+i);
	}

	public static void main(String[] args) {
		Child2 ch2=new Child2();
		ch2.child2();
		ch2.parent1();

	}

}
