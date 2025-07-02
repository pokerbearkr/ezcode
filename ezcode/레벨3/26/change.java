import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine().trim());

        int change = 1000 - price;

        int count100 = change / 100;
        change %= 100;

        int count50 = change / 50;
        change %= 50;

        int count10 = change / 10;

        System.out.println(count100 + " " + count50 + " " + count10);
    }
}
