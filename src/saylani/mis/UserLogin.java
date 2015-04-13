/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saylani.mis;

import java.util.Scanner;
import static saylani.mis.Util.getStudent;
/**
 *
 * @author admin
 */
public class UserLogin {
    
    private String name1 = "admin";
    private String psw1 = "1";
    private String userName = "";


    
    
    public void userLoginProcess(){


            Scanner in=new Scanner(System.in);
            System.out.print("Enter username : ");
            String name = in.nextLine();
            System.out.print("Enter password : ");
            String psw = in.nextLine();
            
            if (name.equals(name1) && psw.equals(psw1)){
        
                userName = name1;

            }else
             userName = "student";
    }

        
        
    public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        this.userName = user;
    }
    
}