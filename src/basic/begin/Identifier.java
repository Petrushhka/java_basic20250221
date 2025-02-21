package basic.begin;

public class Identifier {
    public static void main(String[] args) {

        // 1. 식별자는 대,소문자를 철저하게 구분함!
        int age = 35;
        //alt + enter 인텔리제이한테 도움을 받고싶다.하면 제안이 뜸
        int Age = 40;

        //2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 안됨!
//        int 700 = 365;

        //3. 식별자에 공백 못들어가요!
//        int my brith day = 19970124;
        int myBrithDay =  19970124;

        // 4. 식별자에 특수기호는 밑줄(_), 달러기호($) 뿐
        //에러가 나지는 않지만 이미 약속됨. 거의 안사용한다.
        String $hello_ = "안녕";

        //5. 키워드 (예약어)는 식별자로 사용할 수 없음!
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.

//        String class = "8반";(x)
        String myClass = "8반";
        String classNumber;

        //6. 한글이나 한자 같은 영어가 아닌 식별자는 권장되지 않음.
        int 숫자 = 10;
        int sagwa = 20; // 전혀 추천하지 않음

        // 변수명을 지정하기 어려울때 지어주는 사이트가 있음
        //https://www.curioustore.com/#!/
        //https://var.gg/ko/variables/%EC%9C%A0%EA%B8%B0%EB%AC%BC
    }
}