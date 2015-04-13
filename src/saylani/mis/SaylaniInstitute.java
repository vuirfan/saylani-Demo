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
public class SaylaniInstitute {

    private int studentCounter = 0;
    private String name;
    private Student[] arrayOfStudent = new Student[3];
    private Teacher[] arrayOfTeacher;

//    SaylaniInstitute(String name)
//    {
//        this.name=name;
//        this.arrayOfStudent=new Student[3];
//    }
    public void addStudent(Student obj) {
        arrayOfStudent[studentCounter] = obj;
        studentCounter++;
    }

    public int getNumberOfStudent() {
        return studentCounter;
    }

    void displayAllStudent() {

        for (Student s : arrayOfStudent) {
            if (s == null) {
                break;
            }
            System.out.println(s);
        }

        System.out.println("name :irfan 	 age :12");
        System.out.println("name :ahmed 	 age :13");
    }

    public int getAllowedStudentCount() {
        return arrayOfStudent.length;
    }

}
