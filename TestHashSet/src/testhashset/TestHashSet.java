/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ryan.
 */
public class TestHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Cat");
        s.add("Dog");
        s.add("Bird");
        s.add("Duck");
        
        String x = new String("Cat");
        
        System.out.println("code: "+"Cat".hashCode());
        System.out.println("code: "+x.hashCode());
        
        System.out.println(s.contains("Dog"));
        
    }
    
}

class NewStudent{
    private int id;
    private String name;

    public NewStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewStudent{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
