import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P); // 오름차순 정렬

        int total = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += P[i];     // 각 사람의 대기 시간 (이전까지 합)
            total += sum;    // 전체 시간 누적
        }

        System.out.println(total);
    }
}
