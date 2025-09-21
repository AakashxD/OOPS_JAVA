package Demo;

public class GreenToRed {
    public static void main(String[] args) {
        int n=6;
         int[] arr={70,23,13,26,72,19};
         int greenToRed=0;
         // 0 for red 1 for green;
         int pen=arr[0]%2;
         for(int i=1;i<n;i++){
             if(arr[i]%2==0){
                 if(pen==0) continue;
                 else{
                     // green to red
                     greenToRed++;
                     pen=0;
                 }
             }
             else{
                 if(pen==1) continue;
                 else{
                   pen=1;  
                 }
             }
         }
         System.out.println(greenToRed);
    }
          
}
