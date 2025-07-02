import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 합
        int d = sc.nextInt(); // 차

        if ((s + d) % 2 != 0 || (s - d) % 2 != 0 || s < d) {
            System.out.println("impossible");
            return;
        }

        int x = (s + d) / 2;
        int y = (s - d) / 2;

        System.out.println(x + " " + y);
    }
}
