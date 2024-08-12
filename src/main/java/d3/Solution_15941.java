package d3;

import java.io.*;

/**
 * 15941. 평행사변형 D3
 */
public class Solution_15941 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            // 모든 변의 길이가 n인 가장 넓은 평행사변형은 정사각형이다.
            sb.append("#").append(idx++).append(" ").append(n * n).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}