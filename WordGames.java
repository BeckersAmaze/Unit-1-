import java.util.Scanner;

class WordGames {
// prints inputed name with a insult
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("tell me your name: ");
    String name = input.nextLine();
    String insultedName = insult(name);
    System.out.println(insultedName);
// print a word alternating the inputs
    System.out.print("Give me a first word: ");
    String first = input.nextLine();
    System.out.print("Give me a second word: ");
    String second = input.nextLine();
    System.out.println(makeAbba(first, second));
// prints a word taht is only half of the original input
    System.out.print("Give me a long word: ");
    String longWord = input.nextLine();
    System.out.println(makeHalf(longWord));
//cut the first input in half and then puts the second input inside the first word
    System.out.print("Give me a name: ");
    String nameOne = input.nextLine();
    System.out.print("Give me another name: ");
    String nameTwo = input.nextLine();
    System.out.println(makeComboName(nameOne, nameTwo));
//makes piglatin
    System.out.print("Give me a word or something like that: ");
    String word = input.nextLine();
    System.out.println(pigLatin(word));
// turns word to uppercase
    System.out.print("give me a conjecture: ");
    String conjecture = input.nextLine();
    System.out.println(yellWord(conjecture));
// returns sentence
    System.out.print("give me a goddamn swear word: ");
    String swear = input.nextLine();
    System.out.println(swearWord(swear));
// takes first two letters away from the start of each word
    System.out.print("Gimme a wrd!!!! ");
    String gimme = input.nextLine();
    System.out.print("Gimme anoder WORRDShfgd!!!! ");
    String gimme2 = input.nextLine();
    System.out.println(takeTwoAway(gimme, gimme2));
// turns caps into lowercase
    System.out.print("Yell at me with caps!! ");
    String gimmeWord = input.nextLine();
    System.out.println(turnIntoQuiet(gimmeWord));
// takes a word and doubles the vowels
    System.out.print("give me a word: ");
    String vowel = input.nextLine();
    System.out.println(isVowel(vowel));



}
public static String insult(String n) {
  return "hello, " + n + " you slimey weasel.";
}

public static String makeAbba(String a, String b) {
  return a + b + b + a;
}

public static String makeHalf(String str) {
  int value = str.length();
  int valueFinal = value / 2;
  String half = str.substring(0, valueFinal);
  return half;
}

public static String makeComboName(String nameOne, String nameTwo) {
  String nameOneFirstHalf = nameOne.substring(0, 2);
  String nameOneSecondHalf = nameOne.substring(2);
  return nameOneFirstHalf + nameTwo + nameOneSecondHalf;
}

public static String pigLatin(String str) {
  int value = str.length();
  String firstValue = str.substring(0, 1);
  String secondValue = str.substring(1, value);
  return "a" + secondValue + firstValue;
}

public static String yellWord(String word) {
  String text = word.toUpperCase();
  return text;
}

public static String swearWord(String str) {
  return str + " is a bad word that isn't good. You're are a bad person!!!";
}

public static String takeTwoAway(String a, String b) {
  int length = a.length();
  String lengthOne = a.substring(1, length);
  int lengthThree = b.length();
  String lengthTwo = b.substring(1, lengthThree);
  return lengthOne + lengthTwo;
}

public static String turnIntoQuiet(String str) {
  String answer = str.toLowerCase();
  return "be quiet like this: " + answer;
}

public static String isVowel(String str) {
   String answer = "";
   for(int i = 0; i < str.length(); i++) {
       char cur = str.charAt(i);
      answer += str.charAt(i);
    if(cur == 'a' ||
       cur == 'e' ||
       cur == 'i' ||
       cur == 'o' ||
       cur == 'u')
    {
       return "" + cur + cur;
    }
    else {
       return "" + cur;
    }

  }
  return answer;
}
}
