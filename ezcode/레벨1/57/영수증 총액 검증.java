import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();      // 영수증에 적힌 총 금액 X
        int n = sc.nextInt();          // 구매한 물건의 종류 수

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();  // 물건의 가격 a
            int count = sc.nextInt();  // 물건의 개수 b
            sum += price * count;
        }

        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
