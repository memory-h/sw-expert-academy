package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 18662. 등차수열 만들기 D3
 */
public class Solution_18662 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            double result = 0.0;

            if (b - a < c - b) {
                result = (double) ((c - b) - (b - a)) / 2;
            } else if (b - a > c - b) {
                result = (double) ((b - a) - (c - b)) / 2;
            }

            sb.append("#").append(idx++).append(" ").append(String.format("%.1f", result)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}