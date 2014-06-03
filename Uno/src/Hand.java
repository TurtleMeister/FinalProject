import java.util.ArrayList;
//Add a main class that invokes the various classes, calls Deck to make a deck, and Hand to show the hand

/**
 * Write a description of class Hand here.
 *
 * @author (Patrick Georg Noon)
 * @version (version .01e-1000)
 */
public class Hand
{
    private java.util.ArrayList<Card> hand;

    public static void main(String [] args)
    {
        Card card;
        Deck deck = new Deck();
        Hand player = new Hand(deck);
        System.out.println("player");
        for (int i = 0; i < player.handSize(); i++)
        {
            card = player.findACard(i);

            System.out.println(" " + card.toString() + " ");
            System.out.println(player.handSize());
        }
    }

    public void addACard (Card card){
        hand.add(card);

    }
    //we cast an int as a card and send it off
    public Card findACard(int i)
    {
        Card c = hand.get(i);

        return c;
    }
public void destroyCard(int i){
        Card c = hand.get(i);
    hand.remove(i);
}


    public int searchHand(Hand hand, int rank) {    //this one was a giant pain in the butt to get right. I think I spent
                                                    //just as much time on this one method than I did on the everything else.
                                                    //it started out way way more complicated.

            for (int q = 0; q < handSize() - 1 ; q++) {
                Card card = hand.findACard(q);
                int cardRank = card.rank;
                if (cardRank == rank) {

                    return q;


                }

            }

        return -1;

    }
    public int handSize()
    {  //this reports the size of the hand.
        int remainder;
        remainder = hand.size();
        return remainder;

    }

    public int howManyBooks() {
        int bookCount = 0;
        for (int i = 0; i < Card.getNumOfRanks(); i++) {
            int matches = 0;
            for (int q = 0; q < handSize(); q++) {
                Card card = hand.get(q);
                int cardRank = card.rank;
                if (cardRank == i) {
                    ++matches;
                }

            }
            if (matches == 4) {
                bookCount++;
            }
        }
        return bookCount;
    }



    public static void printCard(Card card) {
        System.out.println(card);
    }


    public Hand(Deck deck)
    {  //this builds a hand by using the deck.
        hand = new ArrayList<Card>();

        for (int i = 0; i <= 6; i++)
        {

            hand.add(deck.drawCard());

        }
    }
}

