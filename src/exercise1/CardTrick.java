package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Vyom
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] hand = new Card[7];
//Value and Suit Generator
        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(14));
            card.setSuit(Card.SUITS[random.nextInt(4)]);

// User Input
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Card Value (1-10, 11 = jack, 12 = queen, 13 = king): ");
        int valuechoice = in.nextInt();
        System.out.println("Enter Suit (0=hearts, 1=diamonds 2=spades, 3=clubs): ");
        int suitchoice = in.nextInt();

//Generated Card, and User Guess
        System.out.println("You picked: " + valuechoice + " of " + Card.SUITS[suitchoice]);

        if (valuechoice == card.getValue() && card.getSuit().equals(Card.SUITS[suitchoice]))
        {
            System.out.println("Congratulations, you guessed right!");
        } 
        else 
        {
            System.out.println("The Card you guessed, does not match.");
        }
        break;
        }
    }
    /**
     * @author Vyom Patel, Jan 25, 2023
     */

//About Me
        private static void printInfo() {
        System.out.println("My name is Vyom Patel");
        System.out.println("I am 18 Years Old");
        System.out.println("I am a domestic student");
        System.out.println("My Program is SDNE");
                
        System.out.println("My career ambitions:  Game Engineer or Software Engineer");
        System.out.println("-- Continue Programming and Designing Games");
        System.out.println("-- Have a semester with no violations of academic integrity!");

        System.out.println("My hobbies:");
        System.out.println("-- Drawing Illustrations");
        System.out.println("-- Designing Maps and programming");
        System.out.println("-- Learning  LUA and C++ on the side");
        System.out.println("-- Gaming");
    }

}
