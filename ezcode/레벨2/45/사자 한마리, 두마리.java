import java.io.*;
import java.util.*;

public class Main {
    static int H, W;
    static char[][] grid;
    static boolean[][] visited;

    static int[] dx = { -1, 1, 0, 0 }; // 상하좌우
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            grid = new char[H][W];
            visited = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                grid[i] = br.readLine().toCharArray();
            }

            int count = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (grid[i][j] == '#' && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < H && ny >= 0 && ny < W) {
                if (grid[nx][ny] == '#' && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
