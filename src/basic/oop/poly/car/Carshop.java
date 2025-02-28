package basic.oop.poly.car;

public class Carshop {
    /*
       Mammals
          |
        Person
          |
       Student

       Mammals m = new Student();
       m instanceof Person -> ???
    */
    public  void carPrice(Car c){
        if( c instanceof Sonata){
            System.out.println("소나타의 가격은 3000만원 입니다.");
        } else if(c instanceof Tesla){
            System.out.println("테슬라의 가격은 5000만원 입니다.");
        }else if(c instanceof Porsche){
            System.out.println("포르쉐의 가격은 15000만원 입니다.");
        }
        
    }
    
}
