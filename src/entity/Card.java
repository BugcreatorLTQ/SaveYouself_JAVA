package entity;

import java.awt.Image;

public abstract class Card {

	protected Image img;

	protected String info;

	public Card(Image img, String info) {
		this.img = img;
		this.info = info;
	}

	// ��ȡͼ��
	public Image getImage() {
		return this.img;
	}

	// ��ȡ��Ϣ
	public String getInfo() {
		return this.info;
	}

	// ����ͼ��
	public void setImage(Image img) {
		this.img = img;
	}

	// ������Ϣ
	public void setInfo(String info) {
		this.info = info;
	}

}
