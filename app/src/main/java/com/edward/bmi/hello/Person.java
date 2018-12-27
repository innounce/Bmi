package com.edward.bmi.hello;

public class Person {
    float height;
    float weight;
    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello");
    }
    public void hello(String name){
        System.out.println("Hello " + name);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
