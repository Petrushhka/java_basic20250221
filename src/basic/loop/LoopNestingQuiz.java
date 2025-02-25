package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {
        /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int num = sc.nextInt();
        int cnt = 0;
        for(int i = num; i >= 0; i--){
            for(int j = i; j >= i; j--){
                int count =0;
                if( i % j == 0){
                    count++;

                    if(count > 2){
                        break;
                    }
                };

            }


        }


    }
}
