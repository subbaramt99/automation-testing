package org.multilevel;

public class Father extends GrandParent{
	public void father() {
		int in=2000;
		System.out.println("Father Property "+in);
	}

	public static void main(String[] args) {
		Father f=new Father();
		f.grandpha();
		f.father();

	}

}
