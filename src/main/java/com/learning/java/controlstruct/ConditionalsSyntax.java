package com.learning.java.controlstruct;

/* Java: cинтаксис условных конструкций */


public class ConditionalsSyntax {

	public static void main(String[] args) {
		/* (#1)  if:then - выполняется условное действие в зависимости от состояния */
		if (args.length==0)
			System.out.println("#1: Arguments are null");
		else
			System.out.println("#1: Arguments are not null");
		
		/* (#2)  ?: - более короткая форма выражения условного действия (if:then) */
		System.out.println(args.length==0 ? "#2: Arguments are null" : "#2: Arguments are not null");
		
		/* (#3) switch:case - список состояний для условный */
		String day = "Monday";
		String dayType = "???"; // (текущий день недели..)
		switch(day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				dayType = "working day";
				break;
			case "Saturday":
			case "Sunday":
				dayType = "holiday";
				break;
			default:
				dayType = "unknown";
				break;
		}
		System.out.println("#3: " + day + " is " + dayType);
	}
}
