package basic.oop.poly.player;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickName, String petName) {
        super(nickName);
        this.pet = petName;
    }

    public void magicArrow(Player p) {

        int damage = 0;

        if (p instanceof Mage) {
            damage = 20;
        } else if (p instanceof Warrior) {

            damage = 10;
        }
        if (p instanceof Hunter) {
            damage = 15;
        }

        p.hp -= damage;

        System.out.println(p.nickName + "이" + this.nickName + "에게 매직애로우를 당하셨습니다!");
        System.out.println(p.nickName + "님의 피해 : " + damage);
        System.out.println(p.nickName + "님의 체력 : " + p.hp);

        System.out.println("--------------------------------------------");
    }


}
