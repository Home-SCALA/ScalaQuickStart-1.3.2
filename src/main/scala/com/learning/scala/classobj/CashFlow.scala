package com.learning.scala.classobj

/* Scala: первичные и вспомогательные конструкторы */

// class having a primary constructor that defines the parameters for the class
class CashFlow(amt: Double, curr: String) { // primary two-argument constructor

  // a class may have additional auxiliary constructors, which really act like providers of default parameters to the primary constructor
  def this(amt: Double) = this(amt, "INR")
  def this(curr: String) = this(0, curr)

  // define methods without including brackets or a parameter list (even an empty one)
  def amount = amt
  def currency = curr
}

// Try it
object CashFlow {
  def main(args: Array[String]) {
    val cf = new CashFlow(500.0)

    println( "Amount = " + cf.amount )
    println( "Currency: " + cf.currency )
  }
}
