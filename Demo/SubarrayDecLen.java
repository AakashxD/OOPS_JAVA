 class SubarrayDecLen {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,3,5,6,4,3,2,1};
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int cnt=0;
            int j=i;
            while(j<n-1 && arr[j]>arr[j+1]){
                cnt++;
                j++;
            }
            i=j;
            maxi=Math.max(maxi,cnt+1);
        }
        System.out.println(maxi);
    }
    
}
