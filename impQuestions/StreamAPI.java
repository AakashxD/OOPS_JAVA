package impQuestions;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StreamAPI {
    // stream only use once 
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(3,4,3,2,1,67,8,6,40);
       nums.stream()
            .sorted()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2) 
            .forEach(n->System.out.println(n));
    }
}
// FUNCtional Interface to make it functional Interface
