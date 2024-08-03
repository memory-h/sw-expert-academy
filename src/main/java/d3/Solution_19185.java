package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 19185. 육십갑자 D3
 */
public class Solution_19185 {

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
            int m = Integer.parseInt(st.nextToken());

            String[] a = new String[n];
            String[] b = new String[m];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = st.nextToken();
            }

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < m; i++) {
                b[i] = st.nextToken();
            }

            // 최소공배수를 구한다.
            int lcm = n * m / findGCD(n, m);

            // 문자열 배열을 lcm 크기만큼 생성
            String[] str = new String[lcm];

            // 육십갑자를 배열에 저장한다.
            for (int i = 0; i < lcm; i++) {
                str[i] = a[i % a.length] + b[i % b.length];
            }

            int q = Integer.parseInt(br.readLine());

            sb.append("#").append(idx++).append(" ");

            // 해당 연도의 육십갑자를 구해서 StringBuilder에 추가한다.
            for (int i = 0; i < q; i++) {
                int y = Integer.parseInt(br.readLine());
                sb.append(str[(y - 1) % lcm]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);
    }

}