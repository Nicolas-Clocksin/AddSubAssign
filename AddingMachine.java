package cse360assignment02;

import java.util.List;
import java.util.ArrayList;

public class AddingMachine {
  private int total;
  private  String sumTotal;
  
  public static void main(String[] args) {
    AddingMachine obj = new AddingMachine();
    
    obj.add(5);
    obj.subtract(6);
    obj.add(2932);
    obj.subtract(3123);
    obj.add(3491);
    obj.subtract(1121);
    System.out.println(obj.toString());
    System.out.println("The total value of the equation is: ");
    System.out.println(obj.toString() + " = " + obj.getTotal());
}
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    sumTotal = "0 ";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
      total = total + value;
      sumTotal = sumTotal + " + " + value;
  }

  public void subtract (int value) {
      total = total - value;
      sumTotal = sumTotal + " - " + value;
  }

  public String toString () {
    return sumTotal;
  }

  public void clear() {
      total = 0;
      sumTotal = "0 ";
  }
  
  
}
