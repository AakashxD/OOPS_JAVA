// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
/**
 * Start from the first index.

Find the minimum element in the unsorted portion of the array.

Swap it with the first unsorted element.

Move the boundary of the sorted part one step forward.

Repeat until the whole array is sorted.
 * 
 * not a stable sorting
 * 
 * practical example -> 🧍 Choosing the shortest line at a store
*/
class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={9,5,4,3,7,8,3,2,2,4,54,65,22,1};
        
        for(int i=0;i<arr.length;i++){
            int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[idx]>arr[j]) idx=j;
            }
            if(idx!=i){
                int temp=arr[idx];
                arr[idx]=arr[i];
                  arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}