package org.example;

public class Person {
    String firstName;
    String lastName;
    String city;
    String gender;
    double salary;
    int age;


    public Person(String firstname,String lastname,int age){
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public Person(String firstname,String lastname,int age,String city,String gender,double salary){
        this(firstname,lastname,age);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
