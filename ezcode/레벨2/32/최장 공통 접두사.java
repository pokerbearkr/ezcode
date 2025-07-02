import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 한 줄에 여러 문자열을 공백으로 구분하여 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().trim().split("\\s+");

        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "not exists";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "not exists";
            }
        }

        return prefix;
    }
}
