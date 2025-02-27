package basic.oop.modi.member.pac1;

public class B {

    void test(){
        A a1 = new A(50);
        A a2 = new A(5.0);
//        A a3 = new A(false);

        a1.f1 = 20;
        a1.f2 = 30;
//        a1.f3 = 40;  private (class가 달라지니까 못써)

        a1.m1();
        a1.m2();
//        a1.m3();  private (class가 달라지니까 못써)

    }

}
