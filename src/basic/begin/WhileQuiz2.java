package basic.begin;

import java.util.Scanner;

public class WhileQuiz2 {
    public static void main(String[] args) {

         /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int num = sc.nextInt();
        int fix = num;
        int count = 0;

        while (num != 0) {
            if (fix % num == 0) {
                count++;
            }
            num--;
        }
        if (count < 3) {
            System.out.println("해당 숫자는 소수입니다.");
        };
    }
}

