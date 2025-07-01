package org.stringmethods;

public class StringLiteral {

	public static void main(String[] args) {
		String s="session";
		String s1="session";
		
		//literal string
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		//non literal string
		
		String s2=new String("Java");
		String s3=new String("Java");
		
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
		

	}

}
