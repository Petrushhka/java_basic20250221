package basic.oop.poly.player;

public class Main {

    public static void main(String[] args) {

        Warrior w1 = new Warrior("전사1");
        Warrior w2 = new Warrior("전사2");

        Mage m1 = new Mage("법사1");
        Mage m2 = new Mage("법사2");
        Hunter h1 = new Hunter("냥꾼1", "멍멍이");
        Hunter h2 = new Hunter("냥꾼2", "야옹이");

//        Player[] p = {w1,w2,m1};

        System.out.println("=========================================");

        h1.magicArrow(w1);
        h1.magicArrow(m1);
        h1.magicArrow(h2);


    }
}
