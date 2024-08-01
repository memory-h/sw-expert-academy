package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 20551. 증가하는 사탕 수열 D3
 */
public class Solution_20551 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int[] arr = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int eat = 0;

            while (true) {
                if (isStrictlyIncreasing(arr)) {
                    break;
                }
                if (!isArrayElementsValid(arr)) {
                    eat = -1;
                    break;
                }

                for (int i = 0; i < 2; i++) {
                    if (arr[i] >= arr[i + 1]) {
                        if (arr[i] >= 2) {
                            arr[i]--;
                            eat++;
                        }
                    }
                }
            }

            sb.append("#").append(idx++).append(" ").append(eat).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isArrayElementsValid(int[] arr) {
        for (int i = 0; i < 3; i++) {
            if (arr[i] < i + 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < 2; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

}