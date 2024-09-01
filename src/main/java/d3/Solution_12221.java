package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 12221. 구구단2 D3
 */
public class Solution_12221 {

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

            sb.append("#").append(idx++).append(" ");

            if (a >= 10 || b >= 10) {
                sb.append("-1\n");
            } else {
                sb.append(a * b).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}