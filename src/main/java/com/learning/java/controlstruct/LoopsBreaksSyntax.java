package com.learning.java.controlstruct;

import java.util.Arrays;
import java.util.List;

/* Java: cинтаксис цыклов и управления прохождения по цыклу */


public class LoopsBreaksSyntax {

	public static void main(String[] args) {
        System.out.println("################");
		/* (#1)  while */
		int i = 0;
		while(i < 3) {
			System.out.println(i);
			i++;
		}

        System.out.println("\n################");
		/* (#2.1)  for */
		for(int j = 0; j < i; j++) {
			System.out.println(j);
		}

        System.out.println("\n################");
		/* (#2.2)  for:each */
		List<Integer> numbers = Arrays.asList(0, 1, 2, 3);
		numbers.forEach(n -> System.out.println(n)); /* альтарнативный синтаксис в Java-8:  numbers.forEach(System.out::println); */

        System.out.println("\n################");
		/* (#3)  for:break */
		for(int k = 0; k < 10; k++) {
			System.out.println(k);
			if(k == 5)
				break;			
		}
	}
}
