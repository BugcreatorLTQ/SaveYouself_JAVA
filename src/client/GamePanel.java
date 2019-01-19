package client;

import java.awt.Color;

import javax.swing.JPanel;


public class GamePanel extends GridBagPanel {

	private static final long serialVersionUID = 1L;

	private JPanel gameOther;
	private JPanel gameHelp;
	private JPanel gameInfo;
	private JPanel gameCard;
	private JPanel gamePlayer;

	// 设置组件
	@Override
	void setComponents() {
		gameOther = new BlockPanel("Other", Color.BLACK);
		gameHelp = new BlockPanel("Help", Color.BLUE);
		gameInfo = new BlockPanel("Info", Color.CYAN);
		gameCard = new BlockPanel("Card", Color.GREEN);
		gamePlayer = new BlockPanel("Player", Color.ORANGE);
	}

	// 设置组件布局
	@Override
	void setComponentGcs() {
		setGcs(gameOther, 0, 0, 6, 2);
		setGcs(gameHelp, 6, 0, 2, 4);
		setGcs(gameCard, 0, 2, 6, 2);
		setGcs(gamePlayer, 0, 4, 5, 2);
		setGcs(gameInfo, 5, 4, 3, 2);
	}
}
