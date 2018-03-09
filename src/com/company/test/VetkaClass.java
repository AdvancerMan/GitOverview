package com.company.test;

public class VetkaClass {
    protected int age;
    protected String name;

    public VetkaClass(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public VetkaClass() {
        this(10, "VASYA");
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

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
