package basic.oop.encap.good;

public class Main {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();

//        my.year=13123; // private이라서 접근할 수가 없음.

        my.setYear(1997);
        my.setMonth(24443);
        my.setDay(2842424);
        my.birthInfo();

    }
     /*
     - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
      캡슐화 라고 합니다. (encapsulation)
      데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
     */
}
