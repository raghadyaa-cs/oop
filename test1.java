package edu.zuj.oop.pkg16.week3.lec1.hw1;
import java.util.Scanner;
public class test1 {
  public static void main(String[] args) {
    /**
    create a program that works as a unit converter
 */
    Scanner s = new Scanner (System.in);
    System.out.print("enter a number : ");
   int x = s.nextInt();
System.out.println("the following is a list the unit conversions that can be performed on your number");
    System.out.println("1- Convert from meters to feet ");
    System.out.println("2- Convert from feet to meters ");
    System.out.println("3- Convert from centimeters to inches ");
    System.out.println("4- Convert from inches to centimeters ");
    System.out.println("5- Convert from fahrenheit to celsuis ");
    System.out.println("6- Convert from celsuis to fahrenheit ");
    System.out.println("7- Convert from dunams to hectares ");
    System.out.println("8- Convert from hectares to dunams ");
    System.out.println("9- Convert from dunams to acres ");
    System.out.println("10- Convert from acres to dunams ");
    System.out.println("enter the number of the operation of your choice below :");
   int y =s.nextInt();
   switch (y) {
      case 1:
            System.out.print("You chose option 1. Converting " + x +" meters to feet :" );
            System.out.print( x * 3.28084); System.out.print(" ft.");
            break;
      case 2:
            System.out.print("You chose option 2. Converting "+x+" feet to meters :");
            System.out.print(x / 3.28084);System.out.println(" m.");
            break;
      case 3:
            System.out.print("You chose option 3. Converting "+ x+" centimeters to inches :");
            System.out.print(x *  0.393701); System.out.println(" inches.");
            break;
      case 4:
            System.out.print("You chose option 4. Converting "+ x+" inches to centimeters :");
            System.out.print(x /  0.393701); System.out.println(" cm.");
            break;
      case 5:
            System.out.print("You chose option 5. Converting "+x+" from fahrenheit to celsuis :");
            System.out.print( (x-32)*(5/9)); System.out.println(" degrees celsuis.");
            break;
      case 6:
            System.out.println("You chose option 6. Converting "+x+" from celsuis to fahrenheit :");
            System.out.print((x *(9/5))+32);System.out.println(" degrees fahrenheit.");
            break;
      case 7:
            System.out.println("You chose option 7. Converting " +x+" from dunams to hectares :" );
            System.out.print(x/10);System.out.println(" hectares.");
            break;
      case 8:
            System.out.println("You chose option 8. Converting "+x+ " from hectares to dunams :");
            System.out.print(x*10);System.out.println(" dunams.");
            break;
      case 9:
            System.out.println("You chose option 9. Converting "+x+ " from dunams to acres :");
            System.out.print(x*0.247105);System.out.println(" acres.");
            break;
      case 10:
            System.out.println("You chose option 10. Converting "+x + " from acres to dunams :");
            System.out.print(x/0.247105);System.out.println(" dunams.");
            break;
      case 11:
            System.out.println("You chose to leave. Have a nice day!");
            break;
        default:
            System.out.println("Invalid choice. Please enter a number from 1 to 11 .");
            break;
    }
     
   
   
    }
}

