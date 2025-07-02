import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println("happy");
        } else {
            System.out.println("unhappy");
        }
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; // 순환 발생 → 불행한 수
            }
            seen.add(n);
            n = getNext(n);
        }

        return true; // 1에 도달 → 행복한 수
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
