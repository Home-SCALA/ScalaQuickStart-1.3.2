package com.learning.scala.classobj

/* Scala: сказать 'hello world' и напечатать 'дату' */

/*
 * 'Scala' очень легко взаимодействует с Java-кодом.
 * 'Scala' обеспечивает импорт по умолчанию 'scala._".
 * Все классы из пакета java.lang импортируются по умолчанию, в то время как другие должны быть импортированы в явном виде.
 * В отличие от Java, импорт в Scala может появиться в любом месте в коде (а не только в верхней части файла).
 *
 * Классы являются открытыми по умолчанию, так что нет никакой необходимости для публичного ключевого слова.
 * Ключевое слово 'object' в 'Scala' широко известно как единственный объект, который представляет собой класс с одним экземпляром.
 * Декларация выше объявленного объекта - как класс с именем 'HelloWorld' и экземпляр этого класса, который также называется 'HelloWorld'. Этот экземпляр создается по требованию, в первый раз и всегда используется.
 *
 * Почему основной метод не объявлен как статический здесь?
 * Это потому что статические члены (методы или поля) не существуют в 'Scala'. Вместо того, чтобы определять статические члены, Scala-программист объявляет эти элементы в одно-элементных объектах.
 * Также нет необходимости объявлять тип возврата основной () он автоматически Unit (Scala является эквивалентом пустоты).
 * В отличие от Java и Groovy, тип переменной приходит после того, как имя переменной
 * >   args: Array[String].
 * Квадратные скобки используются Scala для обозначения общего типа, так что тип 'args' определен как 'Array[String]' вместо 'String[]'.
 */
import java.util.{Date, Locale} // Несколько классов могут быть импортированы из того же пакета, заключив их в фигурные скобки.
import java.text.DateFormat
import java.text.DateFormat._ // при импорте все имена пакета или класса, один использует символ подчеркивания (_) вместо звездочки (*).


object HelloWorld {

  def main(args: Array[String]) {
    /* Нет необходимости чтобы объявить переменную с значением 'привет' как тип String потому-что компилятору просто определяет тип по его значению. */
    val hello = "Hello World!"
    /* Вызов 'println()' не нужно квалифицировать потому-что в 'Scala' импорт пакета 'java.lang' определенно по умолчанию */
    println( hello )


    // Использование Java APIs in Scala:
    val now = new Date
    val df = getDateInstance(LONG, Locale.ENGLISH) // Импорт с (_) делает статический метод-getDateInstance() и статическое поле-LONG видимым.

    println( "Java: " + df.format(now) )  // способ доступа в 'Java' к методу-format()
    println( "Scala: " + {df format now} ) // способ в 'Scala' метод принимающий один аргумент может быть использован с другим синтаксисом

    // Calling custom foo method  
    println(foo)
    
    /*
     * В Scala-синтаксисе - точка(.) не является обязательным для вызова функции
     * >   "aBC".replace("a","A") = "aBC" replace("a","A")
     */
    if( "aBC".replace("a","A").equals("aBC" replace("a","A")) )
      println("Java: \"aBC\".replace(\"a\",\"A\"); Scala: \"aBC\" replace(\"a\",\"A\");")
  }

  /*
   * Синтаксис для создания метода-Foo
   * Возвращаемый тип метода относится к приведеному типу, но он нуждается в знаке '=', чтобы сообщить компилятору сделать заключение и вывести...
   * Если тело метода является только один оператор (или выражение), он не нуждается в фигурные скобки вокруг него.
   */
  def foo() = "Foo"
}
