package org.sample;

import org.multilevel.Father;

public class Child extends Father{
	public void child() {
		int i1=1000;
		System.out.println("Child Property "+i1);
	}

	public static void main(String[] args) {
		Child ch=new Child();
		ch.child();
		ch.father();
		ch.grandpha();

	}

}
