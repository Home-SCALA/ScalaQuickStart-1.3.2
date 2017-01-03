package com.learning.scala.classobj

/* Scala: первичные и вспомогательные конструкторы */

/* класс имеющий первичный конструктор, который определяет параметры */
class CashFlow(amt: Double, curr: String) { /* первичный конструктор с двумя аргументами */

  /* класс может иметь дополнительные вспомогательные конструкторы, которые действуют как поставщиков-параметров по умолчанию для первичного конструктора */
  def this(amt: Double) = this(amt, "INR")
  def this(curr: String) = this(0, curr)

  /* определять методы без включения в скобки или список параметров (даже пустой): */
  def amount = amt
  def currency = curr
}

object CashFlow {
  def main(args: Array[String]) {
    /* пример создание объекта с разными передаваемыми параметрами: */
//    val cf = new CashFlow(500.0)
//    val cf = new CashFlow("Aaa")
    val cf = new CashFlow(1000.0, "Bbb")

    println( "Amount = " + cf.amount )
    println( "Currency: " + cf.currency )
  }
}
