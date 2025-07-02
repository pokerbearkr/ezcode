import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kLine, sLine;

        while ((kLine = br.readLine()) != null && (sLine = br.readLine()) != null) {
            int k = Integer.parseInt(kLine.trim());
            String s = sLine.trim();
            System.out.println(reformatLicenseKey(s, k));
        }
    }

    public static String reformatLicenseKey(String s, int k) {
        // 1. 대시 제거, 대문자로 변환
        String cleaned = s.replaceAll("-", "").toUpperCase();

        // 2. 뒤집어서 오른쪽부터 k개씩 처리
        StringBuilder sb = new StringBuilder(cleaned).reverse();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % k == 0) {
                result.append("-");
            }
            result.append(sb.charAt(i));
        }

        // 3. 다시 뒤집어서 반환
        return result.reverse().toString();
    }
}
