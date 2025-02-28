package basic.oop.inherit;

public class ElectronicProduct {
    String productName;
    int price;
    String manufacturer;

    ElectronicProduct(String productName, int price, String manufacturer){
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.price = price;
    };

    void displayInfo(){
        System.out.println(this.productName + " " + this.price + "원 " + "제조사: " + this.manufacturer);
    };



}
