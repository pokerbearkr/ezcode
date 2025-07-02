import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 현재 시각 시(hour)
        int B = sc.nextInt(); // 현재 시각 분(minute)
        int C = sc.nextInt(); // 요리 시간 (분 단위)

        int totalMinutes = A * 60 + B + C; // 총 분으로 환산

        int endHour = (totalMinutes / 60) % 24; // 24시간 기준 시 계산
        int endMinute = totalMinutes % 60;

        System.out.println(endHour + " " + endMinute);
    }
}
