public class Card {
    private final Suit suit;
    private final Rank rank;
    private final boolean isAce;

    //constructor:
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
        this.isAce = (Rank.ACE == rank);
        //value is handled by the Rank class itself
    }

    public Rank getRank() {
        return rank;
    }
    public Suit getSuit() {
        return suit;
    }

    public boolean isAce() {
        return isAce;
    }

    public String toString(){
        return ("["+rank+" of "+ suit + "] ("+this.getRank().getValue()+")");

    }


}
