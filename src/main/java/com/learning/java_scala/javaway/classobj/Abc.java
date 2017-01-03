package com.learning.java_scala.javaway.classobj;

import java.math.BigDecimal;

public class Abc {

	public static void main(String[] args) {
		/* В 'Java' нужно явно указать компилятору каким типом является переменная */
		int age = 34;
		Double maxHeartRate = 210 - age * 0.5;
        System.out.println( maxHeartRate.equals(193.0) );

		/* В 'Java' невозможно добавить два объекта через оператор '+' */
		BigDecimal total = new BigDecimal(10).add(new BigDecimal(20));
        System.out.println( total.equals(new BigDecimal(10+20)) );

		/* Проверка на равенство в 'Java' ('equals' против '==') */
		boolean eq1 = new String("A").equals(new String("A"));	   // 'equals()' сравнения значений (true)
		boolean eq2 = new String("A") == new String("A");		   // '==' сравнение ссылок   (false)
        System.out.println( eq1!=eq2 );


        /* функциональный стиль программирования */
        System.out.println( len("Tirthal")==7 );
	}

    private static int len(Object o) {
        return o.toString().length();
    }
}
