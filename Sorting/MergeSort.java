import java.util.Arrays;
// merge sort is a stable sort

// can optimize space but in worst case the complexity will rise up to n^2logn
public class MergeSort {
    static void mergeSort(int[] arr,int s,int e){

       
        if(s<e){
             int mid=(s+(e-s)/2);
           mergeSort(arr,s,mid);
           mergeSort(arr, mid+1, e);
           mergeArr(arr, s, mid, e);
        }
        
    }

    static void mergeArr(int[] arr,int l,int mid,int end){
    int n1 = mid - l + 1;
    int n2 = end - mid;

    int[] left = new int[n1];
    int[] right = new int[n2];

    for(int i=0;i<n1;i++) left[i] = arr[l+i];
    for(int i=0;i<n2;i++) right[i] = arr[mid+1+i];

    int i=0, j=0, k=l;

    while(i<n1 && j<n2){
        if(left[i] <= right[j]){
            arr[k++] = left[i++];
        } else {
            arr[k++] = right[j++];
        }
    }

    while(i<n1) arr[k++] = left[i++];
    while(j<n2) arr[k++] = right[j++];
}

    public static void main(String[] args) {
        int[] arr={1,5,3,4,3,5,6};
         int n=arr.length;

        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
