package com.company2;
public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name, int ConvertInHumanAge) {
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public int ConvertInHumanAge(){
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ConvertInHumanAge " + age * 7 +
                '}';
    }
}