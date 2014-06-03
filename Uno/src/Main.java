/**
 * Created by 10A13 on 5/27/14.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    private static java.util.ArrayList deck;

    static Random rand = new Random();
    private ArrayList<Card> cards;
    private ArrayList<Card> hand;



    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int round = 0;
        Deck deck = new Deck();
        Card card;
        Hand player = new Hand(deck);
        Hand computer = new Hand(deck);
        int playerBookCount = 0;
        int computerBookCount = 0;

        while (round < 5 && deck.deckSize() > 0) {

            System.out.println("First player hand");


            for (int i = 0; i < player.handSize(); i++) {
                card = player.findACard(i);

                System.out.print(" " + card.toString() + " ");
            }
            System.out.println();
            System.out.println("Player currently has " + player.howManyBooks() + " books!");
            System.out.println("Player. What card would you like?");
            int check = user.nextInt();  //press the number for the card you want.
            System.out.println("searching in Computer's hand for " + "card number " + check + "!");

            int cardIndex = player.searchHand(computer, check);

            if (cardIndex >= 0) {
                System.out.println("You found the card!");
                System.out.println();
                player.addACard(computer.findACard(cardIndex));
               computer.destroyCard(cardIndex);
                System.out.println("Player currently has " + player.howManyBooks() + " books!");
                System.out.println();
                playerBookCount++;
            }
            else{
                System.out.println("You did not get the card...");
            }


            System.out.println("Computer currently has " + computer.howManyBooks() + " books!");

            int compCheck = rand.nextInt(7) + 1;

            System.out.println("Computer looks for your " + " number " + compCheck + " card in your hand!");
            int cardIndex2 = computer.searchHand(player, compCheck);

            if (cardIndex >= 0) {
                System.out.println("The computer took your card!");
                System.out.println();
                computer.addACard(player.findACard(cardIndex));
                player.destroyCard(cardIndex);
                System.out.println("Computer currently has " + player.howManyBooks() + " books!");
                System.out.println();
                computerBookCount++;
            }
            else{
                System.out.println("Computer did not get your card!");
            }



            round++;
        }
        int playerPoints = playerBookCount;
        int computerPoints = computerBookCount;
        if (playerPoints > computerPoints) {
            System.out.println("You win!!! Computer sobs in defeat...");
        } else {
            System.out.println("You lost!!! You cry pitifully while the Computer gloats...");

        }

    }
}
















