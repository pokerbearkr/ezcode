import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split("\\s+");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        int quotient = A / B;
        int remainder = A % B;

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
