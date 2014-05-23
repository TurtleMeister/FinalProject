
/**
 * Write a description of class Card here.
 * 
 * @author (Patrick Georg Noon)
 * @version (version .01e-1000)
 */
public class Card
{
    protected int color;
    protected int rank;
    protected int action;
    protected int blankAction;


    private static final String[] colors = { "Blue", "Red", "Green", "Yellow"};
    private static final String[] ranks = {"0", "1", "2", "3", "4", "5","6", "7", "8", "9"};

//card constructor
    public Card() {
        this(0, 0); //need to add more types of cards still, Different cards or just adding parts to this one?

    }

    public Card(int color, int rank) {
        this.color = color;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ranks[rank] + " of " + colors[color];
    }

    /**
     * Return true if the cards are equivalent.
     */

    // Problem with the compareTo method, this links into it so it doesn't work properly either.
//    @Override
//   public boolean equals(Object obj) {
//        boolean b = false;
//        if (obj instanceof Card) {
//            Card that = (Card) obj;
//            b = this.compareTo(that) == 0;
//        }
//        return b;
//    }

    public static void printCard(Card card) {
        System.out.println(card);
    }

    /**
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */


    //Problem with the compareTo method, for some reason the 2nd to last if-statement is unreachable.
//    public int compareTo(Card that) {
//        // first compare the colors
//        if (this.color == that.color) {
//            return 1;
//        }
//        else{
//            return -1;
//        }
//
//        // compare the ranks
//        if (this.rank > that.rank) return 1;
//        if (this.rank < that.rank) return -1;
//        return 0;
    }


}
