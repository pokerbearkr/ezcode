import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine().trim();

        int rem = 0;
        for (int i = 0; i < num.length(); i++) {
            rem = (rem + (num.charAt(i) - '0')) % 9;
        }

        System.out.println(rem);
    }
}
