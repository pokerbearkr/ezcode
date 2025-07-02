import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 BufferedReader로 빠르게 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line.trim()); // 자릿수 개수
            String[] digitStr = br.readLine().trim().split("\\s+");

            int[] digits = new int[n];
            for (int i = 0; i < n; i++) {
                digits[i] = Integer.parseInt(digitStr[i]);
            }

            int[] result = plusOne(digits);
            System.out.println(Arrays.toString(result));
        }
    }

    // digits 배열에 1을 더한 결과를 반환
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
