package d3;

import java.io.*;
import java.util.*;

/**
 * 21131. 행렬정렬 D3
 */
public class Solution_21131 {

    static int x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            while (true) {
                if (isTransposeCheck(arr, n)) {
                    sb.append(count).append("\n");
                    break;
                } else {
                    transposeMatrix(arr, x + 1);
                    count++; // 연산 횟수 증가
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    //  x * x 크기의 부분 행렬을 전치시키는 메서드
    private static void transposeMatrix(int[][] arr, int x) {
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // 모든 1<=i, j<= n에 대해 A[i, j] = (i - 1) x n + j가 성립하는지 확인
    private static boolean isTransposeCheck(int[][] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (arr[i][j] != i * n + j + 1) {
                    x = Math.max(i, j);
                    return false;
                }
            }
        }

        return true;
    }

}