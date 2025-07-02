import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim());
        
        // 등차수열 합 공식: N*(N+1)/2
        long sum = N * (N + 1) / 2;
        System.out.println(sum);
    }
}
