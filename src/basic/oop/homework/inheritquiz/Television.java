package basic.oop.homework.inheritquiz;

public class Television extends ElectronicProduct{

    String screensize;

    Television(String productName, double price, String manufacturer, String screensize){
        super(productName, price, manufacturer);
        this.screensize = screensize;

    }

    @Override
    void dispalyInfo() {
        super.dispalyInfo();
        System.out.println("화면크기: " + this.screensize);
    }
}
