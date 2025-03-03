package basic.oop.homework.quiz;

public class HardDrive extends  ComputerPart{

    HardDrive(String partName, int partPrice){
        super(partName,partPrice);
    }

    @Override
    void describePart() {
        System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
    }
}
