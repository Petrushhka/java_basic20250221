package basic.loop;

import java.util.Scanner;

public class WhileQuiz2Solution {
    public static void main(String[] args) {

         /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int num = sc.nextInt();

        int i = 1; //begin
        int cnt = 0; //약수의 개수를 기억할 변수

        while (i <= num) { //end
            if (num % i == 0) {
                cnt++;
            }
            ;
            i++;//step
        }
        if (cnt == 2) {
            System.out.println(num + "은 소수입니다!!");
        } else {
            System.out.println("소수가 아닙니다!");
        }
        System.out.println("=====================================");

        int j = 2;
        while (num % j != 0){
            j++;
        }
        System.out.printf("%d는 %s\n", num,
                num == j ? "소수입니다." : "소수가 아닙니다.");

        sc.close();
    }
}

