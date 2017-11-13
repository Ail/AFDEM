/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java_application_1;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author george
 */
public class Simple_java_application_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Person person = new Person();
        Scanner stdin = new Scanner(System.in);
       
        person.setfirstName(stdin);     //String name = stdin.nextLine();
        System.out.println("Hello " + person.getfirstName());
        person.setlastName(stdin);
        person.setbDate(stdin);
        person.setfatherName(stdin);

        stdin.close();
        // Print whats gathered to a file
        System.out.println("printing........");
       
        PrintWriter writer = new PrintWriter("lastname.firstname.txt", "UTF-8");
        writer.println("Your name is: " + person.getfirstName() + " and your surname is " + person.getlastName());
        writer.println("Your father's name is " + person.getfatherName() + " and your birthday is " + person.getbDate());
        writer.close();
        System.out.println("file is ready");
            

        
        
    }
    
}
