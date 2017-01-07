package com.learning.java.inheritance;

/*
 * Java: абстрактный (abstract) класс
 */


abstract class Printer {
	public abstract void print(); // абстрактный метод - прнуждает определять собственную реализацию в своих классах-наследниках
	public void status() {
		System.out.println("Printer is running");
	}
}

class ColorPrinter extends Printer {
	@Override
	public void print() {		
		System.out.println("Print in color");
	}
}


public class AbstractClassSample {

    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        cp.status();
        cp.print();
    }
}
