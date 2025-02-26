package basic.oop.this_;

public class Player {


    String nickName;
    int level;
    int hp;

    Player(){
        System.out.println("Player의 기본 생성자 호출!");
        level = 1;
        hp = 50;
    };
    Player(String nickName){
        System.out.println("Player의 2번 생성자 호출!");
        System.out.println("this가 갖는 주소값 : " + this);
        this.nickName = nickName;
        level = 1;
        hp = 50;
    };

//    @Override
//    public String toString() {
//        return "Player{" +
//                "nickName='" + nickName + '\'' +
//                ", level=" + level +
//                ", hp=" + hp +
//                '}';
//    }
}
