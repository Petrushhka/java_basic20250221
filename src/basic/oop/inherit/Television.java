package basic.oop.inherit;

public class Television extends ElectronicProduct{

    int screenSize;

    public Television(String productName, int price, String manufacturer, int screenSize) {
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    };

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(" 화면크기: " +  this.screenSize);
    }
}
