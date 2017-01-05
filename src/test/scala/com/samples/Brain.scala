package com.samples


/**
 * @see http://alvinalexander.com/scala/scala-class-examples-constructors-case-classes-parameters
 *      *****************************************************************************************
 *      Private constructor
 */

class Brain private {
  override def toString = "This is the brain."
}

object Brain {
  val brain = new Brain
  def getInstance: Brain = {
    brain
  }
}

object SingletonTest extends App {

  // this won't work
  // val brain = new Brain

  // this works
  val brain = Brain.getInstance
  println(brain)
}
