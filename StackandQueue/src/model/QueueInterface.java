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
public interface QueueInterface<T> {
  public boolean isEmpty(); // เช็ค Array ว่าว่างรึป่าว
  public int size();    // บอก Size ของ Array (จำนวนข้อมูลที่มีอยู่ใน Array)
  public void enqueue(T t); // เอาข้อมูลเข้า Array 
  public T peekQ(); // บอก object ตัวแรกของ Queue
  public T dequeue(); // ลบ ข้อมูลตัวแรกออกจาก Queue ด้วย peek
}
