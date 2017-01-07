package com.learning.scala.inheritance

/*
 * Scala: абстрактный (abstract) класс
 */


/* ( Абстрактный класс - такой abstract-класс нельзя создавать, он обязательно должен иметь своего класса-наследника.. ) */
abstract class Printer {
  def print: Unit /* в Scala, метод без определения своего тела - указывает такой метод является абстрактным, и класс-наследник вынужден определить собственную реализацию для этого абстрактного метода */
  def status: Unit = println("Printer is running")
}

/* Класс-наследник */
class ColorPrinter extends Printer {
  def print: Unit = println("Print in color")  // при определении тела для абстрактного метода - ключевое слово 'override' НЕтребуется
}


object AbstractClassSample {

  def main(args: Array[String]) {
    val cp = new ColorPrinter
    cp status;
    cp print;
  }
}
