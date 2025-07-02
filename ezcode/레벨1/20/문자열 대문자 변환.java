import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 표준 입력에서 문자열 한 줄을 읽습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        // String 클래스의 toUpperCase() 메서드로 간단히 변환
        String output = input.toUpperCase();

        System.out.println(output);
    }
}
