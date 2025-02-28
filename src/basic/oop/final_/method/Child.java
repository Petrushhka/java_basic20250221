package basic.oop.final_.method;

public class Child extends Parent {

    @Override
    void method2() {
        super.method2();
        super.method3();
    }


//    @Override
//    void method3() {
//        super.method2();

    // final 메서드는 override를 막는다.
//    }
}
