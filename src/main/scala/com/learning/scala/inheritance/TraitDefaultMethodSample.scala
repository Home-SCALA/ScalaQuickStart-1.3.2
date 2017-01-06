package com.learning.scala.inheritance

import scala.collection.mutable.Set

/*
 * Scala: дефолтный метод ('default' в интерфейсе 'trait')
 */

class User(val fname: String, val age: Int) extends Ordered[User] {
  def compare(that: User): Int = fname.compare(that.fname)
  override def toString: String = fname + "'s age is " + age
}


object TraitDefaultMethodSample {

  def main(args: Array[String]){
    // Пример №1:
    var users = new Users
    users.add(new User("Tids", 34))
    users.add(new User("Adam", 40))
    users.add(new User("Ian", 4))
    println("Сортировка по полю 'fname' для класса-Users: " + users.sort)

    // Пример №2:
    users = new UsersSortableByAge
    users.add(new User("Tids", 34))
    users.add(new User("Adam", 40))
    users.add(new User("Ian", 4))
    println("Другой способ сортировки по полю 'age' для класса-UsersSortableByAge: " + users.sort)
  }
}


/*
 * Пример №1
 * ( применяется при работе с коллекциями для реализации упорядоченной сортировки элементов в списке )
 * По умолчанию, интерфейс-Sortable, обеспечивает возможность сортировки для универсального типа (А), должен быть наследником-Iterable
 *
 * 'Ordered' - имеет механизм сравнения порядка сортировки такой-же как и в Java
 * указатель '<:' - ограничивает верхнюю границу для универсального типа (A), должен быть наследником-Ordered
 */
trait Sortable[A <: Ordered[A]] extends Iterable[A] {
  /* ( реализует сортировку по умолчанию, которая может быть переопределена в классах-наследниках от этого интерфейса ) */
  def sort: Seq[A] = {
    this.toList.sorted /* ( это встроенный метод сортировки (по умолчанию) для 'Ordered' - использует естественный метод сравнения ) */
  }
}
/* простой класс-списка элементов, который использует 'Sortable' для реализации сортировки своих элементов */
class Users extends Sortable[User] { /* должен быть наследником от 'Ordered' */
  private val users = Set[User]()
  def add(user: User) = users.add(user)
  def iterator: Iterator[User] = users.iterator
}

/*
 * Пример №2
 * По умолчанию обеспечивает возможность сортировки для универсального типа (А), должен быть наследником-Comparable
 * Другой способ сортировки для класса-UsersSortableByAge...переопределяет дефолтный метод-сортировки для интерфейса (trait) 'Sortable'
 */
class UsersSortableByAge extends Users {
  /* ДЕФОЛТНЫЙ МЕТОД - БУДЕТ ВЫЗЫВАТЬСЯ ПО УМОЛЧАНИЮ ДЛЯ ВСЕХ НАСЛЕДНИКОВ ЭТОГО ТИПА.. */
  override def sort: List[User] = {
    this.toList.sorted(new Ordering[User] {
      def compare(first: User, second: User) = second.age compare(first age)
    })
  }
}
