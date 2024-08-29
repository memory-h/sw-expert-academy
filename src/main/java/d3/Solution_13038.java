package d3;

import java.io.*;
import java.util.*;

/**
 * 13038. 교환학생 D3
 */
public class Solution_13038 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[7];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 7; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int minDays = Integer.MAX_VALUE;

            // 수업이 열리는 각 날을 시작점으로 설정하여 최소 일수를 계산
            for (int i = 0; i < 7; i++) {
                if (arr[i] == 1) {
                    int totalClasses = 0; // 지금까지 들은 수업의 수를 추적
                    int daysSpent = 0; // 현재까지 머문 날의 수를 추적

                    // 주어진 패턴을 반복하면서 목표 수업 일수를 채울 때까지 반복
                    for (int j = i; j < i + 7 * n; j++) {
                        if (arr[j % 7] == 1) {
                            // 수업이 열리는 날이면 수업 수를 증가
                            totalClasses++;
                        }

                        // 하루가 지났으므로 머문 날 수를 증가
                        daysSpent++;

                        // 목표 수업 일수에 도달한 경우
                        if (totalClasses == n) {
                            break;
                        }
                    }

                    minDays = Math.min(minDays, daysSpent);
                }
            }

            sb.append("#").append(idx++).append(" ").append(minDays).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}