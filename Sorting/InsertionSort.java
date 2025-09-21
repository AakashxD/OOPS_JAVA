import java.util.*;
public class InsertionSort {
// Divide the array into two parts:

// Sorted part (initially contains the first element).

// Unsorted part (rest of the array).

// Pick elements from the unsorted part one by one and insert them into the correct position in the sorted part.

// Shift elements in the sorted part as needed to make space for the element being inserted.

// it is a stable sort



//Stability means: if two elements are equal, their relative order does not change after sorting.

// In Insertion Sort, when inserting an element into the sorted part, you shift only the elements that are greater than the current element.

// Equal elements are never swapped, so their original order is preserved.
    public static void main(String[] args) {
        int[] arr={1,5,3,4,3,5,6};
         int n=arr.length;
         for(int i=1;i<n;i++){
            int j=i-1;
            int ele=arr[i];
            while(j>=0 && arr[j]>ele){
                   arr[j+1]=arr[j]; 
                   j--;
              }

              arr[j+1]=ele;
         }
         System.out.println(Arrays.toString(arr));
    }
         
}
