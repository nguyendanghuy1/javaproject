package com.nguyendanghuy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:person.properties")
@Component("Person")
public class Person {
    @Value("${person.name}")
    private String name;

    private int age;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
