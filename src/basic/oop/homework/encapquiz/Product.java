package basic.oop.homework.encapquiz;

public class Product {

    private String name;
    private int price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void reduceStock(int num) {
        if (num > 0) {
            this.stock -= num;
        } else {
            System.out.println("잘못된 수량입니다!");
            return;
        }
    };

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
