package d3;

import java.io.*;

/**
 * 13218. 조별과제 D3
 */
public class Solution_13218 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            sb.append("#").append(idx++).append(" ").append(n / 3).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}