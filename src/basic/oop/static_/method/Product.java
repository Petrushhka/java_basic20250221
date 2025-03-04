package basic.oop.static_.method;

import static basic.oop.static_.method.Store.addSale;

public class Product {

    String productName;
    int price;

    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

   void sellProduct(){

        addSale(this.price) ;

   }

}
