package d2;

import java.io.*;

/**
 * 2005. 파스칼의 삼각형 D2
 */
public class Solution_2005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];

            // 첫 번째 줄부터 N번째 줄까지 파스칼의 삼각형 생성
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    // // 각 행의 첫 번째와 마지막은 1, 그 외는 윗줄의 두 값의 합
                    if (j == 0 || j == i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }

            sb.append("#").append(idx++).append("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append(arr[i][j]).append(" ");
                }

                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}