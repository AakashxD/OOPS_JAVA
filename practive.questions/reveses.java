package practive.questions;

public class reveses {
     String s="abcdef";
     StringBuilder str=new StringBuilder(s);
     int i=0;
     int j=str.length()-1;
     while(i<j){
         char temp=str.charAt(i);
         str.setCharAt(i,str.charAt(j));
         str.setCharAt(j,temp);
         i++;
         j--;
     }
        System.out.println(str.toString());
        
}
