package com.learning.java.classobj;

/* Java: сказать 'hello world' и напечатать 'дату' */

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class HelloWorld {

	public static void main(String[] args) {

		String hello = "Hello World!";
		System.out.println(hello);
		
		Date now = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);

		System.out.println("Hello world! " + df.format(now));
		
		System.out.println(foo());
	}
	
	public static String foo() {
		return "Foo";
	}
}
