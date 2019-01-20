package entity;

import java.awt.Image;

public abstract class Card {

	protected Image img;

	protected String info;

	public Card(Image img, String info) {
		this.img = img;
		this.info = info;
	}

	// 获取图像
	public Image getImage() {
		return this.img;
	}

	// 获取信息
	public String getInfo() {
		return this.info;
	}

	// 设置图像
	public void setImage(Image img) {
		this.img = img;
	}

	// 设置信息
	public void setInfo(String info) {
		this.info = info;
	}

}
