package com.company;

public class Cat {
    private String name;
    private int age;
    private String catBreed;

    void setName (String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setCatBreed (String catBreed){
        this.catBreed = catBreed;
    }
    String getCatBreed (){
        return catBreed;
    }
}
