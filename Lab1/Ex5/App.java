package Lab1.Ex5;

import java.time.LocalDate;

public class App{

  public static void main(String[]args){
    Product [] products = new Product [3];
    
    products [0] = new FoodProduct(3452, 10.0, "Cheddar Cheese", LocalDate.parse("2022-06-07"));
    products [1] = new FoodProduct(3456, 12.0, "Cream Cheese", LocalDate.parse("2023-03-07"));
    products[2] =  new ElectricProduct(4875, 30.0, "Extension cord", "220v");
    for(Product p: products){
        System.out.println(p.toString());
    }
  }
}