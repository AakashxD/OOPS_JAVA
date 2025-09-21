import java.util.Arrays;

class MaxBoxRead{
     public static void main(String[] args) {
        int[] arr={5,3,2,8};
        int n=10;
        int size=4;
        Arrays.sort(arr);
        int i=0;
        int count=0;
        while(n>=arr[i]){
            n-=arr[i];
            count++;
            i++;
        }
        System.out.println(count);
    }
}