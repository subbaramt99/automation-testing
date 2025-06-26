package org.inherit;

public class Child extends Single{
	public void son() {
		int in=1000;
		System.out.println("Child Property "+in);
	}
	public static void main(String[] args) {
		Child ch=new Child();
		ch.parent();
		ch.son();
	}

}
