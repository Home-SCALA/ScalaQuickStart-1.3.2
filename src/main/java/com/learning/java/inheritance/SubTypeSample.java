package com.learning.java.inheritance;

/*
 * Java: родительские классы и наследование
 * ****************************************
 * https://github.com/tirthalpatel/Learning-OOPD/blob/master/DesignPrinciples/src/com/tirthal/learning/oop/concepts/Inheritance_TestDrive.java
 */


class Animal {
	private final int id;

	public Animal(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
	public void sound() {
		System.out.println("By default it is mute");
	}
}

class Dog extends Animal {

	public Dog(int id) {
		super(id);
	}

	private void bark() {
		System.out.println("'Dog-" + getId() + "' is barking");
	}

	@Override
	public void sound() {
		bark();
	}
}


public class SubTypeSample {

    public static void main(String[] args) {
        Dog dog = new Dog(123);
        dog.sound();
    }
}
