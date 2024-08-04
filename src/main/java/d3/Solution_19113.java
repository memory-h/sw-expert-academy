package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 19113. 식료품 가게 D3
 */
public class Solution_19113 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n * 2];
            boolean[] isVisited = new boolean[n * 2];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n * 2; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("#").append(idx++).append(" ");

            for (int i = 0; i < n * 2; i++) {
                if (isVisited[i]) {
                    continue;
                }

                for (int j = i + 1; j < n * 2; j++) {
                    // 방문하지 않았고, 해당 제품의 가격이 할인된 가격인지 확인
                    if (!isVisited[j] && arr[i] / 3 * 4 == arr[j]) {
                        isVisited[j] = true;
                        sb.append(arr[i]).append(" ");
                        break;
                    }
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}