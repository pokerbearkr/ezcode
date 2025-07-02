import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long black = sc.nextLong(); // black beans count (not used)
        long white = sc.nextLong(); // white beans count

        if (white % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("white");
        }
    }
}
