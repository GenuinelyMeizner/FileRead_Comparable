package Excercise_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Person person = new Person();

        ArrayList<Person> list = new ArrayList<>();

        Person person1 = new Person("John", 1.92, 21);
        Person person2 = new Person("Roger", 1.94, 21);
        Person person3 = new Person("Steven", 1.86, 32);

        list.add(person1);
        list.add(person2);
        list.add(person3);

        System.out.println("Before sorting: \n" + list);
        Collections.sort(list);
        System.out.println("After sorting: \n" + list);
    }
}
