import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력/출력을 위해 BufferedReader, BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫 줄: 저장된 사이트 수 N, 조회할 사이트 수 M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 사이트 주소 - 비밀번호 저장용 Map
        Map<String, String> map = new HashMap<>();

        // N개의 사이트 정보 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            map.put(site, password);
        }

        // M개의 조회 요청 처리
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            sb.append(map.get(query)).append('\n');
        }

        // 결과 출력
        System.out.print(sb);
    }
}
