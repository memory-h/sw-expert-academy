package d3;

import java.io.*;

/**
 * 14555. 공과 잡초 D3
 */
public class Solution_14555 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String s = br.readLine();
            int count = 0;

            if (s.length() != 1) {
                count = getMinimumBallCount(s, count);
            }

            sb.append("#").append(idx++).append(" ").append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getMinimumBallCount(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2 && s.charAt(i) == '(' && s.charAt(i + 1) == '|') {
                count++;
            } else if (i > 0 && s.charAt(i - 1) == '|' && s.charAt(i) == ')') {
                count++;
            } else if (i <= s.length() - 2 && s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                count++;
            }
        }

        return count;
    }

}