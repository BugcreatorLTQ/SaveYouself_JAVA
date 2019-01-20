package entity;

import java.awt.Image;
import java.util.LinkedList;
import java.util.List;

import util.CardUtil;


public class Player {

	public List<HandCard> cards = new LinkedList<>();
	public Image image;
	public int HP;

	public Player(Image img, int HP) {
		this.image = img;
		this.HP = HP;
		addCard(new CardUtil.bullet());
		addCard(new CardUtil.bullet());
		addCard(new CardUtil.bullet());
	}

	public void addCard(HandCard card) {
		cards.add(card);
	}

}
