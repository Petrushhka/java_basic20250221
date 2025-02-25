package basic.loop;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {

        int total = 0;
        for(int j = 1; j<=10; j++){ //(begin / end /step)
            total += j;
        };

        //1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력
        for (int i = 1; i <= 200; i++) {
            if(i%6==0 && i%12!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n====================================");

        // 정수를 하나 입력받아서
        // 입력받은 정수까지의 팩토리얼 값을 구하세요.
        // 팩토리얼) 5! = 5*4*3*2*1;

        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼할 수: ");
        int k = sc.nextInt();
        int fac = 1; // 팩토리얼 최종 값을 담을 변수

        for(int i = k; i >= 1 ; k--){
            fac *= i;
        };
            System.out.println(fac);
    }
}
