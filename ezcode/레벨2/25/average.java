import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력: 한 줄에 네 정수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        long sum = 0;
        for (String p : parts) {
            sum += Long.parseLong(p);
        }
        // 평균 = sum / 4.0
        BigDecimal avg = new BigDecimal(sum)
            .divide(new BigDecimal(4), 10, RoundingMode.HALF_UP); 
        // 소수점 셋째 자리에서 반올림하여 둘째 자리까지
        avg = avg.setScale(2, RoundingMode.HALF_UP);
        System.out.println(avg.toPlainString());
    }
}
