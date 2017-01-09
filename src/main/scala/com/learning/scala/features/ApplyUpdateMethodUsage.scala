package com.learning.scala.features

/*
 * Scala: метод 'apply' и как его использовать ?
 * * метод 'apply' - обеспечивает сокращенный способ вызова метода для экземпляра-класса (то есть, это способ для фэйкового-фальшивого вызовова функций)..
 * * синтаксис:
 *   > instance(a) ---> internally_calls ---> instance.apply(a)
 * * это можно использовать, например: как более выразительный стиль создания API-классов..; или как фабричный меиод для создания стиля..;
 *
 * Scala: метод 'update' и как его использовать ?
 * * метод 'update' - обеспечивает сокращенный способ оператора присваивания для экземпляра класса
 * * синтаксис:
 *   > instance(a) = b ---> internally_calls ---> instance.update(a, b)
 * * это можно использовать, например: чтобы создавать API-класс(ы)..; чтобы чувствовать в работе синтаксис языка..;
 */


/* Пример пользовательского класса, как сделать API более выразительным с помощью метод 'apply'..: */
class Multiplier {
  def apply(n1: Int, n2: Int): Unit = {println(n1 * n2)}
}

/* Пример пользовательского класса, для предоставления способа создания фабрики стилей с помощью метод 'apply'..: */
class Book(id: Int, name: String, author: String) {  
  override def toString: String = { id + ":" + name + ":" + author} 
}

object Book { /* ('Book' объект-компаньон) многократно использует метод 'apply': */
  def apply(id: Int, name: String, author: String) = new Book(id, name, author)
  def apply(id: Int, name: String) = new Book(id, name, "Author is unknown")  
}

/* Пример пользовательского класса, который использует метод 'apply' и метод 'update'..: */
class PaymentTypes {
  private val payTypes = scala.collection.mutable.Map(
    "cc"        -> "Credit Card",
    "paypal"    -> "Paypal",
    "cash"      -> "Cash")
  
  def apply(name: String) = {
    payTypes.get(name)
  }
    
  def update(name: String, description: String) {
    payTypes.update(name, description)  
  }
  
  override def toString = payTypes.toString()
}


object ApplyUpdateMethodUsage {

  def main(args: Array[String]) {
    /* массивы в Scala имеют выразительный синтаксис для доступа к значению, используя метод 'apply' и назначают его с помощью метода 'update'.. */
    val quaters = Array("Q1", "Q2", "Q3", "Q4")

    /* Синтаксис вызова класса используя метод 'apply' ? */
    println("First quater code: " + quaters.apply(0)) /* доступ к элементам массива с использованием встроенного метода 'apply' в классе 'Array'.. */
    println("Second quater code: " + quaters(1))      /* это сокращенный способ для выше изложенного примера 'quaters.apply(1)'.. */

    /* Синтаксис вызова класса используя метод 'update' ? */
    quaters.update(0, "q1")  /* Обновление значений массива с помощью встроенного метода 'update' в классе 'Array'.. */
    quaters(1) = "q2"        /* это сокращенный способ для выше изложенного примера 'quaters.update(1, "q2")'.. */

    /* ---> Пример как сделать стиль для API-классов более выразительным с помощью метода 'apply': */
    val multiply = new Multiplier()
    multiply(2, 3) /* это переменная экземпляра, его синтаксис по-прежнему выглядит как вызов функции; а это сокращенный синтаксис для 'multiply.apply (2, 3)' */

    /* Пример предлагает метод создания фабричного стиле, используя метода 'apply'..: */
    val b1 = Book(1, "The Well-Grounded Java Developer", "Benjamin J. Evans & Martijn Verburg") /* вызов 'Book.apply(id: Int, name: String, author: String)' */
    println(b1)
    val b2 = Book(2, "Microsoft Application Architecture Guide - Patterns and Practices") /* вызов 'Book.apply(id: Int, name: String)' */
    println(b2)

    /* Пример для создания выразительного API-классов в пользовательском классе с использованием метода 'apply' и метода 'update': */
    val ptypes = new PaymentTypes()
    println(ptypes)
    println("Description on paypal:" + ptypes("paypal")) // вызов 'PaymentTypes.apply(name: String)' */
    ptypes("paypal") = "Paypal Payment Gateway"          // вызов 'PaymentTypes.update(name: String, description: String)' */
    println(ptypes)
  }
}
