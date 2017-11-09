import java.util.Scanner;

class Calculator {
  public static Scanner in = new Scanner(System.in);


  public static void main(String[] args) {
    int response = readInt("Enter a number please: ");
    System.out.println(response + " is even: " + isEven(response));
    int num = readInt("Give me a number to divide: ");
    int divisor = readInt("Give me the number to divide by: ");
    System.out.println( num + " is divisible by " + divisor + " " + isDivisibleBy(num, divisor));
    //
    //
    String str = readLine("Do you want to add, multiply, divide or subtract? ");
    System.out.println("Oh you want to: " + whichOne(str));
    // System.out.println("Do you want to add, multiply, divide or subtract? ");
    // String str = in.nextLine();
    // System.out.println(str);
    //




  }

  public static int readInt(String prompt) {
    System.out.print(prompt);
    int guess = in.nextInt();
    in.nextLine();
    return guess;
  }

  public static String readLine(String prompt) {
    System.out.print(prompt);
    return in.nextLine();
  }

public static boolean isEven(int n) {
  if(n % 2 == 0) {
    return true;
  }
  else {
    return false;
  }
}

/**
 * given two numbers, returns true if the first is divisible by the second.
 * @param num The number t be divided.
 * @param divisor The number to divide by.
 * @return True if the num is divisible by the divisor, false otherwise.
 **/
public static boolean isDivisibleBy(int num, int divisor) {
    if(num % divisor == 0) {
      return true;
    }
    else {
      return false;
    }
    // or you can use this: return (num % divisor == 0);
    }


public static String whichOne(String str) {

  if(str.equals("add")) {
    return "add";

  }else if(str.equals("divide")) {
    return "divide";

  }else if(str.equals("subtract")) {
    return "subtract";

  }else if(str.equals("multiply")){
    return "multiply";

  }else{
    return "error";
  }
}

  }
