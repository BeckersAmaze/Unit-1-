import java.util.Scanner;




//Some possibilities:
//Have the user guess a number between 1 and 500.
//Give feedback ("too high", etc.)
class MiniGame {

  public static void main(String[] args) {
    talkToUser();
  }

  public static void talkToUser() {
    Scanner in = new Scanner(System.in);
    String magicWord = "please";
    String firstLetter = magicWord.substring(0,1);
    String response = "";
    int numOfGuesses = 0;
    String hint = "The word is shorter than 7 letters. ";
    String hintTwo = "The word starts with the letter. " + firstLetter + " ";
    String hintThree = "You are really bad at this game. The answer is: " + magicWord;

    while(!response.equals(magicWord)) {
      System.out.print("What is the magic word? ");
      response = in.nextLine();
      numOfGuesses++;
      if(numOfGuesses == 5) {
        System.out.print(hint);
      }
      if(numOfGuesses == 10) {
        System.out.print(hintTwo);
      }
      else if(numOfGuesses == 15) {
        //print give up loser
        break;
      }
      else {
        System.out.print("");
      }
    }
    //Now that we're done asking, congratulate them.
if(numOfGuesses == 15) {
  System.out.println(hintThree);
}
else {
    System.out.println("Awesome job you get the trophy!!\n\n\n\n");
    System.out.println("Just kidding");


  }
  }
}
