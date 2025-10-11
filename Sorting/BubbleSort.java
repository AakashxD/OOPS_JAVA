// Online Java Compiler
// Use this editor to write, compile and run your Java code 
// import java utilites  classes of java from the package


import java.util.*;
class BubbleSort {
  /**  
   * its stable sorting relative order of element is preserve
   * 
 “This code implements Bubble Sort with an optimization using a flag variable.
 The algorithm repeatedly compares adjacent elements and swaps them if needed.
After each pass, the largest unsorted element ‘bubbles up’ to its correct position.
 The optimization helps stop early if the array becomes sorted before all passes.”
 */
    public static void main(String[] args) {
       int[] arr={8,4,3,5,67,8,9};
       //Each pass moves the largest unsorted element to its correct position at the end.
       for(int i=0;i<arr.length;i++){
           boolean isSorted=false;
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   isSorted=true;
               }
           }
           if(!isSorted) break;
       }
       System.out.println(Arrays.toString(arr));
        
    }
}