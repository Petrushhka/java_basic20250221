package basic.begin;

import java.util.Scanner;

public class CeltoFahr {
    public static void main(String[] args) {

         /*
             사용자에게 섭씨온도를 입력받아서
             화씨온도로 변환하여 출력하는 로직을 작성하세요.
             변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
             화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
             # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)

             사용자 입력값은 실수가 들어온다!
             출력도 실수로 출력돼야한다!!
        */

        //1) 사용자에게 입력
        //2) 입력받은 섭씨값 변수에 저장
        //3) 섭씨값을 화씨값으로 변경
        //4) 변경값을 변수에 저장
        //5) 변경값을 표현하는건 실수

        Scanner sc = new Scanner(System.in);

        System.out.println("섭씨온도 입력: ");

        double cel = sc.nextDouble();
        double fahr = (cel * 1.8) + 32;

        System.out.printf("섭씨온도: %.1f℃, 화씨온도: %.2f℉", cel, fahr);

        sc.close();

    }
}
