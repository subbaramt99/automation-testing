package org.looping;

public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {   //1  2  3  4  5    6  7  8  9  10
			if(i==6) {
				System.out.println(" ");
			continue;
			}
			System.out.println(i);
		}

	}

}
