package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person{
    private CLass Class;

    public Student(int age, String name) {
        super(age, name);
    }

    public Student(int age, String name, List<String> messages) {
        super(age, name, messages);
    }

    @Override
    public String introduce() {
        return  "My name is " + getName() + ".I am " + getAge() + " years old." + "I am a Student of Class " + this.Class.getClassNumber() + ".";
    }


}
