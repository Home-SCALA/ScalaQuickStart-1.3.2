package com.learning.java.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Java: Дженерики (Generics)
 */


interface Stack<T> { /* ( использование Дженерика в интерфейсе ) */
	void push(T t);
	T pop();
}

class ListStack<T> implements Stack<T> { /* ( использование Дженерика в классе ) */
	private final List<T> elements = new ArrayList<T>();

	@Override
	public void push(T t) {		
		elements.add(0, t);
	}

	@Override
	public T pop() {			
		if(elements.isEmpty())
			throw new IndexOutOfBoundsException();
		return elements.remove(0);
	}
}

/* Пример работы с разными, ранее неизвестными, типами: */
class BoundTypesSyntax { 
	
	/*
	 * '?' - Знак подстановки
	 * ключевое слово 'extends' - расширяет базовый тип..
	 * это выражение '<? extends T>' - позволяет использовать либо для неизвестного типа 'Т' либо для всех классов-наследников от этого неизвестного типа 'Т'..
     */
	public void ex1(List<? extends Number> list) {
        /* (Number) представляет неизвестный тип, поэтому либо для (Number) либо для всех его других классов-наследников (например: Integer, Float) - работа с ними будет являтся приемлемой.. */
	}

    /*
	 * ключевое слово 'super' - расширяет свой родительский под-тип..
	 * это выражение '<? super T>' - позволяет использовать либо для неизвестного типа 'Т' в родительском супер-классе либо для всех классов-наследников от этого родительского супер-класса..
     */
	public void ex2(List<? super Integer> list) {
        /* (Integer) является родительским супер-классом, (похожим как например на: "Number"..) - работа с ними будет являтся приемлемой.. */
	}
	
	/*
     * Знак подстановки без ограничения - является универсальным для использования всех неизвестных типов...например:
	 * > List<?> list
	 *
	 * В Java можно установливать несколько элементов неизвестного типа, например:
	 * > public static <A extends Animal & Comparable<Animal>> void sort(List<A> list) { ... }
	 *
	 * Но Java НЕможет одновременно установливать несколько элементов неизвестного типа для 'extends' и 'super'..
     */
}


public class GenericsSyntax {

    public static void main(String[] args) {
		/* Дженерики И параметрический полиморфизм..: */
        Stack<String> stack = new ListStack<String>();
        stack.push("A3");
        stack.push("A2");
        stack.push("A1");
        String element = stack.pop();
        System.out.println(element);
    }

    /* Использование Дженерика в методе: */
    public <A> void add(A a) {
        // ...
    }
}
