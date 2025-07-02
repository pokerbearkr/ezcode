import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextInt();
        }

        Arrays.sort(sides); // 오름차순 정렬

        int a = sides[0], b = sides[1], c = sides[2];
        int sumSq = a * a + b * b;
        int cSq = c * c;

        if (sumSq == cSq) {
            System.out.println("right");
        } else if (sumSq > cSq) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}
