package basic.oop.homework.quiz;

public class Processor extends ComputerPart{


    Processor(String partName, int partPrice){
        super(partName, partPrice);
    }

    @Override
    void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}
