package com.edward.bmi;

import com.edward.bmi.hello.Person;
import com.edward.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        /*Person person = new Person();
        person.hello();
        person.hello("Edward");
        person.setHeight(1.7f);
        person.setWeight(66);
        System.out.println(person.bmi());*/
        Student stu = new Student("001", "edward", 60, 80);
        Student stu1 = new Student("004", "eric", 35, 60);
        /*stu.setId("001");
        stu.setName("edward");
        stu.setMath(60);
        stu.setEnglish(80);*/
        stu.print();
        stu1.print();

    }
}
