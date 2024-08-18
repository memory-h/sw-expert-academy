package d3;

import java.io.*;
import java.util.Arrays;

/**
 * 14361. 숫자가 같은 배수 D3
 */
public class Solution_14361 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();
            int n = Integer.parseInt(input);

            int[] originalDigits = new int[input.length()];
            int[] multipliedDigits = new int[input.length()];

            for (int i = 0; i < input.length(); i++) {
                originalDigits[i] = input.charAt(i) - '0';
            }

            Arrays.sort(originalDigits);

            int k = 2;
            boolean isPossible = true;

            while (true) {
                String multipliedNumber = String.valueOf(n * k++);

                // multipliedNumber 길이가 n 보다 큰 경우
                if (multipliedNumber.length() > input.length()) {
                    isPossible = false;
                    break;
                }

                for (int i = 0; i < multipliedNumber.length(); i++) {
                    multipliedDigits[i] = multipliedNumber.charAt(i) - '0';
                }

                Arrays.sort(multipliedDigits);

                // 두 배열이 같은지 확인한다.
                if (areArraysEqual(originalDigits, multipliedDigits)) {
                    break;
                }
            }

            sb.append("#").append(idx++);

            if (isPossible) {
                sb.append(" possible\n");
            } else {
                sb.append(" impossible\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean areArraysEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

}