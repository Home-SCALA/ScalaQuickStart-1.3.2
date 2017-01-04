package com.learning.scala.collection

import scala.collection.mutable.HashMap

/*
 * Scala: коллекции (Map)
 * Scala обеспечивает immutable (неизменность) для Map-класс. По умолчанию ииспользуется HashMap
 */


object MapExamples {

  def main(args: Array[String]) {
    var x = Map(1 -> "India", 2 -> "USA")
    for ((key, vau) <- x) println(key + ": " + vau)
    x = x + (3 -> "Australia")
    
    val hm = HashMap(1 -> "India", 2 -> "USA")
    hm += (3 -> "Australia")
    println(hm)
  }
}
