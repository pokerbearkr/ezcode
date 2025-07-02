import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 시
        int M = sc.nextInt(); // 분

        M -= 45; // 45분 앞당기기

        if (M < 0) {
            M += 60;  // 분이 음수면 1시간 줄이고 분에 60 더하기
            H -= 1;
            if (H < 0) {
                H = 23; // 자정 이전이면 23시로
            }
        }

        System.out.println(H + " " + M);
    }
}
