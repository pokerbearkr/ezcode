import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        if (N % 2 == 0) {
            System.out.println("Jjak");
        } else {
            System.out.println("Holl");
        }
    }
}
