package basic.loop;

import java.util.Scanner;

public class LoopNestingQuizSoltution {
    public static void main(String[] args) {
        /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/

        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();

        int count = 0; // 소수가 몇개인지 기억할 변수.

        for (int i = 2; i <= num; i++) {
            int cnt = 0; // 나누어 떨어지는 수가 몇번인지
            for (int j = 1; j <= i; i++) {
                if (i % j == 0) {
                    cnt++;
                }
                ;
            }
            ;
            if (cnt == 2) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println("\n소수의 개수: " + count + "개");


        sc.close();


    }


}