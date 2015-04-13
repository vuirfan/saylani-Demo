/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saylani.mis;

/**
 *
 * @author admin
 */
public class Student {
    
        String name;
    int age;

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "name :"+name+" \t age :"+age;
    }
    //testing
    
}
