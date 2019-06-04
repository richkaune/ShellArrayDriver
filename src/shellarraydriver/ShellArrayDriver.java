/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellarraydriver;

/**
 *
 * @author rkaune
 */
public class ShellArrayDriver {

    static void printArray(int arr[]) 
    { 
         int n = arr.length;
           for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
//    /* function to sort arr using shellSort */
      

//    int sort(int arr[]) 
//   { 
//        int n = arr.length; 
////  
////        // Start with a big gap, then reduce the gap 
//        for (int gap = n/2; gap > 0; gap /= 2){ 
////            // Do a gapped insertion sort for this gap size. 
////            // The first gap elements a[0..gap-1] are already 
////            // in gapped order keep adding one more element 
////            // until the entire array is gap sorted 
//            for (int i = gap; i < n; i += 1) 
//           { 
////                // add a[i] to the elements that have been gap 
////                // sorted save a[i] in temp and make a hole at 
////                // position i 
//                int temp = arr[i]; 
////  
////                // shift earlier gap-sorted elements up until 
////                // the correct location for a[i] is found 
//                int j; 
//               for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
//                    arr[j] = arr[j - gap]; 
////  
////                // put temp (the original a[i]) in its correct 
////                // location 
//                arr[j] = temp; 
//            } 
//        } 
//        return 0; 
//    } 
    
//    int sort(int arr[]) 
//    { 
//        int n = arr.length; 
//        for (int gap = n/2; gap > 0; gap /= 2) 
//        { 
//            
//            for (int i = gap; i < n; i += 1) 
//            { 
//                int temp = arr[i]; 
//                int j; 
//                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
//                    arr[j] = arr[j - gap]; 
//                arr[j] = temp; 
//                printArray(arr);
//            } 
//             
//        } 
//        return 0; 
//    }
    
    int sort (int arr[]){
        int gap=arr.length;
        boolean swapflag = false;
        gap /=2;
        //System.out.println(gap);
        while (gap>0){
            swapflag = true;
            while (swapflag) {
                swapflag = false;
                for (int s=0; s<arr.length-gap; s++){
                    if (arr[s]>arr[s+gap]){
                        int temp;
                        temp = arr[s];
                        arr[s]=arr[s+gap];
                        arr[s+gap]= temp;
                        printArray(arr); 
                        swapflag = true;
                    }
                }
                
            }
            //System.out.println(gap);
            gap/=2;
        } 
        return 0;
    }
  
    // Driver method 
    public static void main(String args[]) 
    { 
       // int arr[] = {12, 34, 54, 2, 3, 5 ,7 , 21}; 
        int arr[] = {9,6,8,12,3,1,7}; 
        System.out.println("Array before sorting"); 
        printArray(arr); 
  
        ShellArrayDriver ob = new ShellArrayDriver(); 
        ob.sort(arr); 
  
        System.out.println("Array after sorting"); 
        printArray(arr); 
    } 
    
}
