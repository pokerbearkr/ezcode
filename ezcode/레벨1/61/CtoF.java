import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();  // 섭씨 온도 입력

        double fahrenheit = (9.0 / 5.0) * celsius + 32;  // 화씨 계산
        System.out.printf("%.1f\n", fahrenheit);  // 소수 첫째 자리까지 출력
    }
}
