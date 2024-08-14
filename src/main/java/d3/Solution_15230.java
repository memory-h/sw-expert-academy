package d3;

import java.io.*;

/**
 * 15230. 알파벳 공부 D3
 */
public class Solution_15230 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        while (t-- > 0) {
            String s = br.readLine();
            int count = 0;

            // 성훈이가 적은 알파벳을 순서대로 보면서 앞에서부터 몇 개의 알파벳이 순서에 맞게 적혀 있는지 구한다.
            count = countMatchingPrefixChars(s, alphabet, count);

            sb.append("#").append(idx++).append(" ").append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int countMatchingPrefixChars(String s, char[] alphabet, int count) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == alphabet[i]) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

}