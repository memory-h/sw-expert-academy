package d3;

import java.io.*;

/**
 * 11856. 반반 D3
 */
public class Solution_11856 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();

            int[] alphabet = new int[26];

            for (int i = 0 ; i < input.length() ; i++) {
                alphabet[input.charAt(i) - 65]++;
            }

            int count = 0;

            for (int i : alphabet) {
                if (i == 2) {
                    count++;
                }
            }

            sb.append("#").append(idx++);

            if (count == 2) {
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