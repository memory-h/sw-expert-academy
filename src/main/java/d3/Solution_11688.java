package d3;

import java.io.*;

/**
 * 11688. Calkin-Wilf tree 1 D3
 */
public class Solution_11688 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();

            int a = 1, b = 1;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'L') {
                    b += a;
                } else {
                    a += b;
                }
            }

            sb.append("#").append(idx++).append(" ").append(a).append(" ").append(b).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}