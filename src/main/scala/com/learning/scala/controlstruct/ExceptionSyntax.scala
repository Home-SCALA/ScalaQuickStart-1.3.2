package com.learning.scala.controlstruct

import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.io.IOException

/*
 * Scala: Исключения (Exception)
 * Все исключения в Scala являются RuntimeException, потому что Scala проверяет исключение только в RuntimeException. Поэтому во время компиляции исключения НЕ обрабатываются..
 */


object ExceptionSyntax {

  def main(args: Array[String]) {
    val url = new URL("http://tirthalpatel.blogspot.com")

    /* try-catch-finally */
    try {
      val url = new URL( "http://tirthalpatel.blogspot.com" );
      val buffered = new BufferedReader( new InputStreamReader(url.openStream()) )
      try {
        var line = buffered.readLine
        while(line != null) {
          line = buffered.readLine
          println(line)
        }
      } finally {
        buffered.close()
      } 
    } catch {  // ( во время компиляции исключения НЕ будут проверены компилятором.. )
        case _: MalformedURLException => println("Bad URL")
        case e: IOException => println("Problem in reading data: " + e.getMessage)
    }
  }
}
