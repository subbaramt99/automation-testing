package org.datatypes;

public class ReturnStatement {
	public int buysoap(int money) {
		int soap=30;
		int balance=money-soap;
		return balance;
	}

	public static void main(String[] args) {
		ReturnStatement returns=new ReturnStatement();
		int remaining=returns.buysoap(100);
		System.out.println(remaining);

	}

}
