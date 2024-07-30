package d3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 20728. 공평한 분배 2 D3
 */
public class Solution_20728 {

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
            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int result = Integer.MAX_VALUE;

            for (int i = 0; i <= n - k; i++) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int j = i; j < i + k; j++) {
                    min = Math.min(min, arr[j]);
                    max = Math.max(max, arr[j]);
                }

                result = Math.min(result, max - min);
            }

            if (n == k) {
                result = Math.min(result, arr[n - 1] - arr[0]);
            }

            sb.append("#").append(idx++).append(" ").append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
    }

}