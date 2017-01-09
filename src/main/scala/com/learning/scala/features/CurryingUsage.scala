package com.learning.scala.features

/*
 * Scala: что такое 'currying'
 * @see http://www.codecommit.com/blog/scala/function-currying-in-scala
 *
 * * 'Currying' - это процесс превращения одной функции из двух и более аргументов в ряд из нескольких функций, каждая из которых принимает только один аргумент
 * * Регулярная функция:
 *    > f(a, b) = a + b
 *   >> f(1, 2)
 * * Curried функция:
 *    > f(a) -> f'(b) -> a + b
  *  >> f(1)(2)
 */


/* Синтаксис: регулярная функция против curried-функцией */
object CurryingUsage extends App {
    /* (синтаксис: регулярная функция) */
    def add(x: Int, y: Int): Int = x + y
    println { add(1, 2) }
    /* (синтаксис: версия Curried-функция) */
    def addCurried(x: Int)(y: Int): Int = x + y /* другой синтаксис для Curried-функции:  def addCurried(x:Int) = (y:Int) => x + y */
    println { addCurried(1)(2) }                /* это синтаксис вызова Curried-функции */
    
    /*
     * Пример curried-функции высокого порядка для определения общих и специальных функций:
     * Это функция высокого порядка, потому-что она в качестве аргументов принимает другие функции, то есть, функцию фильтра в качестве первого параметра которая-же в качестве аргумента принимает общий тип ('A') и возвращает в качестве результата булевское значение..
     */
    def process[A](filter: A => Boolean)(list: List[A]): List[A] = {
      lazy val recurse = process(filter) _

      /*
       * '::'   - это метод списка, который добавляет элемент в начало списка
       * 'head' - это метод который выбирает первый элемент из этой коллекции 'Iterable'
       * 'tail' - это метод который выбирает все элементы кроме первого
       */
      list match {  
        case head::tail => if (filter(head)) {
          head::recurse(tail)
        } else {
          recurse(tail)
        }
     
        case Nil => Nil
      }
    }

    /* какие-то 'immutable' (НЕизменные) переменные: */
    val numbersAsc = 1::2::3::4::5::Nil
    val numbersDesc = 5::4::3::2::1::Nil
    
    val even = (a:Int) => a % 2 == 0 
    val odd = (a:Int) => a % 2 != 0       
        
    /* Для использование curried-функции можно применить правило 'фигурной скобки', при вызове ('process') */
    val evenNumbersAsc = process(even) { numbersAsc }   // using {} instead of () syntax looks better than - process(even)(numbersAsc)    
    println(evenNumbersAsc)  //> [2, 4]
    val evenNumbersDesc = process(even) { numbersDesc }  
    println(evenNumbersDesc) //> [4, 2]
    
    /*
     * В выше изложенном примере есть проблемы с дублирующими вызовами для 'process(even)'..
     * для дальнейшего здесь частично используются curried-функции:
     */
    val processOdds = process(odd) _ /* ( знак подстановки '_' - указывает что curried-функция будет частично применятся - говорит компилятору   об применении значения суффиксов как для функции (а не как для метода).. ) */

    val oddNumbersAsc = processOdds { numbersAsc }   
    println(oddNumbersAsc)  //> [1, 3, 5]
    val oddNumbersDesc = processOdds { numbersDesc }  
    println(oddNumbersDesc) //> [5, 3, 1]
}
