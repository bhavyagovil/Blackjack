public class Card {
    private final Suit Suit;
    private final Rank Rank;
    private final int Value;
    private boolean isAce;

    //constructor:
    public Card(Suit suit, Rank rank, int value){
        this.Suit = suit;
        this.Rank = rank;
        this.Value = value;
    }

    public Rank getRank() {
        return Rank;
    }

    public Suit getSuit() {
        return Suit;
    }

    public int getValue(){
        return Value;
    }

}
