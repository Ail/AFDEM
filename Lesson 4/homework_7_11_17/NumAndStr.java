/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumAndStr;

import java.util.Scanner;

/**
 *
 * @author george
 */
public class NumAndStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a number: ");
        int num = scanner.nextInt();
        System.out.println("give me a string: ");
        String str = scanner.next();
        System.out.printf(str + " " + num + "\n");
    }
    
}
