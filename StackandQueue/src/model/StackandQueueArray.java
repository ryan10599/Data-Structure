/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.NoSuchElementException;

/**
 *
 * @author ryan.
 */
public class StackandQueueArray<T> implements StackInterface<T>, QueueInterface<T> {

    private T item[];
    private int size;

    public StackandQueueArray() {       // เมื่อ new construc... Array ที่มีขนาด 5 ช่อง
        item = (T[]) new Object[5];
    }

    @Override
    public int size() { //บอกจำนวนข้อมูลทั้งหมดที่มีอยู่ใน Array
        return size;
    }

    @Override
    public boolean isEmpty() { // เช็คว่า size=0 หรือไม่ ถ้า = 0 คือ Array ไม่มีข้อมูลใดๆเลย
        return (size == 0);
    }

    @Override
    public T peekS() { // ดึงข้อมูลตัว last data ออกมาแสดง (ของ Stack)
        if (!isEmpty()) {
            return item[size - 1];
        }
        throw new NoSuchElementException();
    }

    @Override
    public T pop() { // เอาข้อมูลออกจาก Array (ของ Stack)
        if (!isEmpty()) {
            T t = peekS(); // ดึง last data มาเก็บไว้ในตัวแปล
            item[size - 1] = null; // ตั้งค่าให้ตัวสุดท้ายเป็นค่า null
            size--; // ลบใส่ออกไป1
            return t; // return ค่า last data ที่เก็บเอาไว้ออกมา
        }
        return null;
    }

    @Override
    public void push(T t) { // เอาข้อมูลเข้าไปใน Stack
        if (size == item.length) {  // เช็คถ้า size=จำนวนช่องของ Array ให้ทำการสร้าง Array ใหม่ชื่อ item2 โดยมีขนาด จากเดิม + 5    
            T item2[] = (T[]) new Object[size + 5];
            for (int i = 0; i < size; i++) { // วน Loop เพื่อคัดลอก ข้อมูลใน Array เดิมมาใส่ Array ใหม่ที่ชื่อ item2
                item2[i] = item[i];
            }
            item = item2; // แล้วเปลี่ยนการชี้ใหม่ให้ไปชี้ที่ตัว item2
        }
        item[size] = t; // จะทำการใส่ ข้อมูลลงไปใน Stack
        size++; // เพิ่ม size เข้าไป 1 เพื่อบอกว่าได้เพิ่มข้อมูลแล้ว
    }

    public T peekQ() {
        return item[0]; // ดึงข้อมูลตัวแรกของ Queue มาแสดง (ของ Queue)
    }

    @Override
    public void enqueue(T t) { // method ทำการเพิ่มข้อมูลเข้าไปใน Queue
        if (size == item.length) {
            T item2[] = (T[]) new Object[size + 5];
            for (int i = 0; i < size; i++) {
                item2[i] = item[i];
            }
            item = item2;
        }

        item[size] = t;
        size++;

    }

    @Override
    public T dequeue() { // method นำข้อมูลที่อยู่ใน Queue ออก
        if (!isEmpty()) {
            T a = peekQ(); // ดึงข้อมูล First Data ออกมาเก็บไว้ในตัวแปร
            for (int i = 0; i < size - 1; i++) { // วน loop เพื่อบันทึกข้อมูลใหม่ให้ลำดับเลื่อนลงมา
                item[i] = item[i + 1]; // เช่น ข้อมูลช่องที่ 0 จะนำข้อมูลช่องที่ 1 มาใส่
            }
            size--; // ลบลำดับลงไป 1
            item[size] = null; //ช่องสุดท้าย set ให้เป็น null
            return a; // return First Data ที่เก็บไว้ออกมาแสดง
        }
        return null;

    }

    public T getDataInArray(int index) {
        T t = null;
        for (int i = 0; i <= index; i++) {
            t = item[i];
        }
        return t;
    }

}
