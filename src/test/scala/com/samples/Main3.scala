package com.samples

object Main3 extends App {

  var my_text1 = "text1"

  my_text1 match {
    case "text0" => println("text0")
    case "text1" => println("text1")
    case "text2" => println("text2")
    case _ => println("?")
  }


  null match {
    case _ => println("is Null (1)")
  }


  var my_text2 = null
  my_text2 match {
//    case "text0" => println("text0")
    case null => println("is Null (2)")
  }


  var my_text3 = "text3"
  (null, null, null) match { //(my_text1, my_text2, my_text3) match {
    case (null, null, null) => println("is Null (3)")
  }


//  (null, "aaa", null) match { //("aaa", null, null) match {
//    case (_, null, null) => println("_ null null")
//    case (_, _, null) => println("_ _ null")
//
//    case (null, _, null) => println("_ _ null")
//    case (null, _, null) => println("_ _ null")
//
//    case (_, null, _) => println("_ null _")
//    case (null, null, _) => println("null null _")
//    case (_, _, _) => println("_ _ _")
//  }

  my_text1=null
  my_text2=null
  my_text3=null
  if (my_text1==null && my_text2==null && my_text3==null) println("null")

}
