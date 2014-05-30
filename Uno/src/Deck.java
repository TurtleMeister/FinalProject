import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Deck here.
 *
 * @author (Patrick Georg Noon)
 * @version (version .01e1000)
 */
public class Deck {
    private static java.util.List deck;
    private ArrayList<Card> cards;
//prints out the deck
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Card cards;

        System.out.println( deck.howManyCardsAreThereLeft() );

        while (deck.howManyCardsAreThereLeft()!= 0 )
        {
            cards = deck.drawCard();
            System.out.println( cards.toString() );
        }
    }

//makes an array list of cards and adds them to a deck

        Deck() {

            cards = new ArrayList<Card>();

            for (int i = 0; i <= 3; i++) {

                for (int o = 0; o <= 12; o++) {

                    cards.add(new Card(i, o));
                }
            }
        }


//adds a card
    public Card drawCard(){
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);

    }


    public int howManyCardsAreThereLeft() {
        int remainder;
        remainder = cards.size();
        return remainder;
    }

}
