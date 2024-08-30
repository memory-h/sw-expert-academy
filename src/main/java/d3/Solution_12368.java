package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 12368. 24시간 D3
 */
public class Solution_12368 {

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
            int result = a + b;

            if (result == 24) {
                result = 0;
            } else if (result > 24) {
                result -= 24;
            }

            sb.append("#").append(idx++).append(" ").append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
    }

}