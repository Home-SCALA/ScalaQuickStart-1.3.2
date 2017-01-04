package com.learning.scala.collection

import scala.collection.mutable.LinkedList
import scala.collection.JavaConversions._
import java.util.ArrayList

/*
 * Scala: коллекции (List)
 * Важный момент: Scala имеет как 'immutable' (НЕизменные) и 'mutable' (Изменчивые) коллекции. Mutable-коллекции являются по умолчанию (и всегда доступны в Scala без импорта..)
 */


object ListExamples {

  def main(args: Array[String]) {
    var list = List(1, 2, 3) /* ( 'var' - ссылка на mutable-коллекцию, типа 'List' ) */
    list = list :+ 4         /* ( ':+' - возвращает новый экземпляр списка immutable-коллекции с дополнительным элементом.. ) */
    println(list)

    val linklist = LinkedList(1, 2, 3) /* ( 'val' - ссылка на immutable-коллекцию, типа 'LinkedList' ) */
    linklist.append(LinkedList(4))     /* ( содержимое может быть изменено с помощью метода 'append()' ) */
    println(linklist)
  }
}
