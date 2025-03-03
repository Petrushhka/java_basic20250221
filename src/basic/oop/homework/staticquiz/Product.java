package basic.oop.homework.staticquiz;

public class Product {

    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void sellProduct(){
        Store.addSale(this.price);
    }


}
