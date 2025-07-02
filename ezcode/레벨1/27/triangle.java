import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");

        double base = Double.parseDouble(parts[0]);
        double height = Double.parseDouble(parts[1]);

        double area = (base * height) / 2.0;

        // 소수 둘째 자리에서 반올림 출력
        BigDecimal result = new BigDecimal(area).setScale(1, RoundingMode.HALF_UP);
        System.out.println(result.toPlainString());
    }
}
