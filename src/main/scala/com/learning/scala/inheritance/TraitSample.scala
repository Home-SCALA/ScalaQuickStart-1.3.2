package com.learning.scala.inheritance

/*
 * Scala: интерфейс (trait) для экземпляра класса
 * Объявление интерфейса в Scala с помощью 'trait' (вместо 'interface' как в Java)
 * 'Trait'-ы могут иметь: поля с состояние (в отличие от Java-интерфейса 'interface')
 */

trait Foo {
  def foo
}

trait Bar {
  def bar
}

trait Counter {
  var count = 0                  /* (поле 'count' по умолчанию равно '0', и может быть использован повторно в классах наследниках) */
  protected var incrementBy: Int /* это абстрактное поле - оно обязательно должно быть переопределенно в классе-наследнике (защищенное состояние (protected) - обеспечивает видимость только в классе-наследнике) */
  def increment
}


/*
 * Пример: встроенный в Scala-у интерфейс (trait) 'App' - применяется для быстрого включения объектов в исполняемые программы (тобиш, стандартная функция 'main()' - не требуется..)
 */
object TraitSample extends App {
  
  //def main(args: Array[String]) { // работаем без основной функции 'main(..)'

    val fb = new FooBarImpl
    fb foo;
    fb bar;
    
    val counter = new CounterImpl
    println( "Before incrementing: " + counter.count )
    counter increment;
    counter increment;
    println( "After incrementing: " + counter.count )
    
  //}
}


/*
 * В Scala применяется 'extends' для подключения первого своего родительского класса-предка (суперкласс)
 * и 'with' для подключения других дополнительных родительских классов-предка
 * Переопределение функций которые были ранее задекларированные в родительском классе-предка (ля абстрактной функции - это переопределение не является обязательным)
 */
class FooBarImpl extends Foo with Bar {
  override def foo = println("I am foo")
  override def bar = println("I am bar")
}

class CounterImpl extends Counter {
  var incrementBy: Int = 2
  override def increment: Unit = count += incrementBy /* ('Unit' - указывает что функция ничего не возвращает..) */
}
