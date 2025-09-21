import java.util.Arrays;
// not stable sort ( swapping changes relative order of equals elemets)

// time nlogn
public class QuickSort {
    static int parition(int[] arr,int l,int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<=j){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
            
        }
        int temp=arr[j];
        arr[l]=temp;
        arr[j]=pivot;
        return j;
    }
    static void QuickSortFn(int[] arr,int l,int h){
        
        if(l<h){
            int p=parition(arr, l, h);
            QuickSortFn(arr, l, p-1);
            QuickSortFn(arr, p+1, h);
        }
        
    }
    public static void main(String[] args) {
        int[] arr={4,1,2,3,4,5,8,9};
        QuickSortFn(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
