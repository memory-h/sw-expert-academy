package d3;

import java.io.*;

/**
 * 14692. 통나무 자르기 D3
 */
public class Solution_14692 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            sb.append("#").append(idx++);

            if (n % 2 == 0) {
                sb.append(" Alice\n");
            } else {
                sb.append(" Bob\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}