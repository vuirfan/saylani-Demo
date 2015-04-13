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
public class SaylaniMIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UserLogin user = new UserLogin();
        SaylaniInstitute obj= new SaylaniInstitute();
        
        user.userLoginProcess();
        System.out.println("user name : "+ user.getUserName());

        if(user.getUserName() == "admin")
        Util.getMultipleStudent(obj);
        

        obj.displayAllStudent();

    }
        
        
    }
    
