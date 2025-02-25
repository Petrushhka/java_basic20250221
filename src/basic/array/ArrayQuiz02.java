package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("제거할 카카오 친구 이름을 입력해보세요: ");
        String fr = sc.next();

        int target;

        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};

         for(String someone : kakao){
            if(someone.equals(fr)){
                switch(someone){
                    case "무지":
                        target = 0;
                        break;
                    case "네오":
                        target = 1;
                        break;
                    case "어피치":
                        target = 2;
                        break;
                    case "라이언":
                        target = 3;
                        break;
                    case "춘식이":
                        target = 4;
                        break;
                };

            for(int i = 0; i < kakao.length-1 ; i++){
                kakao[i] = kakao[i+1];
            };
            String[] temp = new String[kakao.length-1];

            for(int i = 0; i < temp.length; i++){
                temp[i] = kakao[i];
            };

            kakao = temp;
            temp = null;


            }
        }











        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        /*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		 - 추가
		 배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		 더 이상 지울 친구가 없다면 프로그램 종료.
		 */


    }
}
