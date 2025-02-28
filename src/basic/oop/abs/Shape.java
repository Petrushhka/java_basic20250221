package basic.oop.abs;
    /*
    도형 클래스를 생성
    다양한 도형들의 부모 클래스가 될 것.
     */

public abstract class Shape {

    String color;

    public Shape(String color){
        this.color = color;
    };

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayColor(){
        System.out.println("이 도형의 색상: " + color);
    }

    //오버라이딩 금지
    public final void displayInfo() {
        System.out.println("\n===== 도형 정보 =====");
        displayColor();
        System.out.println("도형 종류: " + this.getClass().getSimpleName());
        System.out.println("면적: " + calculateArea());
        System.out.println("둘레: " + calculatePerimeter());
        System.out.println("====================");
    }

}
