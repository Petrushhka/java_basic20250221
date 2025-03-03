package basic.oop.homework.inheritquiz;

public class Smartphone extends ElectronicProduct{

    int storageCapacity;

    public Smartphone(String productName, double price, String manufacturer, int storageCapacity) {
        super(productName, price, manufacturer);
        this.storageCapacity = storageCapacity;
    }

    @Override
    void dispalyInfo() {
        super.dispalyInfo();
        System.out.println("저장용량: " + this.storageCapacity + "gb");
    }
}
