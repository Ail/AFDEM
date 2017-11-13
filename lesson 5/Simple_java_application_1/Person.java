/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java_application_1;

import java.util.Scanner;

/**
 *
 * @author george
 */
public class Person {
    
    private String lastName;
    private String firstName;
    private String fatherName;
    private String bDate;
    
    // get set lastName
    public String getlastName(){
        return lastName;
    }
    public void setlastName(Scanner scan){
        System.out.print("Enter your last name: ");
        this.lastName = scan.nextLine();
    }
    // get set firstName
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(Scanner scan){
        System.out.print("Enter your first name: ");
        this.firstName = scan.nextLine();
    }
    // get set fatherName
    public String getfatherName(){
        return fatherName;
    }
    public void setfatherName(Scanner scan){
        System.out.print("Enter your father's name: ");
        this.fatherName = scan.nextLine();
    }
    // get set bDate
    public String getbDate(){
        return bDate;
    }
    public void setbDate(Scanner scan){
        System.out.print("Enter your birthday dd/mm/yyyy: ");
        this.bDate = scan.nextLine();
    }
}
