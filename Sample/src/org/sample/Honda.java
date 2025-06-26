package org.sample;

import org.example.BMW;
import org.example.SampleProgram;

public class Honda {
	public void mycar() {
		System.out.println("My Own Car");
	}

	public static void main(String[] args) {
		Honda hd=new Honda();
		BMW b=new BMW();
		SampleProgram po=new SampleProgram();
		
		hd.mycar();
		b.audi();
		po.car();
		

	}

}
