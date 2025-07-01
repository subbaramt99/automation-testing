package org.stringmethods;

public class StringMethods {

	public static void main(String[] args) {
		String str="Welcome Java";  	//W e l c o m e   J a  v a
		String str1="welcome java";		//0 1 2 3 4 5 6 7 8 9 10 11
		
		//index of
		int indexOf = str.indexOf('m');
		System.out.println(indexOf);
		
		//last index of
		int lastIndexOf = str.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		//length
		int length = str.length();
		System.out.println(length);
		
		//uppercase
		String upperCase = str1.toUpperCase();
		System.out.println(upperCase);
		
		//lowercase
		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase);
		
		//equals
		boolean equals = str.equals(str1);
		System.out.println(equals);
		
		//equals ignore case
		boolean equalsIgnoreCase = str.equalsIgnoreCase(str1);
		System.out.println(equalsIgnoreCase);
		
		//charAt
		char charAt = str.charAt(11);
		System.out.println(charAt);
		
		//StartsWith
		boolean startsWith = str.startsWith("come");
		System.out.println(startsWith);
		
		//endsWith
		boolean endsWith = str.endsWith("ava");
		System.out.println(endsWith);
		
		//concadination
		String concat = str.concat(str1);
		System.out.println(concat);
		
		//contains
		boolean contains = str.contains("Java");
		System.out.println(contains);
		
		//substring
		String substring = str.substring(3);
		System.out.println(substring);
		
		String substring2 = str.substring(3, 9);
		System.out.println(substring2);
		
		//replace
		String replace = str.replace("Java", "Session");
		System.out.println(replace);
		
		//is empty
		boolean empty = str.isEmpty();
		System.out.println(empty);

	}

}
