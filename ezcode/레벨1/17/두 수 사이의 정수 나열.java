import java.io.*;
import java.util.*;

public class Main {
    /**
     * from 이상 to 이하 모든 정수를 오름차순으로 담은 배열을 반환합니다.
     * @param from 시작값 (0 ≤ from ≤ to ≤ 50)
     * @param to   끝값
     * @return from..to 범위의 정수 배열
     */
    public static int[] makeRange(int from, int to) {
        int n = to - from + 1;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = from + i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // 입력: 한 줄에 두 정수 from, to
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int from = Integer.parseInt(st.nextToken());
        int to   = Integer.parseInt(st.nextToken());

        int[] range = makeRange(from, to);
        // 출력: 배열 형태로
        System.out.println(Arrays.toString(range));
    }
}
