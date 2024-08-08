package d3;

import java.io.*;

/**
 * 16910. 원 안의 점 D3
 */
public class Solution_16910 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            // y축을 포함한 제1 사분면의 격자점의 개수를 구한다.
            for (int x = 0; x <= n; x++) {
                for (int y = 1; y <= n; y++) {
                    if (x * x + y * y <= n * n) {
                        count++;
                    }
                }
            }

            // 위에서 구한 격자점의 개수에 4를 곱하고 1을 더한다.((0, 0)인 좌표)
            sb.append("#").append(idx++).append(" ").append(count * 4 + 1).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}