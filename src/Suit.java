public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");

    private final String suitName;

    private Suit (String suitName){
        this.suitName = suitName;
    }

    public String toString(){
        return suitName;
    }

}
