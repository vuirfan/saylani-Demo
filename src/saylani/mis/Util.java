/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saylani.mis;


import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Util {
    
    
    public static Student getStudent(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter age");
        int age=in.nextInt();
        System.out.println("Enter name");
        String name=in.next();
        return new Student(name,age);

    }
    public static void getMultipleStudent(SaylaniInstitute uni){

        boolean doContinue=true;
        do {
            uni.addStudent(getStudent());
            Scanner in=new Scanner(System.in);
            System.out.println("Do you want to add another Student(y/n)?");
            char ch=in.next().charAt(0);

            if (uni.getAllowedStudentCount()== uni.getNumberOfStudent()
                    || (ch=='n'||ch=='N')) {
                doContinue = false;
            }

        }while(doContinue);

    }
    
}
