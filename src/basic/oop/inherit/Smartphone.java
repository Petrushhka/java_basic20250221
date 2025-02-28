package basic.oop.inherit;

public class Smartphone extends ElectronicProduct{

    int storageCapacity;

    public Smartphone(String productName, int price, String manufacturer, int storageCapacity) {
        super(productName, price, manufacturer);
        this.storageCapacity = storageCapacity;
    };

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(" 저장 용량:  " + this.storageCapacity + "GB");
    }
}
