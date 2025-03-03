package basic.oop.homework.staticquiz;

public class Store {

   private static int totalSales;

   static void addSale(int amount){

       totalSales += amount;

   }

   static int getTotalSales(){
       return totalSales;
   }


}
