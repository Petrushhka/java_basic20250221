package basic.oop.fieldlocal;

public class Main {

    public static void main(String[] args) {

        FieldAndLocal fl = new FieldAndLocal();

        fl.foo(100);
        fl.aaa = 50;
        // bbb는 지역변수라서 호출 불가능!!

    }
}
