package Demo;

import java.util.*;

class Main {
    static boolean perfectSqr(int num) {
        if (((int)Math.pow((int)Math.sqrt(num), 2)) == num) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s = "abcd";
        int n = s.length();
        StringBuilder result = new StringBuilder(s);
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int position = c - 'a' + 1; // a=1, b=2, c=3, etc.
            
            if (perfectSqr(position)) {
                int k = (int)Math.sqrt(position);
                
                // Check if left or right neighbor has position k
                boolean hasNeighborK = false;
                
                if (i > 0) {
                    char leftChar = s.charAt(i - 1);
                    int leftPosition = leftChar - 'a' + 1;
                    if (leftPosition == k) hasNeighborK = true;
                }
                
                if (i < n - 1) {
                    char rightChar = s.charAt(i + 1);
                    int rightPosition = rightChar - 'a' + 1;
                    if (rightPosition == k) hasNeighborK = true;
                }
                
                // If no neighbor has position k, replace with character at position k
                if (!hasNeighborK) {
                    char replacement = (char)('a' + k - 1);
                    result.setCharAt(i, replacement);
                }
            }
        }
        
        System.out.println("Result: " + result.toString());
    }
}

