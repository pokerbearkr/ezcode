import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = reverseString(s);
        System.out.println(reversed);
    }

    public static String reverseString(String s) {
        // 방법 1: StringBuilder 사용
        return new StringBuilder(s).reverse().toString();
    }
}
