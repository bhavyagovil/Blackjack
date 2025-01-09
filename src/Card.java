public class Card {
    private final Suit Suit;
    private final Rank Rank;
    private final boolean isAce;

    //constructor:
    public Card(Suit suit, Rank rank){
        this.Suit = suit;
        this.Rank = rank;
        this.isAce = (Rank.ACE == rank);
        //value is handled by the Rank class itself
    }

    public Rank getRank() {
        return Rank;
    }
    public Suit getSuit() {
        return Suit;
    }

    public boolean isAce() {
        return isAce;
    }

    public String toString(){
        return ("["+Rank+" of "+ Suit + "] ("+this.getRank().getValue()+")");

    }


}
