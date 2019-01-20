package client;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constant.Constant;
import entity.Card;

@SuppressWarnings("serial")
public class CardLabel extends JLabel {

	private Card card;

	public CardLabel(Card card) {
		super();
		this.setText(null);
		this.card = card;
		setLabelIcon();

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.gamePanel.setInfo(card.getInfo());
			}
		});
	}

	private void setLabelIcon() {
		this.setIcon(new ImageIcon(card.getImage()));
	}

	public void setLabelIcon(Image img) {
		card.setImage(img);
		setLabelIcon();
	}

}
