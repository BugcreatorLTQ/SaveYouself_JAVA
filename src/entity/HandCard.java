package entity;

import java.awt.Image;

public abstract class HandCard extends Card {

	public HandCard(Image img) {
		super(img, null);
		setInfo();
	}
	
	public abstract void setInfo();
	
	public abstract void work();
}
