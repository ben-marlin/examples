package edu.guilford;

// demo creating a class

public class Person {
    private String name;    // fields
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", age: " + age + "}";
    }

    public static void main(String[] args) {

        // instantiate Person object
        Person person = new Person("John", 25);

        // print using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // print using toString
        System.out.println("person = " + person);
    }
}
