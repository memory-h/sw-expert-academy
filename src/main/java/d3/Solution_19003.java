package d3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 19003. 팰린드롬 문제 D3
 */
public class Solution_19003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            List<String> str = new ArrayList<>();
            List<String> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                str.add(br.readLine());
            }

            boolean palindrome = false;

            for (int i = 0; i < n; i++) {
                // 팰린드롬인지 확인
                if (isPalindrome(str.get(i))) {
                    palindrome = true;
                } else { // 팰린드롬이 아닌 경우 리스트에 추가
                    list.add(str.get(i));
                }
            }

            int count = 0;

            for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i);

                // List에 저장된 문자열을 뒤집었을 때, 똑같은 문자열이 있으면 count 증가(즉, 팰린드롬 문자열이 있는지 확인)
                if (list.contains(new StringBuilder(temp).reverse().toString())) {
                    count += 1;
                }
            }

            int result = m * count;

            // 팰린드롬 문자열이 한 개라도 있으면 m 만큼 더한다.
            if (palindrome) {
                result += m;
            }

            sb.append("#").append(idx++).append(" ").append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}