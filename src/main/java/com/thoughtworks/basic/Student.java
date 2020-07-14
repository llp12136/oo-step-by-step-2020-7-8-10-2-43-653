package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person{
    private Number classNumber;


    public Student(int age, String name) {
        super(age, name);
    }


    public Student(int age, String name, List<String> messages) {
        super(age, name, messages);
    }

    @Override
    public String introduce() {
        return  "My name is " + getName() + ".I am " + getAge() + " years old." + "I am a Student of Class " + getClassNumber() + ".";
    }


    public Number getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Number classNumber) {
        this.classNumber = classNumber;
    }
}
