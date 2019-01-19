package client;


import javax.swing.JPanel;

import entity.GamePanel;
import entity.StartPanel;
import util.FrameUtil;

public class SaveyouselfClient extends FrameUtil {

	private static final long serialVersionUID = 1L;

	public boolean game = false;

	private JPanel Start = new StartPanel();

	private JPanel Game = new GamePanel();

	void showWindow() {
		Game.setVisible(game);
		Start.setVisible(!game);
	}

	public SaveyouselfClient() {
		super();
		basePanel.add(Game);
		basePanel.add(Start);
		showWindow();
	}

	public static void main(String[] args) {
		new SaveyouselfClient();
	}

}
