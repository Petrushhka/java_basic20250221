package basic.method;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chicken", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // foods배열에서 특정 데이터의 index를 반환합니다.
    //메서드 이름: idexOf, 매개변수 : 음식이름(String)

    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }


    // 특정 요소가 배열에 포함되어 있는지의 여부를 확인하는 메서드를 작성하세요.
    static boolean isInclude(String searchTarget) {
        boolean check = false;
        for (int i = 0; i < foods.length; i++) {
            if (searchTarget.equals(foods[i])) {
                check = true;
                break;
            }
        }
        return check;
    }

    ;
    // foods 배열에 데이터를 끝에 추가하는 메서드를 작성하세요.
    // static void push(String newFood)
    static void push(String newFood) {

        String[] temp = new String[foods.length + 1];

        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        };

        temp[temp.length-1] = newFood;

        foods = temp; temp = null;

    }

// 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
// static boolean isOutOfBounds(int targetIndex)
// 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.
    static  boolean isOutOfBounds(int targetIndex){
        boolean yn = false;
        for (int i = 0; i < foods.length; i++) {
            if(i == targetIndex){
                yn = true;
            }

        }
        return yn;
    }

// 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
// static void insert(int targetIndex, String newFoodName)
// targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.

    static void insert(int targetIndex, String newFoodName){
        boolean check = isOutOfBounds(targetIndex);
        if(!check){
            return;
        }else{
            String[] temp = new String[foods.length+1];

            for(int i = 0; i < foods.length; i++){
                temp[i] = foods[i];
            }

            for (int i = foods.length-1; i >= targetIndex ; i--) {
                temp[i+1] = foods[i];
            };

            temp[targetIndex] = newFoodName;

            foods = temp; temp = null;

        };

    };


// 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
// void modify(int targetIndex, String newFoodName)
// targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.

    static void modify(int targetIndex, String newFoodName){
        boolean yn = isOutOfBounds(targetIndex);
        if(!yn){
            return;
        }else{
            foods[targetIndex] = newFoodName;
        };
    };

// 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
// void remove(String deleteTarget)

    static void remove(String deleteTarget){
        String[] temp = new String[foods.length-1];

        int idx;
        for (int i = 0; i < foods.length; i++) {
            if(deleteTarget.equals(foods[i])){
                idx = i;
                break;
            };
        };




    }


    public static void main(String[] args) {

        modify(1,"노아이디어피자");
        System.out.println(Arrays.toString(foods));
    }
}









// 배열 내부를 깔끔하게 비워버리는 메서드를 작성하세요. (삭제 반복 x)
// void clear()


