package basic.oop.inter;
//클래스와 별개임.

//인터페이스: 여러 종류의 게임 컨트롤러가 반드시 구현해야 하는 메서드를 정의
public interface GameController {

    //상수로 해석(static final)

    //인터페이스에서 변수를 선언하면 상수로 인식합니다.
    public static final int NUM = 5;

    //인터페이스는 생성자를 가질 수 없습니다.(객체화 될 수 없는 개념입니ㅏㄷ.)
//    public GameController(){}

void method1(); // 자동으로 추상메서드로 진행

    void moveCharecter(String direction);
    void action();
    void pasue();

}
