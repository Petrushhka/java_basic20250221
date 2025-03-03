package basic.oop.homework.quiz;

public class Memory extends  ComputerPart{


    Memory(String partName, int partPrice) {
        super(partName, partPrice);
    }

    @Override
    void describePart() {
        System.out.println("Memory: " + partName + ", Price: " + partPrice);
    }
}
