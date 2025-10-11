package practive.questions;

public class removeDuplicateWIThRealtive {
     System.out.println("Try programiz.pro");
        HashSet<Integer> seen=new HashSet<>();
        
        int[] arr2={8,3,4,5,6,7,1,2,34,55,443};
        int[] arr={1,2,4,3,2,1};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!seen.contains(arr[i])){
            seen.add(arr[i]);
            ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    
}
