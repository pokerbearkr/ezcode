import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ransomNote;
        String magazine;

        while ((ransomNote = br.readLine()) != null && (magazine = br.readLine()) != null) {
            System.out.println(canConstruct(ransomNote, magazine));
        }
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26]; // a~z 문자 수 카운트

        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (--counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
