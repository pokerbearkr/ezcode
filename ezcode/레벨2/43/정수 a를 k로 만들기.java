import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1_000_001; // K의 최대값 +1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(A, K));
    }

    public static int bfs(int start, int target) {
        boolean[] visited = new boolean[MAX];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0}); // [현재 숫자, 연산 횟수]
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int num = current[0];
            int count = current[1];

            if (num == target) {
                return count;
            }

            // 연산 1: +1
            if (num + 1 < MAX && !visited[num + 1]) {
                visited[num + 1] = true;
                queue.offer(new int[]{num + 1, count + 1});
            }

            // 연산 2: *2
            if (num * 2 < MAX && !visited[num * 2]) {
                visited[num * 2] = true;
                queue.offer(new int[]{num * 2, count + 1});
            }
        }

        return -1; // 도달 불가능 (문제 조건상 이런 경우 없음)
    }
}
