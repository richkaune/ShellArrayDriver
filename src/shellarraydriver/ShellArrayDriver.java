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
//        do
//        {
//            System.out.print("Please enter a number between 10 and 1000 numbers to sort with the shell sort: ");
//            userInput = input.nextInt();
//        } while (userInput < 10 || userInput > 1000);
        
        // test the ShellArray class with varying arrays of different sizes.
        ShellArray ob = new ShellArray(100);
        ShellArray ob1 = new ShellArray(1000);
        ShellArray ob2 = new ShellArray(10000);
        ShellArray ob3 = new ShellArray(100000);
        
        // create the ShellArray object from the user input and display the starting condition
//        ShellArray ob = new ShellArray(userInput);
//        System.out.println("Array before sorting"); 
        System.out.println("Array0 before sorting");
        System.out.println(ob.toString());
        System.out.println("Array1 before sorting");
        System.out.println(ob1.toString());
        System.out.println("Array2 before sorting");
        System.out.println(ob2.toString());
        System.out.println("Array3 before sorting");
        System.out.println(ob3.toString());

        // sort the created arrays
        ob.sort();
        ob1.sort();
        ob2.sort();
        ob3.sort();

        // display the arrays finishing condition
        System.out.println("Array0 after sorting"); 
        System.out.println(ob.toString());
        System.out.println("Array1 after sorting"); 
        System.out.println(ob1.toString());
        System.out.println("Array2 after sorting"); 
        System.out.println(ob2.toString());
        System.out.println("Array3 after sorting"); 
        System.out.println(ob3.toString());
        
    } 
    
}
