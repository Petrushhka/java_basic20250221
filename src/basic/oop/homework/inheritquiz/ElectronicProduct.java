package basic.oop.homework.inheritquiz;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;

    ElectronicProduct(String productName, double price, String manufacturer){

        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;

    }

    void dispalyInfo(){
        System.out.println(this.productName + ", 가격: " + this.price + ", 제조사: " + this.manufacturer);
    }






}
