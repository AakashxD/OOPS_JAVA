import java.util.*;

class validAna{
    public static void main(String[] args) {
        
         System.out.println("Try programiz.pro");
        
        String s="abcbe";
        String t="ebacb";
        if(s.length()!=t.length()){
            System.out.println("Not a anagram");
        }
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        char[] s2=t.toCharArray();
        Arrays.sort(s2);
        System.out.println(s1);
        System.out.println(s2);
        if(Arrays.equals(s2,s1)){
            System.out.println("VAlid ANaGRAM");
        }
        else{
            System.out.println("NOt a valid anagram");
        }
         HashMap<Character,Integer> mp=new HashMap<>();
       String s="abcbe";
       String t="ebaee";
       for(int i=0;i<s.length();i++){
           mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
       }
       map.forEach((key, value) -> {
    System.out.println("Key: " + key + ", Value: " + value);
});
       for(int i=0;i<t.length();i++){
           if(mp.containsKey(t.charAt(i))){
               mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
               if(mp.get(t.charAt(i))==0){
                   mp.remove(t.charAt(i));
               }
           }
           else{
               System.out.println("NOt Valid");
               break;
           }
       }
       System.out.println("valid ANagram");
        mp.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}