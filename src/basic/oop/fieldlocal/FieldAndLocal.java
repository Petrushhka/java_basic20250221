package basic.oop.fieldlocal;

public class FieldAndLocal {

    //필드는 값을 초기화하지 않아도
    //객체 생성 시 ,각 타입의 기본값으로 자동 초기화 됨.

    int aaa;


    void foo2(){
        System.out.println("aaa = " + aaa);
//        System.out.println("bbb = " + bbb);  -> 지역변수라서 사용할 수 없음.
    }



    //int ccc: 매개 변수(parameter) - 지역 변수의 일종(호출 되기 전까지는 사용되지 않기때문.)
    void foo(int ccc){
        // 지역 변수(Local variable) 메서드 내에서 생성된 변수
        // 해당 블럭에서만 유효한 변수. 해당 블럭이 끝나면 메모리에서 소멸.
        int bbb = 0;

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);

    }

}
