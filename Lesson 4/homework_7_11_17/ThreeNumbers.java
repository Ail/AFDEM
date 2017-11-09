/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threenumbers;

import java.util.Scanner;

/**
 *
 * @author george
 */
public class ThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean right = false;
        while (!right ){
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("give me a number: ");
            int num1 = scanner.nextInt();

            System.out.println("give me a 3 times bigger number: ");
            int num2 = scanner.nextInt();
            while(num2 < 3*num1){
                System.out.println("give me a 3 times bigger number: ");
                num2 = scanner.nextInt();
            }
            
            System.out.println("give me a number bigger then the sum of the other two: ");
            int num3 = scanner.nextInt();
            while(num3 < num1 + num2){
                System.out.println("give me a number bigger then the sum of the other two: ");
                num3 = scanner.nextInt();
            }
            right = true;
            System.out.print("number one: " + num1 + " number two: " + num2 + " number three: " + num3 + "\n");
        }
        
        
    }
    
}
