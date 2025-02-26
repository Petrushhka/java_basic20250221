package basic.loop;

import java.util.Scanner;

public class InfiniteLoopQuizSolution {
    public static void main(String[] args) {
         /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

        int correct = 0;
        int incorrect = 0;

        while (true) {
            int random1 = (int) (Math.random() * 100 + 1);
            int random2 = (int) (Math.random() * 100 + 1);
            int operator = (int) (Math.random() * 4); // 0부터 3까지

            int crt = 0;

            switch (operator) {
                case 0:
                    System.out.printf("%d + %d = ??\n", random1, random2);
                    crt = random1 + random2;
                    break;
                case 1:
                    System.out.printf("%d - %d = ??\n", random1, random2);
                    crt = random1 - random2;
                    break;
                case 2:
                    System.out.printf("%d * %d = ??\n", random1, random2);
                    crt = random1 * random2;
                    break;
                case 3:
                    System.out.printf("%d / %d = ??\n", random1, random2);
                    crt = random1 / random2;
                    break;
            }
            ;

            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            int submit = sc.nextInt();

            if (submit == crt) {
                System.out.println("정답!");
                correct++;
            } else if (submit == 0) {
                System.out.println("종료!");
                break;
            } else {
                System.out.println("오답!");
                incorrect++;
            }
            ;
        }

        System.out.println("정답 횟수: " + correct + " 오답 횟수: " + incorrect);


    }
}
