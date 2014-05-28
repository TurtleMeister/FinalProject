import java.util.ArrayList;


/**
 * Write a description of class Hand here.
 *
 * @author (Patrick Georg Noon)
 * @version (version .01e-1000)
 */
public class Hand
{
    private java.util.List hand;
    public static void main(){
        Deck deck = new Deck();
        Hand hand = new Hand();
        Card cards;

        System.out.println(deck.howManyCardsAreThereLeft());

        while (deck.howManyCardsAreThereLeft()!= 0 )
        {
            cards = deck.drawCard();
            System.out.println( cards.toString() );
        }

    }
    public void addACard (Card card){
        hand.add(card);

    }
    //we cast an int as a card and send it off
    public Card findACard(int c){
        return (Card) hand.get(c);
    }



    Hand(){
        hand = new ArrayList<Card>();

        for (int i = 0; i <= 7; i++) {

            hand.add(new Card[i]);

        }
    }
}

