import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());  // 첫 줄은 명령 개수

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] cmd = sc.nextLine().split(" ");

            switch (cmd[0]) {
                case "add":
                    set.add(Integer.parseInt(cmd[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(cmd[1]));
                    break;
                case "check":
                    sb.append(set.contains(Integer.parseInt(cmd[1])) ? "1" : "0").append("\n");
                    break;
                case "toggle":
                    int x = Integer.parseInt(cmd[1]);
                    if (set.contains(x)) set.remove(x);
                    else set.add(x);
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        System.out.print(sb);
    }
}
