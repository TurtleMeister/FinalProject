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
//    Collection<String> d = deck;
//    Iterator<String> it = c.itreator();
//    while(it.hasNext()){
//        System.out.println(it.next());
//    }
//

//    private Card[] cards;
//    private Random generator;
//    private int numberOfCards;
//
//        public Deck(){
//        numberOfCards = 108;
//            generator = new Random();
//            int a = 0;
//            cards = new Card[numberOfCards];
//            for(int i = 0; i <= 3; i++){
//                for(int o = 0; o <= 10; o++){
//                    cards[a] = new Card(i,o);
//                    a++;
//                }
//
//            }
//        }
//makes an array list of cards and adds them to a deck

        Deck() {

            cards = new ArrayList<Card>();

            for (int i = 0; i <= 3; i++) {

                for (int o = 0; o <= 12; o++) {

                    cards.add(new Card(i, o));
                }
            }
        }



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
