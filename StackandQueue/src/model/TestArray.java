/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ryan.
 */
public class TestArray {
    public static void main(String[] args){
        StackandQueueArray testArray = new StackandQueueArray();
        StackandQueueArray testArray2 = new StackandQueueArray();
        TestStackArray(testArray);
        TestQueueArray(testArray2);
        
    }
    public static void TestStackArray(StackandQueueArray testArray){
        System.out.println("----Test StackArray ----");
        testArray.pop();
        System.out.println("Size: "+testArray.size());
        //System.out.println("Last Data: "+testArray.peekS());
        testArray.push(10);
        testArray.push(20);
        System.out.println("Size: "+testArray.size());
        System.out.println("Last Data: "+testArray.peekS());
        testArray.push(23);
        testArray.push(70);
        System.out.println("Size: "+testArray.size());
        System.out.println("Last Data: "+testArray.peekS());
        System.out.println("Check: "+testArray.getDataInArray(0)+", "+testArray.getDataInArray(1)+", "+testArray.getDataInArray(2)+", "+testArray.getDataInArray(3)+", "+testArray.getDataInArray(4));
        
        System.out.println("--After delete lastdata--");
        testArray.pop();
        System.out.println("Size: "+testArray.size());
        System.out.println("Last Data: "+testArray.peekS());
        System.out.println("Check: "+testArray.getDataInArray(0)+", "+testArray.getDataInArray(1)+", "+testArray.getDataInArray(2)+", "+testArray.getDataInArray(3)+", "+testArray.getDataInArray(4));
        
        System.out.println("--Add Again--");
        testArray.push(1000);
        System.out.println("Size: "+testArray.size());
        System.out.println("Last Data: "+testArray.peekS());
        System.out.println("Check: "+testArray.getDataInArray(0)+", "+testArray.getDataInArray(1)+", "+testArray.getDataInArray(2)+", "+testArray.getDataInArray(3)+", "+testArray.getDataInArray(4));
        
        System.out.println("--Add OverSize--");
        testArray.push(2000);
        testArray.push(3000);
        System.out.println("Size: "+testArray.size());
        System.out.println("Last Data: "+testArray.peekS());
        System.out.println("Check: "+testArray.getDataInArray(0)+", "+testArray.getDataInArray(1)+", "+testArray.getDataInArray(2)+", "+testArray.getDataInArray(3)+", "+testArray.getDataInArray(4)+", "+testArray.getDataInArray(5)+", "+testArray.getDataInArray(6));
        
    }
    
    public static void TestQueueArray(StackandQueueArray testArray2){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("----Test QueueArray ----");
        System.out.println("First Data: "+testArray2.peekQ());
        System.out.println(testArray2.dequeue());
        testArray2.enqueue(10);
        testArray2.enqueue(20);
        System.out.println("Size: "+testArray2.size());
        System.out.println("First Data: "+testArray2.peekQ());
        testArray2.enqueue(23);
        testArray2.enqueue(70);
        System.out.println("Size: "+testArray2.size());
        System.out.println("First Data: "+testArray2.peekQ());
        
        System.out.println("--After delete Firstdata--");
        testArray2.dequeue();
        System.out.println("Size: "+testArray2.size());
        System.out.println("Check: "+testArray2.getDataInArray(0)+", "+testArray2.getDataInArray(1)+", "+testArray2.getDataInArray(2)+", "+testArray2.getDataInArray(3)+", "+testArray2.getDataInArray(4));
        System.out.println("First Data: "+testArray2.peekQ());
        
        System.out.println("--Add Again--");
        testArray2.enqueue(1000);
        System.out.println("Size: "+testArray2.size());
        System.out.println("Check: "+testArray2.getDataInArray(0)+", "+testArray2.getDataInArray(1)+", "+testArray2.getDataInArray(2)+", "+testArray2.getDataInArray(3)+", "+testArray2.getDataInArray(4));
        System.out.println("First Data: "+testArray2.peekQ());
        
        System.out.println("--Add OverSize--");
        testArray2.enqueue(2000);
        testArray2.enqueue(3000);
        System.out.println("Size: "+testArray2.size());
        System.out.println("Firstr Data: "+testArray2.peekQ());
    }
    
}
