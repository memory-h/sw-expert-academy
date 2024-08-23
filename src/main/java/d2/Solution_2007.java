package d2;

import java.io.*;

/**
 * 2007. 패턴 마디의 길이 D2
 */
public class Solution_2007 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();
            StringBuilder str;
            int len = 0;

            for (int i = 0; i < 10; i++) {
                str = new StringBuilder();
                String temp = input.substring(0, i + 1);

                for (int j = 1; j <= 30 / temp.length(); j++) {
                    str.append(temp);
                }

                if (30 % temp.length() != 0) {
                    int remainder = 30 % temp.length();
                    str.append(temp, 0, remainder);
                }

                if (input.contentEquals(str)) {
                    len = temp.length();
                    break;
                }
            }

            sb.append("#").append(idx++).append(" ").append(len).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}