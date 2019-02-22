/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbst;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ryan.
 */
public class TestBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Student> x = new TreeSet(new StudentComparator());
        x.add(new Student(1,"A"));
        x.add(new Student(2,"B"));
        x.add(new Student(3,"C"));
        x.add(new Student(4,"D"));
        x.add(new Student(5,"E"));
        x.add(new Student(6,"F"));
        System.out.println(x);
        Student st = new Student(3,"C");
        System.out.println(x.contains(st));
    }
    
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return -s1.getName().compareTo(s2.getName());
    }
    
}

class Student implements Comparable<Student>{
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String Name){
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
