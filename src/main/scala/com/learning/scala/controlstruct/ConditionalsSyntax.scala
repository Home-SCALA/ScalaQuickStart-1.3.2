package com.learning.scala.controlstruct

/* Scala: cинтаксис условных конструкций */


object ConditionalsSyntax { 
  
  def main(args: Array[String]) {
    /* (#1)  if:then - возвращает условное значение в зависимости от состояния = условные выражения в Scala эквивалентно (?:) */
    println( if(args.length==0) "#1: Arguments are null" else "#1: Arguments are not null" )
    
    /* (#2)  ?: */
    /* даже любое тело в Scala является выражением {...} и может вернуть что-то */

    /* (#3)  match:case - Scala не имеет никакого (switch:case) вместо этого она использует выражения 'Match / Pattern Matching' */
    val day = "Monday"
    println("#3: " + day + " is " +
      (day match {
        case "Monday" | "Tuesday" | "Wednesday" | "Thurday" | "Friday" => "working day"
        case "Saturday" | "Sunday" => "holiday"
        case _ => "unknown"
      })
    )
  }
}
