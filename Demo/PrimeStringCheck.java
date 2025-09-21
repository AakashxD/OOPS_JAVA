import java.util.*;

class Main {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // read input

        int size = str.length();
        int sum = 0;

        if (isPrime(size)) {
            for (int i = 0; i < str.length(); i++) {
                sum += (int) str.charAt(i);
            }

            if (isPrime(sum)) {
                System.out.println("prime");
            } else {
                System.out.println("non prime");
            }
        } else {
            System.out.println("non prime");
        }
    }
}
