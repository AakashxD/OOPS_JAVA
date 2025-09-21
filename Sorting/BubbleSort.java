public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,1,4,2,5,4,7,83,9};
        // main idea of bubble sort is make it the bubble max put it in the end

        // not efficent
        // it is a stable sort algo
        //if two element have the same value, their relative order in the array in the sort and original is same
        int n=arr.length;
     //   {1,2,4,3,6,5};
        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }}
            if(!swapped) break;
                
           
        }
    }
}
