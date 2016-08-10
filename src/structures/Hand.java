package structures;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cards;
	
	public Hand(){
		this.cards = new ArrayList<Card>();
	}
	
	public Hand(List<Card> cards) {
		this.cards = cards;
	}
	
	/**
	 * Adds a card to the Hand
	 * @param num Position of the card.
	 * @return returns a success
	 */
	public boolean addCard(Card c){	
		return cards.add(c);
	}
	
	/**
	 * removes a card from the Hand
	 * @param num Position of the card.
	 * @return returns a success
	 */
	public boolean removeCard(Card c){
		return cards.remove(c);
	}
	
	/**
	 * sorts the cards in the hand
	 * @return returns the shuffled list of cards
	 */
	public List<Card> sort(){
		return null;
	}
	
	/*
	 *  @return returns the card in the hand
	 */
	public List<Card> cardsInHand(){
		return cards;
	}
	
	public String toString() {
		return this.cards.toString();
	}
	
}
