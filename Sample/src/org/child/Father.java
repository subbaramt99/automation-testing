package org.child;

public class Father extends Grand{
	public void father() {
		int in=3000;
		System.out.println("Father "+in);
	}

	public static void main(String[] args) {
		Father f=new Father();
		f.grand();
		f.father();

	}

}
