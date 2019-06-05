/**
 *
 * @author rkaune
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
    
    
    public ShellArray (int size)
    {
        //creates array 
        arr = new Integer[size];

        Random generator = new Random();

        //loads array with random ints
        for(int x = 0; x < arr.length; x++)
        {
                arr[x] = generator.nextInt(10);//set back to 1 million

        }
    }
    
    public Integer[] getArr ()
    {
        return this.arr;
    }
    
    void sort ()
    {
        int gap=arr.length;
        boolean swapflag = false;
        gap /=2;
        //System.out.println(gap);
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
                        System.out.println(this.toString()); 
                        swapflag = true;
                    }
                }

            }
            gap/=2;
        }
    }
        
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
