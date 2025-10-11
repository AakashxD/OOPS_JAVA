// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.Arrays;


/**
 * 
 * 
 * Insertion Sort builds a sorted array one element at a time by comparing and inserting elements in the right place.
It’s in-place, stable, and works best for small or nearly sorted datasets.
Real-world analogy: sorting cards in hand.

 * Start from the second element (since the first one is already sorted).
Pick the current element (key).

Compare it with elements before it.

Shift all elements greater than the key one step to the right.

Insert the key in its correct position.

Repeat for all elements.
*/

class InsertionSort{
    public static void main(String[] args) {
        
        // insertion sort
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(8,4,3,2,88,7,6,5,4,3223,34,43));
        for(int i=1;i<arr.size();i++){
            int j=i-1;
            int ele=arr.get(i);
            while(j>=0 && arr.get(j)>ele){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,ele);
        }
        
        System.out.println(arr);
    }
}