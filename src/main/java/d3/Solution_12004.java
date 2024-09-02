package d3;

import java.io.*;

/**
 * 12004. 구구단 1 D3
 */
public class Solution_12004 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            boolean isCondition = false;

            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (i * j == n) {
                        isCondition = true;
                        break;
                    }
                }
            }

            sb.append("#").append(idx++);

            if (isCondition) {
                sb.append(" Yes\n");
            } else {
                sb.append(" No\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}