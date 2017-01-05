package com.samples

object Main1 {

  class Aaa {
    var name: String = null
    var age: Integer = 0
    def getName() = name
    def getAge() = age
    override def toString = "[Aaa: name = " + name + ", age = " + age + "]"
  }

  class Bbb(val name: String, val age: Integer) {
    override def toString = "[Bbb: name = " + name + ", age = " + age + "]"
  }

  def main(args: Array[String]) {
    val aaa: Aaa = new Aaa()
    aaa.name = "Alex"
    aaa.age = 23
    println( aaa )

    val bbb: Bbb = new Bbb("Alex",23)
    println( bbb )
  }

}
