import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 예시: 여러 테스트케이스 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line.trim());
            String[] strDigits = br.readLine().trim().split("\\s+");

            int[] digits = new int[n];
            for (int i = 0; i < n; i++) {
                digits[i] = Integer.parseInt(strDigits[i]);
            }

            int[] result = addOneToLastDigit(digits);
            System.out.println(Arrays.toString(result));
        }
    }

    public static int[] addOneToLastDigit(int[] digits) {
        int n = digits.length;

        // 마지막 자리 +1
        digits[n - 1] += 1;

        // 자리올림 처리
        for (int i = n - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i] -= 10;
                digits[i - 1] += 1;
            }
        }

        // 가장 앞자리도 10 이상이면 새로운 배열 생성
        if (digits[0] >= 10) {
            digits[0] -= 10;
            int[] result = new int[n + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }
}
