package org.abstraction;

public class Main implements Piano,Guidar{
public void play() {
		
		
	}
public void Piano() {
	System.out.println("Playing Piano");
}
public void Guidar() {
	System.out.println("Playing Guidar");
}


	public static void main(String[] args) {
		Main m=new Main();
		m.Piano();
		m.Guidar();
		

	}

}
