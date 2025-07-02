import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // 첫 번째 숫자
        int b = sc.nextInt();  // 두 번째 숫자
        int c = sc.nextInt();  // 세 번째 숫자

        int reward;

        if (a == b && b == c) {
            // 세 수가 모두 같을 때
            reward = 12000 + a * 1200;
        } else if (a == b || a == c) {
            // 두 수가 같을 때 (a와 b or a와 c)
            reward = 1500 + a * 120;
        } else if (b == c) {
            // 두 수가 같을 때 (b와 c)
            reward = 1500 + b * 120;
        } else {
            // 모두 다를 때
            int max = Math.max(a, Math.max(b, c));
            reward = max * 90;
        }

        System.out.println(reward);
    }
}
