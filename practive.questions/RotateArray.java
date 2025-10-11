 public static void rotateFn(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={2,4,3,1,6,7};
        // 3,4,2,7,6,1-> 1,6,7,2,4,3
        int k=3;// k left rotate
        rotateFn(arr,0,k-1);
        rotateFn(arr,k,arr.length-1);
        rotateFn(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
        
        
    }