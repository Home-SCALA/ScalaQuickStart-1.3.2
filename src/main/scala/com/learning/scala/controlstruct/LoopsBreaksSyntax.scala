package com.learning.scala.controlstruct

/* Scala: cинтаксис цыклов и управления прохождения по цыклу */


object LoopsBreaksSyntax {

  def main(args: Array[String]) {
    println("################")
    /* (#1)  while */
    var i: Int = 0
    while (i < 3) {
      println(i)
      i += 1 // ( в Scala отсутствует оператор: ++ )
    }

    println("\n################")
    /* (#2.1)  for */
    for(i <- 0 to i) { /* <-  указывает на генератор чтобы увеличить значение в итераторе */
      println(i)
    }

    println("\n################")
    /* (#2.2)  for:each */
    (0 to 3).foreach(i => println(i)) /* альтернативный синтаксис использования в Scala:  (0 to 3).foreach(println(_) */

    println("\n################")
    /* (#3)  for:break */
    import scala.util.control.Breaks._ // ( также Scala позволяет делать import внутри метода или блока )
    breakable {
      for(k <- 0 to 10) {
        println(k)
        if(i ==5)
          break()
      }
    }
  }
}
