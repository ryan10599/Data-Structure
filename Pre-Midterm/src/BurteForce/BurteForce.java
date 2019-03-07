/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurteForce;

import java.util.Scanner;

/**
 *
 * @author ryan.
 */
public class BurteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int[] a = {1,2,3,4,5,6,7};
        
        System.out.print("input your number : ");
        int value = sc.nextInt();
        System.out.println("your value: "+value);
        int result = checkValue(value);
        if(result == -1){
            System.out.println(value+" It don't have in this array.");
        }else{
            System.out.println(value+" It has in this array");
        }
        
        
    }
    
    public static int checkValue(int value){
        int[] a = {1,2,3,4,5,6,7}; // เป็น BurteForce เพราะจะวนเข้าไปเช็คทุกตัวเลยว่ามีตัวเลขนั้นๆรึป่าวใน Array
                                   // หากมีข้อมูลใน Array เป็น ล้านๆ จะทำให้การทำงานช้า
        int result = 0;
        for(int i=0; i<a.length;i++){
            if(value == a[i]){
                result = a[i];
                break;
            }else{
                result = -1;
            }
        }
        
        return result;
    }
    
}
