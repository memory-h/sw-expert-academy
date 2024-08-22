package d2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2001. 파리 퇴치 D2
 */
public class Solution_2001 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];
            int[][] prefixSum = new int[n + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 1; j <= n; j++) {
                    arr[i - 1][j - 1] = Integer.parseInt(st.nextToken());
                    prefixSum[i][j] = arr[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
                }
            }

            int max = -1;

            for (int i = m; i <= n; i++) {
                for (int j = m; j <= n; j++) {
                    int sum = prefixSum[i][j] - prefixSum[i - m][j] - prefixSum[i][j - m] + prefixSum[i - m][j - m];
                    max = Math.max(max, sum);
                }
            }


            sb.append("#").append(idx++).append(" ").append(max).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
    }

}