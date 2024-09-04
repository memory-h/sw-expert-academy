package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 11736. 평범한 숫자 D3
 */
public class Solution_11736 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;

            for (int i = 1; i < n - 1; i++) {
                int max = Math.max(arr[i], Math.max(arr[i + 1], arr[i - 1]));
                int min = Math.min(arr[i], Math.min(arr[i + 1], arr[i - 1]));

                if (arr[i] != max && arr[i] != min) {
                    count++;
                }
            }

            sb.append("#").append(idx++).append(" ").append(count).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}