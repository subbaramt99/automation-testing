package org.child;

import org.example.Parent1;

public class Child1 extends Parent1{
	public void child1() {
		int in=1000;
		System.out.println("Child1 Property "+in);
	}

	public static void main(String[] args) {
		Child1 ch1=new Child1();
		ch1.child1();
		ch1.parent1();

	}

}
