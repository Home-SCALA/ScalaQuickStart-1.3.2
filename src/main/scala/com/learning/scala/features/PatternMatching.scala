package com.learning.scala.features

/*
 * Scala: паттерн 'Matching'
 */


case class Color(id: Int, name: String, code: String)

object PatternMatching extends App {

  /*
   * (#1) 'switch' как поведение:
   *      - Scala НЕимеет никакого switch-состояния, вместо этого в Scala используется match-выражение (паттерн 'Matching')
   *      - Гибкие условия поиска - он может сочитаться с чем-угодно, включая даже объекты..
   *      - 'match-case' является выражением которое НЕимеет 'break', и оно также может присваивать значение..
   */
   val day = "ABC"
   val dayType = day match {
        case "Monday" | "Tuesday" | "Wednesday" | "Thurday" | "Friday" => "working day"
        case "Saturday" | "Sunday" => "holiday"
        case _ => "unknown"  /* ( с помощью знака подстановки '_' в конце - по умолчанию (это не является обязательным) 'match-case' выражение ловит любое значение.. ) */
   }
   println(day + " is " + dayType)

   /*
    * (#2) Что такое шаблон?
    *
    * В этом синтаксисе что ниже:
    * * знак подстановки '_' - может быть шаблоном
    * * 'variable' - переменной
    * * 'literal' - равенство
    * * match-конструктор и match-деконструктор
    * * паттерны типа запросов
    * * паттерн с альтернативными вариантами
    *
    * >   value match {
    * >     case pattern guard => expression
    * >     case ...
    * >     case _ => expression
    * >  }
   */

   /* Например: паттерном может быть любое имя переменной, т.е. ('х') */
   val str = "tirthal"   
   str match {
     case x => println("Hello " + x) 
   }

   /* Например: литеральные совпадения ( значение должно точно соответствовать с литеральным case-ом, для этого 'match' использует '==' ) */
   val language = "Gujarati"
   language match {
     case "Engish" => println("How are you?")
     case "gujarati" => println("Kem cho?")
     case "Gujarati" => println("Kem cho? Majama?")
     case _ => println("Hi")
   }

   /* Например: конструктор паттернов ( позволяет сопоставлять аргументы которые используются для построения объектов ) работает только для классов в 'case'.. */
   val color = new Color(1, "Red", "RC")
   color match {
     case Color(_, "Red", _) => println("This is red color") /* сравнивается: если поле ('name') равно "Красный" во 2-м аргументе в конструкторе класса-Color */
     case Color(_, _, _) => println("???") /* '_'  - указывает на то что все равно какими это будут значения.. */
   } 

   /* Например тип запросов используется: для проверки подходящего типа; и для проверки приведения типов; ) */
   def generalSize(x: Any): Int = x match {
     case s: String => s.length  // 's' может быть только 'String'
     case m: Map[_, _] => m.size // 'm'  может быть только 'Map'
     case _ => -1                // для любого другого типа возвращает ('-1')
   }
   println { generalSize("Tirthal") }                           //> Int = 7
   println { generalSize(Map(1 -> "one", 2 -> "two")) }         //> Int = 2
   println { generalSize(math.Pi) }                             //> Int = -1
   println { generalSize(List("A1", "A2", "A3")) }              //> Int = -1

   /*
    * (#3) Что такое 'guard' ?
    *
    * Паттерн 'guard' приходит после того когда паттерн начинается с 'if', и паттерн сопоставляет только тогда когда 'guard' возвращает истину (true), пример:
    * * 'match' только для натуральных (положительных) чисел
    *   > case n: Int if 0 < n => n + " is positive"
    * * 'match' только для строк которые начинающиеся с буквы ('a')
    *   > case s: String if s(0) == 'a' => s + " starts with letter 'a'"
    */
}
