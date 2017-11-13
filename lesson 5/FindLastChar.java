/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findlastchar;

/**
 *
 * @author george
 */
public class FindLastChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String buffer3 = "10hel10lo10";
        int i = buffer3.length()-1;
        int charCount = -1;
        char temp;
        int position[];
        do {
            temp = buffer3.charAt( i );

            if( temp.isLetter('l') ){
                charCount++;
                position.add(i);
            }
            i--;
        }while(i < buffer3.length());
        
        
    }
    
}
