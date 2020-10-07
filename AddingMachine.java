/*
  Created By: Nicolas Clocksin
  Date: 10/07/2020
  Description: This java file is used to implement class AddingMachine. Through the implementation of AddingMachine, a value is received
  and the addition or subtraction method is determined. Once finsihed the equation is shown and the total is given.
*/
package cse360assignment02;
//importated Java utility
import java.util.Scanner;

//class adding machine declared
public class AddingMachine {

  //variables are declared
  private int total;
  private  String sumTotal;
  
  public static void main(String[] args) {
    //obj of class Created
    AddingMachine obj = new AddingMachine();
    //Variables declared
    String command = "";
    Scanner scan = new Scanner(System.in);
    int val = 0;

    //Welcome message of main is sent to user
    System.out.println("Welcome to Adding Machine, where you total will be calculated");
    System.out.println("Please enter a Command: +, -, clear, print, or q to quit");

    //do while loop for receiving User input
    do{
      //command is entered by user
      System.out.print("Enter Command: ");
      command = scan.nextLine();

      //if-else used to determine which command was entered

      //command + adds together value and inserts value into string
      if(command.equals("+")){
        System.out.print("Enter Value: ");
        val = scan.nextInt();
        scan.nextLine();
        obj.add(val);
      }

      //command - subtracts the value from the total and inserts into string
      else if(command.equals("-")){
        System.out.print("Enter Value: ");
        val = scan.nextInt();
        scan.nextLine();
        obj.subtract(val);
      }

      //command q breaks from while loop
      else if(command.equals("q")){
        break;
      }

      //command clear, clears total and string 
      else if(command.equals("clear")){
        obj.clear();
      }
      //command prints value of the toString
      else if(command.equals("print")){
        System.out.println(obj.toString());
        System.out.println("The total value of the equation is: ");
        System.out.println(obj.toString() + " = " + obj.getTotal());
      }
      //Error catch
      else{
        System.out.println("Please enter a correct symbol");
      }

    }while(command != "q");
    //condition end for while loop
    
    
}
//contructor 
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    sumTotal = "0";
  }
  //total is returned
  public int getTotal () {
    return total;
  }
  //adds the to total and equation string
  public void add (int value) {
      total = total + value;
      sumTotal = sumTotal + " + " + value;
  }
  //subtracts the to total and equation string
  public void subtract (int value) {
      total = total - value;
      sumTotal = sumTotal + " - " + value;
  }
  //returns sumTotal, which is the equation of values inputted
  public String toString () {
    return sumTotal;
  }
  //resets values of both the total and sumTotal equation
  public void clear() {
      total = 0;
      sumTotal = "0 ";
  }  
}
