import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 로마 숫자 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        // 로마 숫자 값 매핑
        Map<Character, Integer> romanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = romanMap.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (cur < next) {
                total -= cur;  // 특수 조합 처리
            } else {
                total += cur;
            }
        }

        System.out.println(total);
    }
}
