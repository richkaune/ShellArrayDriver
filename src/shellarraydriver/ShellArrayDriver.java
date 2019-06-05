/*
 * ShellArrayDriver.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 1 Question 1
 * This application prompts the user to enter a number between 10 and 1000 and then performs a Shell sort on the array created
 */

package shellarraydriver;

import java.util.Scanner;

/**
 * Driver class. 
 * @author rkaune
 */
public class ShellArrayDriver 
{
    ShellArray ob;
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int userInput=0;
        Scanner input = new Scanner(System.in);
        
        // prompt the user for a number of integers to sort between 10 and 1000
        do
        {
            System.out.print("Please enter a number between 10 and 1000 numbers to sort with the shell sort: ");
            userInput = input.nextInt();
        } while (userInput < 10 || userInput > 1000);
        
        // create the ShellArray object from the user input and display the starting condition
        ShellArray ob = new ShellArray(userInput);
        System.out.println("Array before sorting"); 
        System.out.println(ob.toString());

        // sort the created array
        ob.sort();

        // display the arrays finishing condition
        System.out.println("Array after sorting"); 
        System.out.println(ob.toString());
        
    } 
    
}
