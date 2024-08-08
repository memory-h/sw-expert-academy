package d3;

import java.io.*;

/**
 * 17319. 문자열문자열
 */
public class Solution_17319 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            // 홀수인 경우
            if (n % 2 != 0) {
                sb.append("#").append(idx++).append(" ").append("No\n");
            } else { // 짝수인 경우
                // 2개의 문자열로 나눴을 때, 두 문자열이 같은지 확인한다.
                if (isSymmetrical(n, str)) {
                    sb.append("#").append(idx++).append(" ").append("Yes\n");
                } else {
                    sb.append("#").append(idx++).append(" ").append("No\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isSymmetrical(int n, String str) {
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n / 2 + i)) {
                return false;
            }
        }

        return true;
    }

}