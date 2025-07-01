package org.stringmethods;

public class Mutable {

	public static void main(String[] args) {
		String s="raju";
		String s1="bhai";
		
		//immutable string
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		String concat = s.concat(s1);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		
		//to change immutable to mutable
		
		StringBuffer sb=new StringBuffer("Smirti");
		StringBuffer sb1=new StringBuffer("mandhana");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		
		StringBuffer append = sb.append(sb1);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));

	}

}
