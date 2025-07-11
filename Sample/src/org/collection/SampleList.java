package org.collection;

import java.util.ArrayList;
import java.util.List;

public class SampleList {

	public static void main(String[] args) {
		List<Integer> in=new ArrayList<Integer>();
		
		in.add(3);
		in.add(1);
		in.add(5);
		in.add(1);
		in.add(2);
		in.add(4);
		
		System.out.println(in);
		
		//size
		int size = in.size();
		System.out.println(size);
		
		//get
		Integer g = in.get(5);
		System.out.println(g);
		
		//set
		in.set(4, 9);
		System.out.println(in);
		
		//contains
		
		in.contains(g)

	}

}
