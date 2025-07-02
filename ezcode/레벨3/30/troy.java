import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int horseCount = Integer.parseInt(br.readLine().trim()); // 만들고 싶은 목마 수
        int woodCount = Integer.parseInt(br.readLine().trim());  // 현재 가진 목재 수

        if (woodCount >= horseCount * 1000) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }
    }
}
