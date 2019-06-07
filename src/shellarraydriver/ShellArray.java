/**
 * ShellArrayDriver.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 1 Question 1
 * This application prompts the user to enter a number between 10 and 1000 and then performs a Shell sort on the array created
 */

package shellarraydriver;

import java.util.Random;


/**
 * The ShellArray Class is the solution for the first lab of COMP2231
 * It creates and populates and array of random integers and implements the Shell sort as a method of the class
 * @author rkaune
 */
public class ShellArray 
{
    private Integer[] arr;
    
    /**
     * ShellArray constructor, instantiates a ShellArray object with the size supplied by the user
     * @param size 
     */
    public ShellArray (int size)
    {
        //creates array 
        arr = new Integer[size];
        
        Random generator = new Random();

        //loads array with random integers
        for(int x = 0; x < arr.length; x++)
        {
                arr[x] = generator.nextInt(10);

        }
    }
    /**
     * Getter to access the array contents
     * @return the array
     */
    public Integer[] getArr ()
    {
        return this.arr;
    }
    
    /**
     * The sort method is implemented as a method of the ShellArray class
     */
    void sort ()
    {
        int gap=arr.length;
        boolean swapflag = false;
        gap /=2;
        
        // Shell algorithm based on provided pseudo-code
        while (gap>0)
        {
            swapflag = true;
            while (swapflag) 
            {
                swapflag = false;
                for (int s=0; s<arr.length-gap; s++)
                {
                    if (arr[s]>arr[s+gap])
                    {
                        int temp;
                        temp = arr[s];
                        arr[s]=arr[s+gap];
                        arr[s+gap]= temp;
                        //System.out.println(this.toString()); 
                        swapflag = true;
                    }
                }
            }
            gap/=2;
        }
    }
    /**
     * The overridden toString() method to display the contents in a proper form
     * @return 
     */    
    @Override
    public String toString() 
    { 
        int n = arr.length;
        String arrayString="";
           for (int i=0; i<n; i++) 
            arrayString += arr[i] + " "; 
        return arrayString;
    }     
    
    
}
