package com.learning.scala.classobj

/* Scala: как использовать 'case-класс' ? */

/*
 * Ключевое слово 'case' - заставляет Scala-компилятор создавать такие дополнительные методы как: 'hashCode()', 'equals()', 'toString()'.
 * (Он также создает дополнительно много строительных методов. Большую часть времени, эти другие методы не используются непосредственно разработчиком).
 * Они существуют чтобы обеспечить RunTime-поддержку. Scala предлагает следующее:
 * - для того чтобы 'case-класс' были использованы в поиске выражений...
 */
case class TemperatureAlarm(temp: Double)

object TemperatureAlarmTest {

  def main(args: Array[String]) {

    // 'Case-классы' могут быть созданы без необходимости повторного ключевого слова 'case'
    val alarm = TemperatureAlarm(99.9)
    println(alarm.toString()) /* (метод предоставляемый компилятором) */
    println(alarm.hashCode()) /* (метод предоставляемый компилятором) */

    /* Scala-конструктор поиска по шаблону работает только в классе 'case': */
    val msgAlarm = alarm match {
      case TemperatureAlarm(temp) => "Tripped at temp " + temp
      case _ => "No match"
    }
    println( msgAlarm )
  }
}
