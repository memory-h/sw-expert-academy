package d2;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 1984. 중간 평균값 구하기 D2
 */
public class D2_1984 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int idx = 1;

        while (t --> 0) {
            int[] arr = new int[10];
            double avg = 0;

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for (int i = 1; i < 9; i++) {
                avg += arr[i];
            }

            System.out.println("#" + idx++ + " " + Math.round(avg / 8));
        }
    }

}
/**
 * Math.round(값): 메서드 사용 시 값을 소수점 첫째 자리까지 반올림한다.
 * String.format("%.nf", num): n에 원하는 소수점 자리를 넣으면 된다.
 */