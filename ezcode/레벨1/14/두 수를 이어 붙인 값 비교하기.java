import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();

        // a 뒤에 b, b 뒤에 a
        String ab = a + b;
        String ba = b + a;

        // 두 문자열을 비교
        // (길이가 같으므로 사전식 비교로도 수치 비교와 동일)
        if (ab.compareTo(ba) >= 0) {
            System.out.println(ab);
        } else {
            System.out.println(ba);
        }
    }
}
