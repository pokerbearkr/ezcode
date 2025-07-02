import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine().trim();
        // 9로 나눈 나머지를 직접 누적
        int remainder = 0;
        for (int i = 0; i < num.length(); i++) {
            remainder = (remainder + (num.charAt(i) - '0')) % 9;
        }
        System.out.println(remainder);
    }
}
