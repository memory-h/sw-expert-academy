package d2;

import java.io.*;

/**
 * 1926. 간단한 369게임 D2
 */
public class Solution_1926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);

            int count = count369Digits(str);

            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    sb.append("-");
                }
            } else {
                sb.append(str);
            }

            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int count369Digits(String s) {
        int cnt = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
                cnt++;
            }
        }

        return cnt;
    }

}