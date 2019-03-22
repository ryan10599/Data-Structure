/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author ryan.
 */
public class TestPriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue(20, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            int x = rd.nextInt(99);
            System.out.print(x + ", ");
            pq.add(x);
        }
        System.out.println("\b\b\n");
        System.out.println("size: " + pq.size());
        System.out.println("first item in queue: " + pq.peek());
        System.out.println(pq);
        testApply();
    }
    private static void testApply(){
        PriorityQueue<Student> pq = new PriorityQueue();
        pq.add(new Student(1001,"A",1.75));
        pq.add(new Student(1007,"C",2.25));
        pq.add(new Student(1008,"D",3.25));
        pq.add(new Student(1011,"E",3.59));
        pq.add(new Student(1021,"F",3.65));
        pq.add(new Student(1031,"G",4.00));
        pq.add(new Student(1051,"H",3.25));
        for(Student student : pq){
            System.out.println(student.id + ":"+ student.gpax);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll().gpax+",");
        }
        System.out.print("\b\b\n");
    }

}

class Student implements Comparable<Student>{
    int id;
    String name;
    double gpax;
    
    public Student(int id, String name, double gpax){
        this.id = id;
        this.name = name;
        this.gpax = gpax;
    }

    @Override
    public int compareTo(Student o) {
        if(this.gpax < o.gpax){
            return 1;
        } else if (this.gpax > o.gpax){
            return -1;
        }
        return 0;
    }
    
}

class MaxHeapComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
    
}
