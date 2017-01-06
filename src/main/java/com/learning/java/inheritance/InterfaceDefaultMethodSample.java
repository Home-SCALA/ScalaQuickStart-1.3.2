package com.learning.java.inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Java: дефолтный метод ('default' в Java 8)
 * ******************************************
 * @see https://github.com/tirthalpatel/Learning-Java/blob/master/Java8/src/com/tirthal/learning/langfeatures/Ex_DefaultStaticMethodsInInterface.java
 */


public class InterfaceDefaultMethodSample {

    public static void main(String[] args) {
        // Пример №1:
        Users users = new Users();
        users.add(new User("Tids", 34));
        users.add(new User("Adam", 40));
        users.add(new User("Ian", 4));
        System.out.println("Сортировка по полю 'fname' для класса-Users: " + users.sort());

        // Пример №2:
        users = new UsersSortableByAge();
        users.add(new User("Tids", 34));
        users.add(new User("Adam", 40));
        users.add(new User("Ian", 4));
        System.out.println("Другой способ сортировки по полю 'age' для класса-UsersSortableByAge: " + users.sort());
    }
}


/*
 * Пример №1
 * ( применяется при работе с коллекциями для реализации упорядоченной сортировки элементов в списке )
 */
class User implements Comparable<User> {
    private String fname;
    private Integer age;

    User(String fname, Integer age){
        this.fname = fname;
        this.age = age;
    }

    public String getFname(){
        return fname;
    }

    public Integer getAge(){
        return age;
    }

    @Override
    public int compareTo(User u){
        return fname.compareTo(u.fname);
    }

    @Override
    public String toString(){
        return fname + "'s age is " + age;
    }
}
/* простой класс-списка элементов, который использует 'Sortable' (вместо 'List') для реализации сортировки своих элементов */
class Users implements Sortable<User> { /* должен быть наследником от 'Comparable' */

    private final Set<User> users = new HashSet<>();

    public void add(User user) {
        users.add(user);
    }

    @Override
    public Iterator<User> iterator() {
        return users.iterator();
    }
}

/*
 * Пример №2
 * По умолчанию обеспечивает возможность сортировки для универсального типа (А), должен быть наследником-Comparable
 */
interface Sortable<A extends Comparable<A>> extends Iterable<A> {

    /* ДЕФОЛТНЫЙ МЕТОД ('default') - БУДЕТ ВЫЗЫВАТЬСЯ ПО УМОЛЧАНИЮ ДЛЯ ВСЕХ НАСЛЕДНИКОВ ЭТОГО ТИПА.. */
    default public List<A> sort() {
        List<A> list = new ArrayList<>();
        for(A element: this)
            list.add(element);
        list.sort(null); /* здесь 'null' - указывает на то чтоб использовать естественный метод сравнения (СотрагеТо).. */
        return list;
    }
}
/* Переопределение другого способа сортировки.. */
class UsersSortableByAge extends Users {

    @Override
    public List<User> sort() {
        List<User> users = new ArrayList<>();
        for(User u: this)
            users.add(u);
        users.sort((first, second) -> second.getAge().compareTo(first.getAge()));
        return users;
    }
}
