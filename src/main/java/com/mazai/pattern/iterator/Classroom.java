package com.mazai.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Classroom implements Aggregate {
    private List<Student> students;
    private int last = 0;

    public Classroom(int size) {
        this.students = new ArrayList<>(size);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void addStudent(Student student) {
        students.add(student);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Student> iterator() {
        return new ClassroomIterator(this);
    }
}
