import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄에 두 자연수 a, b 입력
        String[] parts = br.readLine().trim().split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        int area = a * b;
        System.out.println(area);
    }
}
