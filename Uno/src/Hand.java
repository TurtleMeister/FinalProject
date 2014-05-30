import java.util.ArrayList;


/**
 * Write a description of class Hand here.
 *
 * @author (Patrick Georg Noon)
 * @version (version .01e-1000)
 */
public class Hand
{
    private java.util.List<Card> hand;
//    public static void main(){
//        Deck deck = new Deck();
//        Hand hand = new Hand();
//        Card cards;
//
//        System.out.println(deck.howManyCardsAreThereLeft());
//
//
//    }
    public void addACard (Card card){
        hand.add(card);

    }
    //we cast an int as a card and send it off
    public Card findACard(int i){
        Card c = hand.get(i);
        hand.remove(c);
        return c;
    }

    public int handSize() {
        int remainder;
        remainder = hand.size();
        return remainder;
    }


    public Hand(Deck deck){
        hand = new ArrayList<Card>();

        for (int i = 0; i <= 6; i++) {

            hand.add(deck.drawCard());

        }
    }
}

