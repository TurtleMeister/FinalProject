
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

    public Card(int color, int rank) {
        this.color = color;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ranks[rank] + " of " + colors[color];
    }

    public String rankToString(){
        return ranks.toString();
    }

    public String colorToString(){
        return colors.toString();
    }

    public int getRank(){
    switch(rank){
        case 0: return 0;
        case 1: return 1;
        case 2: return 2;
        case 3: return 3;
        case 4: return 4;
        case 5: return 5;
        case 6: return 6;
        case 7: return 7;
        case 8: return 8;
        case 9: return 9;

    }
        return rank;
    }


    public int getColor(){
    return color;
    }


    public static void printCard(Card card) {
        System.out.println(card);
    }




    //Tests to see if two cards are equal.
    public Boolean compareTo(Card a, Card b) {
        // first compare the colors
        if (a.color != b.color) {
            return false;
        }
        else{
        // compare the ranks
        if (a.rank == b.rank) {
            return true;
        }
       else {
            return false;


        }
        }
    }
}