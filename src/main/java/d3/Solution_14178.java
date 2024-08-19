package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 14178. 1차원 정원 D3
 */
public class Solution_14178 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            // (꽃의 개수 / 분무기 범위) + (꽃의 개수 % 분무기 범위)가 0보다 큰 경우 1을 더해준다.
            sb.append("#").append(idx++).append(" ").append(n / ((d * 2) + 1) + (n % ((d * 2) + 1) > 0 ? 1 : 0)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}