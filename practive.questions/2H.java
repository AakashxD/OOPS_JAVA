package practive.questions;

public class 2H {
    PriorityQueue<Integer> max=new PriorityQueue<>();
       int[] arr={8,4,3,2,6,7,5,4,32};
       for(int i=0;i<arr.length;i++){
           max.offer(arr[i]);
            if(max.size()>2){
               max.poll();
           }
       }
       System.out.println(max.peek());
}
