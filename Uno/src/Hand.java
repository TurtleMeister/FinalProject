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

    public void addACard (Card card){
        hand.add(card);

    }
    //we cast an int as a card and send it off
    public Card findACard(int c){
        return (Card) hand.get(c);
    }
}
