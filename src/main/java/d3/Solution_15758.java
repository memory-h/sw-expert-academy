package d3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 15758. 무한 문자열 D3
 */
public class Solution_15758 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        int idx = 1;

        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());

            String inputS = st.nextToken();
            String inputT = st.nextToken();

            StringBuilder s = new StringBuilder(inputS);
            StringBuilder t = new StringBuilder(inputT);

            // 입력받은 문자열 s와 t가 다른 경우
            if (!s.toString().contentEquals(t)) {
                // 최소 공배수를 구하고, 각 문자열의 길이가 최소 공배수와 같도록 문자열을 반복한다.
                int lcm = lcm(inputS.length(), inputT.length());

                for (int i = 0; i < lcm / inputS.length() - 1; i++) {
                    s.append(inputS);
                }

                for (int i = 0; i < lcm / inputT.length() - 1; i++) {
                    t.append(inputT);
                }
            }

            sb.append("#").append(idx++);

            if (s.toString().contentEquals(t)) {
                sb.append(" yes\n");
            } else {
                sb.append(" no\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    // 최대 공약수(GCD)를 구하는 메서드
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수(LCM)를 구하는 메서드
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}