/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author ryan.
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList(10);
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.get(2));
        a.add(2, 4); // แทรกข้อมูลลงไปแทนที่ index ที่ 2
        System.out.println(a.get(2)); // index ที่ 2 กลายเป็น 4 แทน แล้วค่าเดิมถูกเลื่อนลงไปอีก เป็น index ที่ 3
        System.out.println(a.get(3)); // ค่าทีเคยอยู่ index 2 ก่อนหน้านี้
        
        System.out.println("----------");
        
        for (int i = 0; i < a.size(); i++) {
            System.out.println("index["+i+"] : "+a.get(i));
        }
        
    }
}
