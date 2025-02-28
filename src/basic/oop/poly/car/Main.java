package basic.oop.poly.car;

public class Main {
    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Car t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        s1.run();
//        s2.run();
//        s3.run();
//
//        p1.run();
//        p2.run();
//        p3.run();
//
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

        //하위타입인 테슬라,소나타,포르쉐가 상위타입으로 변환된다(casting)
        //그리고 부모는 자식의 메서드가 어떻게 바뀌었는지 모름.
        //다형성을 적용해서 서로 다른 타입 객체를 모아놓을 수 있다. (이종 모음의 배열)
        Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t3};
        for (Car c : cars) {
            c.run();
        };

        System.out.println("=======================================");

        Driver kim = new Driver();
        kim.drive(t1);
        kim.drive(s1);
        kim.drive(p2);

        System.out.println("=======================================");

         /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)

         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */

        Car myTesla = kim.buyCar("테슬라");
        myTesla.run();
        Tesla t5 = (Tesla) myTesla;
        t5.activeAutoPilot();

        // 객체가 2개 생성되는게 아니라, 하나의 객체를 두개의 방식으로 접근하는 거.
        System.out.println(myTesla);
        System.out.println(t5);


        //Object 타입의 변수는 어떤 객체든 담을 수는 있지만, 객체 고유의 기능을 사용하려면
        // 원래의 타입으로 형 변환이 필요합니다.
        Object obj = new String ( "메롱메롱");
        String str = (String) obj;
        System.out.println("문자열 길이: " + str.length());

        //다형성이 한 번도 발생하지 않은 경우에는
        //형 변환을 진행할 수 없습니다.
        Car ccc = new Car();
//        Tesla t = (Tesla) ccc;
//        t.activeAutoPilot();

//        t1.activeAutoPilot();

        System.out.println("=============================");

        Carshop shop = new Carshop();
        shop.carPrice(p1);
        shop.carPrice(t1);

    }
}
