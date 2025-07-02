import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 줄: 배열 요소들을 공백으로 분리하여 입력
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        // 두 번째 줄: limit
        int limit = Integer.parseInt(br.readLine().trim());

        int result = firstExceedSum(list, limit);
        System.out.println(result);
    }

    /**
     * arr를 앞에서부터 더해 가다가, 누적합이 limit보다 커지는 순간의 누적합을 반환.
     * @param arr   정수 리스트
     * @param limit 기준값 (0 ≤ limit < arr의 총합)
     * @return 누적합이 limit를 초과하는 순간의 합
     */
    public static int firstExceedSum(List<Integer> arr, int limit) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
            if (sum > limit) {
                return sum;
            }
        }
        // 문제 조건상 여기에 도달하지 않음
        return sum;
    }
}
