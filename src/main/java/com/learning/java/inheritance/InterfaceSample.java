package com.learning.java.inheritance;

/*
 * Java: интерфейс (interface) для экземпляра класса
 * Множественное наследование в Java (доступно только для интерфейсов)
 */

interface Foo {
    void foo();
}

interface Bar {
    void bar();
}


public class InterfaceSample {

	public static void main(String[] args) {
		FooBarImpl fb = new FooBarImpl();
		fb.foo();
		fb.bar();
	}
}


class FooBarImpl implements Foo, Bar {

	@Override
	public void foo() {
		System.out.println("I am foo");
	}

	@Override
	public void bar() {
		System.out.println("I am bar");
	}
}
