
/**
 * Write a description of class Card here.
 * 
 * @author (Patrick Georg Noon)
 * @version (version .01e-1000)
 */
public class Card
{
    protected int suit;
    protected int rank;


    private static final String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds"};
    private static final String[] ranks = {"Ace", "2", "3", "4", "5", "6","7", "8", "9", "10", "Jack", "Queen", "King"};

//card constructor
    public Card(){
        this(0,0);
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static String getRank(int i){
        return ranks[i];

    }
    public static int getNumOfRanks(){
        return ranks.length;
    }
    @Override
    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }

    public String rankToString(){
        return ranks.toString();
    }

    public String suitToString(){
        return suits.toString();
    }




    public int getSuit(){
    return suit;
    }


    public static void printCard(Card card) {
        System.out.println(card);
    }




    //Tests to see if two cards are equal.
    public Boolean compareTo(Card a, Card b) {
        // first compare the suits
        if (a.suit != b.suit) {
            return false;
        } else {
            // compare the ranks
            if (a.rank == b.rank) {
                return true;
            } else {
                return false;


            }
        }
    }
}


