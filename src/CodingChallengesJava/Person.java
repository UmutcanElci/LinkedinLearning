package CodingChallengesJava;

import java.util.Scanner;

public class Person {
    public Scanner in = new Scanner(System.in);
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hi my name is " + getName() + " and my last name is " + getLastName() + " Also I am "+ getAge() + " years old!");
    }

    public static void main(String[] args) {
        Person person = new Person("Ron","Freeman",34);
        person.sayHello();

    }
}
