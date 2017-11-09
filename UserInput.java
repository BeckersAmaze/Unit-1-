import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) {
    Scanner newName = new Scanner(System.in);
    System.out.print("What is your favourite number? ");
    int name = newName.nextInt();
    System.out.println("Your number is " + name + "!");
  }
}
