package basic.loop;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {

        /*
             # 사용자에게 구구단 단수를 입력받아서
             해당 단수의 구구단을 출력해 보세요.
             ex)

             구구단을 입력하세요: 4
             *** 구구단 4 단 ***
             4 x 1 = 4
             4 x 2 = 8
             4 x 3 = 12
             4 x 4 = 16
             .
             .
             .
             4 x 9 = 36
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("몇단을 하실껀가요?: ");
        int fix = sc.nextInt();
        System.out.println("*** 구구단" + fix + "단 ***");

        int i = 1;
        while(i<=9){
            System.out.printf("%d * %d = %d\n", fix, i, fix*i);
            i++;
        }
        sc.close();
    }
}
