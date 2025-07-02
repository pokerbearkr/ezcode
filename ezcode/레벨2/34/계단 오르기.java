import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1; // f(1)
        int b = 2; // f(2)
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}
