
* `jdk-1.8`
* `scala-2.11.6`
* `btn-0.13.7'`



> [FunctionalProgrammingPrimerZinchuk](FunctionalProgrammingPrimerZinchuk.pdf) (#10)
>
> [ProgrammingInScalaEdition](ProgrammingInScalaEdition.pdf) (#118)
>
> [Язык программирования Scala](http://bourabai.kz/alg/scala.htm) **(** [pdf](scala.pdf) **)**


# Урок №1

Аналогия Java c Scala ( classobj )
---------------------

* **`#1`** `Приведение типов в 'Scala' автоматически приводит тип переменной, основанной на стоимости, и нет необходимости явно указать компилятор` [com.learning.java.classobj.Abc.java](src/main/java/com/learning/java/classobj/Abc.java) **|** [com.learning.scala.classobj.Abc.scala](src/main/scala/com/learning/scala/classobj/Abc.scala)
* **`#2`** `Нет необходимости чтобы объявить переменную с значением 'привет' как тип String потому-что компилятору просто определяет тип по его значению` [com.learning.java.classobj.HelloWorld.java](src/main/java/com/learning/java/classobj/HelloWorld.java) **|** [com.learning.scala.classobj.HelloWorld.scala](src/main/scala/com/learning/scala/classobj/HelloWorld.scala)
* **`#3`** `Создание класса и объектов + определение поля внутри класса` [com.learning.java.classobj.Customer.java](src/main/java/com/learning/java/classobj/Customer.java) **|** [com.learning.scala.classobj.Customer.scala](src/main/scala/com/learning/scala/classobj/Customer.scala)
* **`#4`** `Как переопределить getter/setter методы с присваиванием полей если требуется добавить собственную логику` [com.learning.java.classobj.User.java](src/main/java/com/learning/java/classobj/User.java) **|** [com.learning.scala.classobj.User.scala](src/main/scala/com/learning/scala/classobj/User.scala)
* **`#5`** `перегрузка (overloaded) конструктора` [com.learning.java.classobj.CashFlow.java](src/main/java/com/learning/java/classobj/CashFlow.java) **|** [com.learning.scala.classobj.CashFlow.scala](src/main/scala/com/learning/scala/classobj/CashFlow.scala)
* **`#6`** `как использовать 'case-класс' - заставляет Scala-компилятор создавать такие дополнительные методы как: 'hashCode()', 'equals()', 'toString()'` [com.learning.java.classobj.TemperatureAlarm.java](src/main/java/com/learning/java/classobj/TemperatureAlarm.java) **|** [com.learning.scala.classobj.TemperatureAlarm.scala](src/main/scala/com/learning/scala/classobj/TemperatureAlarm.scala)


# Урок №2

Аналогия Java c Scala (controlstruct)
---------------------

* **`#1`** `cинтаксис условных конструкций` [com.learning.java.controlstruct.ConditionalsSyntax.java](src/main/java/com/learning/java/controlstruct/ConditionalsSyntax.java) **|** [com.learning.scala.controlstruct.ConditionalsSyntax.scala](src/main/scala/com/learning/scala/controlstruct/ConditionalsSyntax.scala)
* **`#2`** `cинтаксис цыклов и управления прохождения по цыклу` [com.learning.java.controlstruct.LoopsBreaksSyntax.java](src/main/java/com/learning/java/controlstruct/LoopsBreaksSyntax.java) **|** [com.learning.scala.controlstruct.LoopsBreaksSyntax.scala](src/main/scala/com/learning/scala/controlstruct/LoopsBreaksSyntax.scala)
* **`#3`** `Исключения (Exception)` [com.learning.java.controlstruct.ExceptionSyntax.java](src/main/java/com/learning/java/controlstruct/ExceptionSyntax.java) **|** [com.learning.scala.controlstruct.ExceptionSyntax.scala](src/main/scala/com/learning/scala/controlstruct/ExceptionSyntax.scala)


# Урок №3

Scala - коллекции (collection)
-----------------

* **`#1`** `коллекции (List)` [com.learning.scala.collection.ListExamples.scala](src/main/scala/com/learning/scala/collection/ListExamples.scala)
* **`#2`** `коллекции (Map)` [com.learning.scala.collection.MapExamples.scala](src/main/scala/com/learning/scala/collection/MapExamples.scala)


# Урок №4

Аналогия Java c Scala (интерфейсы, абстрактные классы)
---------------------

* **`#1`** `родительские классы и наследование` [com.learning.java.inheritance.SubTypeSample.java](src/main/java/com/learning/java/inheritance/SubTypeSample.java) **|** [com.learning.scala.inheritance.SubTypeSample.scala](src/main/scala/com/learning/scala/inheritance/SubTypeSample.scala)
* **`#2`** `интерфейсы` [com.learning.java.inheritance.InterfaceSample.java](src/main/java/com/learning/java/inheritance/InterfaceSample.java) **|** [com.learning.scala.inheritance.TraitSample.scala](src/main/scala/com/learning/scala/inheritance/TraitSample.scala)
* **`#3`** `дефолтные методы (default|override)` [com.learning.java.inheritance.InterfaceDefaultMethodSample.java](src/main/java/com/learning/java/inheritance/InterfaceDefaultMethodSample.java) **|** [com.learning.scala.inheritance.TraitDefaultMethodSample.scala](src/main/scala/com/learning/scala/inheritance/TraitDefaultMethodSample.scala)
* **`#4`** `абстрактный (abstract) класс` [com.learning.java.inheritance.AbstractClassSample.java](src/main/java/com/learning/java/inheritance/AbstractClassSample.java) **|** [com.learning.scala.inheritance.AbstractClassSample.scala](src/main/scala/com/learning/scala/inheritance/AbstractClassSample.scala)


# Урок №5

Scala - функциональное программирование (functional)
---------------------------------------

* **`#1`** `введение в функциональное программирование` [com.learning.scala.functional.IntroToFunctional.scala](src/main/scala/com/learning/scala/functional/IntroToFunctional.scala)
