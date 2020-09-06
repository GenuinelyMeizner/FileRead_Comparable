package Excercise_3;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    public String name;
    public double height;
    public int age;

    public Person(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public Person() {

    }

    @Override
    public int compareTo(Person otherPerson) {

        if (otherPerson.getAge() > this.age) {
            return -1;
        }
        else if (otherPerson.getAge() == this.age && otherPerson.getHeight() > this.height) {
            return 1;
        }
        else if (otherPerson.getAge() == this.age && otherPerson.getHeight() == this.height) {
            return 0;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Height: " + height + " Age: " + age + "\n";
    }
}
