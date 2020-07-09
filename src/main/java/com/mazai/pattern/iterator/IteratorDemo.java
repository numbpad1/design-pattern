package com.mazai.pattern.iterator;

import java.util.Iterator;

/**
 * 迭代器模式:封装你的集合迭代的逻辑
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Student student1 = new Student("小明");
        Student student2 = new Student("小华");

        Classroom classroom = new Classroom(2);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        Iterator<Student> iterator = classroom.iterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
    }
}
