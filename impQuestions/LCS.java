// Online Java Compiler
import java.util.*;

class Main {
    public static void main(String[] args) {
        String s1 = "abdefgd";
        String s2 = "abefdge";

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        // Build DP table
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int size = dp[n1][n2];
        System.out.println("LCS length: " + size);

        // Reconstruct LCS string
        StringBuilder lcs = new StringBuilder();
        int i = n1, j = n2;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        lcs.reverse(); // because we built it backwards
        System.out.println("LCS string: " + lcs.toString());
    }
}
 //     System.out.println("Try programiz.pro");
    //     int n=153;
    //     int digit=String.valueOf(n).length();
    //     int check=0;
    //     int n2=n;
    //     while(n2!=0){
    //         check+=Math.pow(n2%10,digit);
    //         n2=n2/10;
    //     }
    //     if(check==n) System.out.println("Armstrong no");
    //     else System.out.println("Not an Armstrong no");
        
        
    //     // Reverse a string
        
    //     String s="abba";
    //     StringBuilder str=new StringBuilder(s);
        
    //     int i=0;
    //     int j=str.length()-1;
    //     while(i<j){
    //         char ch=str.charAt(i);
    //         str.setCharAt(i,str.charAt(j));
    //         str.setCharAt(j,ch);
    //         i++;
    //         j--;
    //     }
    //     System.out.println(str);
    //     System.out.println(new String(str)==s);
         
    //     System.out.println(str.equals(s));
    //     System.out.println(new String(str).equals(s));
        
        
    //     int e=5;
    //     int fact=1;
    //     while(e!=0){
    //         fact*=e;
    //         e=e-1;
    //     }
    //     System.out.println(fact);
        // max heap
    //     PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
    //     HashSet<Integer> set=new HashSet<>();
    //     // 2 heighest
    //     int[] arr={3,2,1,5,4,3,2};
    //     for( i=0;i<arr.length;i++){
    //         set.add(arr[i]);
    //     }
    //   for(int num:set){
    //       pq.offer(num);
    //       if(pq.size()>2) pq.poll();
    //   }
    //     System.out.println(pq.peek());
    
    
        
        