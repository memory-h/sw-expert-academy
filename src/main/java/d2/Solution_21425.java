package d2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 21425. += D2
 */
public class Solution_21425 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int count = 0;

            // a와 b 중 하나가 n을 초과할 때까지 반복
            while (a <= n && b <= n) {
                // a와 b 중 작은 값에 큰 값을 더함
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }

                count++;
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}