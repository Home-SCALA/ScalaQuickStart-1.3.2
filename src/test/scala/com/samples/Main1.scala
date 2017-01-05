package com.samples

object Main1 {

  // Пример №1:
  class Aaa {
    var name: String = null
    var age: Integer = 0
    def getName() = name
    def getAge() = age
    override def toString = "Aaa(" + name + "," + age + ")"
  }

  // Пример №2:
  class Bbb(val name: String, val age: Integer) {
    override def toString = "Bbb(" + name + "," + age + ")"
  }

  // Пример №3:
  case class Ccc(val name: String, val age: Integer)


  def main(args: Array[String]) {
    // Пример №1:
    val aaa: Aaa = new Aaa()
    aaa.name = "Alex"
    aaa.age = 23
    println( aaa )

    // Пример №2:
    val bbb: Bbb = new Bbb("Alex",23)
    println( bbb )

    // Пример №3:
    val ccc: Ccc = new Ccc("Alex",23)
    println( ccc )
  }

}
