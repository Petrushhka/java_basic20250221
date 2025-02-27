package basic.oop.encap.bad;

public class Main {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();
        my.year = 1992;
        my.month = -10;
        my.day = 1345;

        my.birthInfo();

    }
}
