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
    }

}

class MaxHeapComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
    
}
