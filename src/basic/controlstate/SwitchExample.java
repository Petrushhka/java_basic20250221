package basic.controlstate;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("성별을 입력하세요.(M/F)");
        String gender = sc.next();

        switch(gender){
            //자바 14버전 이전에 쓰이던 문법
            case "ㅡ": case "m": case "M":
                System.out.println("남성 입니다.");
                break; // 해당 케이스만 실행하고 switch문을 종료해라!

            // 자바 14버전 이후에서 개선된 switch문
            case "ㄹ","f","F" :
                System.out.println("여성 입니다.");
                break;

            default: //case를 설정하지 않은 값들은 모두 default로 빠지게 됩니다.
                System.out.println("잘못된 입력입니다.");
        }
        sc.close();
    }
}
