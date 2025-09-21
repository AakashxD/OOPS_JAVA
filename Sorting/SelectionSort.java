import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // divide array into two part sorted and UnSorted // find the min from unsorted and put it in first idx of unsorted idx


        // not a stable sort

        // position swap on random places
        int[] arr={1,5,3,4,3,5,6};
        int n=arr.length;

        for(int i=0;i<arr.length;i++){
            int minIdx=i;
           for(int j=i+1;j<n;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
           }
           if(minIdx!=i){
                int temp=arr[minIdx];
                arr[minIdx]=arr[i];
                arr[i]=temp;
           }
        }
        System.out.println(Arrays.toString(arr));

    }
}
