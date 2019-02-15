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
public interface StackInterface<T> {
  public boolean isEmpty(); // เช็ค Array 
  public int size(); // บอก Size ของ Array (จำนวนข้อมูลที่มีอยู่ใน Array)
  public void push(T t); // เพิ่ม object ลงไปใน Stack
  public T peekS(); // เอาไว้ดูข้อมูลบนสุดของ Stack
  public T pop(); // เอาไว้ลบ object ออกจาก Stack
}
