/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

// imports
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @studentName Tamim Chowdhury
 * @studentNumber 991816282
 * @date 2025/09/23
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand_num = new Random(); // random value
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand_num.nextInt(13) + 1); // 13 cards per suit
            c.setSuit(Card.SUITS[rand_num.nextInt(4)]); // 4 suits in deck
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner scn_input = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int c_val = scn_input.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int c_suit = scn_input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(c_val);
        userCard.setSuit(Card.SUITS[c_suit]);
        System.out.println("User card: " + userCard.getSuit() + " " + userCard.getValue());
        
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card(2, "Clubs"); // hardcoded from git webpage
    }
    
}
