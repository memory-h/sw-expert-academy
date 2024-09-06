package d2;

import java.io.*;

/**
 * 1986. 지그재그 숫자 D2
 */
public class Solution_1986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int result = 1;

            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    result -= i;
                } else {
                    result += i;
                }
            }

            sb.append("#").append(idx++).append(" ").append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}