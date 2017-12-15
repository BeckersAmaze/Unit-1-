package org.vashonsd;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<foodBot> waiters = new ArrayList<foodBot>();

        waiters.add(new foodBot("Mexican"));
        waiters.add(new foodBot("Japanese"));
        waiters.add(new foodBot("Canadian"));
        waiters.add(new foodBot("Thai"));
        waiters.add(new foodBot("American"));
        waiters.add(new foodBot("Human"));

        //The next three lines get us a random foodBot from the waiters ArrayList.
        Random rand = new Random();
        int whichWaiter = rand.nextInt(waiters.size()-1);
        foodBot f = waiters.get(whichWaiter);
        System.out.println(f.getGreeting());
        System.out.println(f.getCourse());
        System.out.println(f.getCheck());

    }
}
