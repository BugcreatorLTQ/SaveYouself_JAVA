package entity;

import java.awt.Image;

public abstract class HandCard extends Card {

	public HandCard(Image img, String info) {
		super(img, info);
	}
	
	public abstract void work();
}
