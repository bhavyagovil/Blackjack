public class Main {
    public static void main(String[] args) {

        Hand hand1 = new Hand();
        Hand dealer = new Hand();
        Deck testDeck = new Deck();

        //System.out.println(testDeck);

        testDeck.shuffleCards();
        System.out.println(testDeck);
    }
}