import java.util.ArrayList;

/**
 * Write a description of class Deck here.
 * 
 * @author (Patrick Georg Noon)
 * @version (version .01e-1000)
 */
public class Deck
{
    private java.util.List deck;
    private int index;
    public Deck(){
        deck = new ArrayList();
        index = 0;
    
        
    }
    public void addCard(Card card) {
        deck.add(card);
    }
    public int sizeOfDeck(){
        return deck.size();
        
}
    public Card dealCard() {
        if ( index < deck.size() )
            return (Card) deck.get( index++ );
        else
            return null;

    }
    public int deckSize(){
        return deck.size();
    }
    public int howManyCardsAreThereLeft() {
        int remainder =  deck.size() - index;
        return remainder;
    }
    }


 