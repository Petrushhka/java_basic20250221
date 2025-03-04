package etc.exception.throw_;

import basic.oop.homework.encapquiz.Car;
import etc.exception.custom.InvalidArgumentException;

public class ThrowExample {

    static int calcTotal(int end) throws InvalidArgumentException{

        if(end <= 0){
//            System.out.println("잘못된 매개값!");
            throw new InvalidArgumentException("매개값이 이상해여~~");
        }
        int total = 0;
        for (int i = 0; i < end; i++) {
            total += i;
        }
        return total;
    };


//    public ThrowExample() {
//    }

    public static void main(String[] args) {



        try {
            int result1 = calcTotal(100);
            System.out.println("result1 = " + result1);
            ;
            int result2 = calcTotal(-120);
            System.out.println("result2 = " + result2);
        } catch (InvalidArgumentException e) {
            System.out.println("야옹!");
        }


    }

}
