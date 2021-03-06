package proj2;

public class Set extends MyStack<Card> {

    static Stack set;
    private char rank;

    public Set(char r) {
        super();
        rank = r;
    }

    /*
     * Must override the behavior of the HandInterface so that a Set only accepts a
     * card if it is of the same rank.
     */
    public void addCard(Card card) {
        if (this.rank == card.getRank()) {
            push(card);
        } else {
            System.out.println("cards are not of the same rank");
        }

    }

    /**
     * returns the rankIndex of the set
     * 
     * @return int returns int corresponding to rank as defined in CardInterface
     */
    public int getRankIndex() {
        return Card.getRankIndex(getRank());

    }

    /**
     * returns the rank of the set
     * 
     * @return char returns char of rank as defined in CardInterface
     */
    public char getRank() {
        return rank;
    }

    /**
     * Determines whether Set is contains all four cards.
     * 
     * @return if true then no more Card may be added to the set
     */
    public boolean isFull() {
        if (this.size() == 3) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Ranks the cards in a set according to their suit
     */

}
