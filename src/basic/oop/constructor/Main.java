package basic.oop.constructor;

public class Main {

    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.showSpec();

        System.out.println("=================================");

        Phone galaxy = new Phone("갤럭시s25");
        galaxy.showSpec();

        System.out.println("=================================");

        Phone iPhone = new Phone("아이폰16", "스페이스 그레이");
        iPhone.showSpec();



    }
}
