package d3;

import java.io.*;

/**
 * 16002. 합성수 방정식 D3
 */
public class Solution_16002 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int x = 0, y = 0;

            for (int i = 4; i <= 10e9; i++) {
                // x와 y가 소수인지 확인
                if (!isPrime(n + i) && !isPrime(i)) {
                    x = n + i;
                    y = i;
                    break;
                }
            }

            sb.append("#").append(idx++).append(" ").append(x).append(" ").append(y).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}