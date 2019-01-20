package entity;

import java.util.LinkedList;
import java.util.List;

public class Player {

	public List<HandCard> cards = new LinkedList<>();
	public int HP;

	public Player(int HP) {
		this.HP = HP;
	}

	public void addCard(HandCard card) {
		cards.add(card);
	}

}
