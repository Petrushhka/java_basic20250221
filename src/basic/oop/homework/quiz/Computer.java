package basic.oop.homework.quiz;

import java.util.concurrent.CountDownLatch;

public class Computer {

    ComputerPart[] parts;


    Computer(){
        this.parts = new ComputerPart[0];
    }

    void addPart(ComputerPart part){
        ComputerPart[] p = this.parts;

        ComputerPart[] temp = new ComputerPart[p.length+1];

        for (int i = 0; i < p.length; i++) {
            temp[i] = p[i];
        };

        temp[temp.length-1] = part;

        this.parts= temp;
    }

    void showParts(){

        for (ComputerPart p : parts) {
            p.describePart();
        }


    };


}
