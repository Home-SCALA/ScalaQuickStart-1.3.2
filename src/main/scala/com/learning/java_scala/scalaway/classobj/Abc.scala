package com.learning.java_scala.scalaway.classobj

object Abc {

  def main(args: Array[String]) {
    /* Приведение типов в 'Scala' автоматически приводит тип переменной, основанной на стоимости, и нет необходимости явно указать компилятор */
    val age = 34
    val maxHeartRate = 210 - age * 0.5
    println( maxHeartRate==193.0 )

    // В 'Scala' меньше кода по сравнению с 'Java' для добавления двух объектов
    val total = BigDecimal(10) + BigDecimal(20)
    println( total==10+20 )

    // Проверка на равенство в 'Scala' ('eq' против '==')
    val eq1 = new String("A") == new String("A")		// '==' сравнения значений   (true)
    val eq2 = new String("A").eq(new String("A"))		// 'eq()' сравнение ссылок (false)
    println( eq1!=eq2 )


    /* объектно-ориентированный стиль программирования */
    def len(obj : AnyRef) = {
        obj.toString.length
    }
    println( len("Tirthal")==7 )
  }
}