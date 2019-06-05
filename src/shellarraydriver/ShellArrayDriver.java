/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellarraydriver;

import java.util.Scanner;

/**
 *
 * @author rkaune
 */
public class ShellArrayDriver {
    ShellArray ob;
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int userInput=0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Please enter a number between 10 and 1000 to sort with the shell sort ");
            userInput = input.nextInt();
        } while (userInput < 10 || userInput > 1000);
        
        ShellArray ob = new ShellArray(userInput);
        System.out.println("Array before sorting"); 
        System.out.println(ob.toString());

        ob.sort();
  
        System.out.println("Array after sorting"); 
        System.out.println(ob.toString());
        
    } 
    
}
