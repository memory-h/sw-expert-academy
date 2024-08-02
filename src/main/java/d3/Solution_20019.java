package d3;

import java.io.*;

/**
 * 20019. 회문의 회문 D3
 */
public class Solution_20019 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String s = br.readLine();
            int length = s.length();

            if (palindrome(s, length)) {
                sb.append("#").append(idx++).append(" ").append("YES\n");
            } else {
                sb.append("#").append(idx++).append(" ").append("NO\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean palindrome(String s, int length) {
        int len = length / 2;

        if (length % 2 != 0) {
            len += 1;
        }

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(len + i)) {
                return false;
            }
        }

        return true;
    }

}