/**
 * Created by 10A13 on 5/27/14.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static java.util.List deck;


    private ArrayList<Card> cards;
    private ArrayList<Deck> hand;

    public static void main(String [] args){
        Scanner user1 = new Scanner(System.in);
        Deck deck = new Deck();
        Card card = new Card();
        Hand hand = new Hand(deck);
        Hand hand2 = new Hand(deck);

        System.out.println("If you want to play, press a key.");
        String reply;
        do {
            reply = user1.nextLine();
        } while (reply.equals("no") && reply.equals("yes"));
        //figure out how to go by user pressing the enter key.
                System.out.println("First player hand");

        while (hand.handSize() >= 0 )
        {
            for(int i = 0; i < hand.handSize(); i++){
            card = hand.findACard(i);
                System.out.println(card.toString() );

            }








            }
            }
        }












