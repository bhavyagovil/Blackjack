import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;

    //arrays cannot store objects and are dynamically resizable


    public Deck() {
        deck = new ArrayList<>();
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                deck.add(new Card(suit, rank));
            }
        }

    }

    public ArrayList<Card> getCards() {
        return deck;
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public void shuffleCards(){
        Collections.shuffle(deck, new Random());
    }

    public void dealCards(){

    }

    public void removeCard(){

    }

    public String toString(){
        String cardsInDeck = "";
        for (Card card: deck){
            cardsInDeck += card;
            cardsInDeck += "\n";
        }
        return cardsInDeck;
    }



}
