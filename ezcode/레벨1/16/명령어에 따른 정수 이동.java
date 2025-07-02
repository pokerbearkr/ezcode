import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        int cur = Integer.parseInt(parts[0]);
        String cmd = parts[1];

        for (char c : cmd.toCharArray()) {
            switch (c) {
                case 'w': cur += 1;  break;
                case 's': cur -= 1;  break;
                case 'd': cur += 10; break;
                case 'a': cur -= 10; break;
                default:
                    // 정의되지 않은 명령어는 무시하거나 예외 처리할 수 있습니다.
                    throw new IllegalArgumentException("Invalid command: " + c);
            }
        }

        System.out.println(cur);
    }
}
