package basic.oop.inter;


// 인텊이스를 구현하는 구현체 클래스는 반드시 모든 추상 메서드를 재정의 해야 합니다.
public class TouchscreenController implements GameController {


    @Override
    public void method1() {

    }

    @Override
    public void moveCharecter(String direction) {
        System.out.println("화면을 " + direction + "방향으로 스와이프 하여 캐릭터 이동");
    }

    @Override
    public void action() {

        System.out.println("화면을 탭해서 행동 수행");

    }

    @Override
    public void pasue() {
        System.out.println("화면을 눌러 게임 일시 정지");
    }
}
