package d3;

import java.io.*;

/**
 * 13547. 팔씨름 D3
 */
public class Solution_13547 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();
            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'o') {
                    count++;
                }
            }

            count += 15 - input.length();
            sb.append("#").append(idx++);

            if (count >= 8) {
                sb.append(" YES\n");
            } else {
                sb.append(" NO\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}