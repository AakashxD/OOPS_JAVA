package impQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorLearning {
    // It is an interface in java.util package that defines a contract for ordered
    // collections — allows duplicates and preserve order
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>(); // ✅ preferred way (uses interface type)
        // ArrayList<Integer> arrayList = new ArrayList<>(); // specific implementation
      Comparator<Integer> com = new Comparator<Integer>() {
           
            public int compare(Integer a, Integer b) {
                return b - a; // descending
            }
        };

        List<Integer> nums=new ArrayList<>();
        nums.add(33);
        nums.add(21);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(98);
        
      Collections.sort(nums,com);
      System.out.println(nums);
    }
}
