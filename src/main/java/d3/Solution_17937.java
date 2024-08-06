package d3;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 17937. 큰 수의 최대공약수 D3
 */
public class Solution_17937 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            BigInteger answer;

            if (a.equals(b)) {
                answer = a;
            } else {
                answer = BigInteger.ONE;
            }

            sb.append("#").append(idx++).append(" ").append(answer).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}