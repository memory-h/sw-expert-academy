package d3;

import java.io.*;
import java.util.Arrays;

/**
 * 13428. 숫자 조작 D3
 */
public class Solution_13428 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();

            int[] arr = new int[input.length()];
            int min = Integer.parseInt(input);
            int max = Integer.parseInt(input);

            for (int i = 0; i < input.length(); i++) {
                arr[i] = input.charAt(i) - '0';
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int[] chArr = Arrays.copyOf(arr, arr.length);

                    // 한 쌍의 숫자를 골라 그 위치를 바꾼다.
                    swap(chArr, i, j);

                    int cn = combineNumbers(chArr);

                    // 0으로 시작하는 경우 제외
                    if (String.valueOf(cn).length() != input.length()) {
                        continue;
                    }

                    min = Math.min(min, cn);
                    max = Math.max(max, cn);
                }
            }

            sb.append("#").append(idx++).append(" ").append(min).append(" ").append(max).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void swap(int[] chArr, int i, int j) {
        int temp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = temp;
    }

    private static int combineNumbers(int[] arr) {
        StringBuilder value = new StringBuilder();

        for (int i : arr) {
            value.append(i);
        }

        return Integer.parseInt(value.toString());
    }

}