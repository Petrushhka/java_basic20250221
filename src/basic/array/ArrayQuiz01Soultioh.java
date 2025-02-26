package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01Soultioh {
    public static void main(String[] args) {
         /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드
            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 음식 드실래용??: ");

        //음식 이름을 저장할 배열 -> 초기에는 값이 없으니까

        String[] foodList = {};

        while(true){
            System.out.println("> ");
            String newFood = sc.next();

            if(newFood.equals("그만")) break;

            String[] temp = new String[foodList.length + 1];//기존배열보다 큰 새 배열 생성

            for(int i = 0; i < foodList.length; i++){
                temp[i] = foodList[i];
            };

            //새음식을 끝 인덱스에 추가
            temp[temp.length-1] = newFood;

            //주소값 이전
            foodList = temp; temp = null;
        };

        System.out.println("먹고싶은 음식 리스트: " + Arrays.toString(foodList));
        sc.close();




//        if(foodName.equals("그만")){
//            System.out.println("종료하겠습니다~");
//
//        }
//
//        else{
//            String[] foods = new String[1];
//            String[] temp = new String[foods.length+1]; // 푸드보다 한개 큰
//
//            for(int i = 0; i < foods.length; i++){
//                temp[i] = foods[i];
//            };
//
//           temp[temp.length-1] = foodName;
//
//
//
//           foods = temp;
//           temp = null;
//
//           System.out.println(Arrays.toString(foods));
//
//            }
//        sc.close();
        };

        }



