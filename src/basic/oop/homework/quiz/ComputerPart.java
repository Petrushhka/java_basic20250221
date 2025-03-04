package basic.oop.homework.quiz;

public class ComputerPart {

    protected String partName; // 부품이름
    protected int partPrice; // 부품가격

    ComputerPart(String partName, int partPrice){
        this.partName = partName;
        this.partPrice = partPrice;

    }

    void describePart(){
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    };


}
