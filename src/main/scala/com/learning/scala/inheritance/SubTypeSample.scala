package com.learning.scala.inheritance

/*
 * Scala: родительские классы и наследование
 *
 * @see https://habrahabr.ru/post/269695/
 *      *********************************
 * Java
 * > String mama = "Jane";
 * > final String papa = "John";
 *
 * Scala
 * > var mama = "Jane"
 * > val papa = "John"
 *
 * @see http://alvinalexander.com/scala/scala-class-examples-constructors-case-classes-parameters
 *      *****************************************************************************************
 * Declaration    Getter?    Setter?
 * -----------    -------    -------
 * var            yes        yes
 * val            yes        no
 * default        no         no
 *
 */


/*
 * Super-класс
 * ключевое слово 'val' - (в конструкторе Animal-класса) говорит Scala-компилятору создавать поля и getter-методы с модификатором доступом 'public' (но при этом setter-методы НЕсоздаются)
 */
class Animal(val id: Int) {
  def sound = println("By default it is mute") /* ( общий метод суперкласса ) */
}

/* Sub-класс */
class Dog(id: Int) extends Animal(id) {
  private def bark = println("'Dog-" + id + "' is barking") /* (класифицируем поведение для конкретного вида животного) */

  /*
   * Переопределем поведение супер-класс для класса-наследника
   * ( Java: '@Override' не является обязательным )
   * Scala: нужно в обязательном порядке объявить метод как 'override' - и только тогда можно переопределить метод (но этот переопределяемый метод НЕ должен быть абстрактный)
   */
  override def sound = bark
}


object SubTypeSample {

  def main(args: Array[String]) {
    val dog = new Dog(123)
    dog sound
  }
}
