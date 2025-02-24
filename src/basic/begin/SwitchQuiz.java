package basic.begin;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {

        /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. (+, -, *, /)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약, 사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면
         연산할 수 없는 입력값이라고 얘기 해 주세요.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세용: ");
        int num1 = sc.nextInt();
        System.out.println("계산할 부등호를 넣어주세용: ");
        String add = sc.next();
        System.out.println("대입할 수를 넣어주세용: ");
        int num2 = sc.nextInt();

        switch(add){
            default:
                System.out.println("부등호가 잘못입력됐습니다.");
                break;
            case "+":
                System.out.println(num1+num2);
                break;
                case "-":
                System.out.println(num1-num2);
                break;
                case "*":
                System.out.println(num1*num2);
                break;
                case "/":
                if(num2 == 0){
                    System.out.println("나누는 숫자는 0이 될 수 없습니다.");
                }else {
                    System.out.println(num1/num2);
                }
                    break;
        }


    }
}
