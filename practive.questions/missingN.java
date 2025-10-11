package practive.questions;

public class missingN {
    int[] arr={2,4,3,1};
        int n=5;
        int totalSum=n*(n+1)/2;
        int currSum=0;
        for(int i=0;i<arr.length;i++) currSum+=arr[i];
        System.out.println(totalSum-currSum);
}
