package com.learning.scala.features

import java.util.Calendar

/*
 * Scala: использование Map и функции-flatMap
 */


object MapAndFlapmapFunctions extends App {

  /* ( Функция на вход принимает параметр (год рождения) и вычисляет возраст.. ) */
  def age(birthYear: Int) = {
    Calendar.getInstance.get(Calendar.YEAR) - birthYear
  }

  val birthdays = List(1995, 1981, 1986, 2011) /* ( Наприимер: хотим получить возраст для целого списка лет-рождения ) */

  /*
   * 'map()' - создает новую коллекцию путем применения функции ко всем элементам этого списка..
   * Примеры как можно сделать это трех способами:
   */
  println {
    birthdays.map(age) + " = " +  
    birthdays.map(year => Calendar.getInstance.get(Calendar.YEAR) - year) + " = " + 
    birthdays.map(Calendar.getInstance.get(Calendar.YEAR) - _)
  }
}
