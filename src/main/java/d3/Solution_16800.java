package d3;

import java.io.*;

/**
 * 16800. 구구단 걷기 D3
 */
public class Solution_16800 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            long sqrt = (long) Math.sqrt(n);
            long min = Long.MAX_VALUE;

            // n × n 라인을 기준으로 위쪽 영역 또는 아래쪽 영역 중 한곳만 고려해서 셀에 도착하기 위한 최소 움직임을 구하면 된다.
            for (long i = 1; i <= sqrt; i++) {
                if (n % i == 0) {
                    min = Math.min(min, n / i + i - 2);
                }
            }

            sb.append("#").append(idx++).append(" ").append(min).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}