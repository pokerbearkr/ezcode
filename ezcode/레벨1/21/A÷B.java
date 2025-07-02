import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력: 한 줄에 두 정수 A, B (0 < A, B < 99999)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        BigDecimal A = new BigDecimal(parts[0]);
        BigDecimal B = new BigDecimal(parts[1]);

        // A / B 계산 후 소수점 둘째 자리에서 반올림
        BigDecimal result = A
            .divide(B, 1, RoundingMode.HALF_UP);

        // 불필요한 지수 표기 없이 출력
        System.out.println(result.toPlainString());
    }
}
