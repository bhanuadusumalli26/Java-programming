
import java.util.*;

class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        finalresult(l, u);
    }

    public static void finalresult(int l, int u) {
        int sum = 0;
        for (int i = l; i <= u; i++) {
            sum += i;
        }
        if (sum % 2 == 1) {
            primenumbers(l, u);
        } else {
            factorialsum(l, u);
        }
    }

    public static void primenumbers(int l, int u) {
        int primesum = 0;
        for (int i = l; i <= u; i++) {
            if (isprime(i)) {
                primesum += i;
                System.out.println(i);
            }
        }
        System.out.println(primesum);
    }

    public static void factorialsum(int l, int u) {
        int sum = 0;
        for (int i = l; i <= u; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }

    public static boolean isprime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
