/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordFrequency;

import java.io.FileNotFoundException;

/**
 *
 * @author ryan.
 */
public class TestWordFrequency {
    public static void main(String[] args) {
        FrequencyCounter fc = new FrequencyCounter();
        try{
            fc.process("data.txt");
            System.out.println(fc);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}
