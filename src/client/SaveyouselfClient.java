package client;

import constant.Constant;
import util.FrameUtil;

public class SaveyouselfClient extends FrameUtil {

	private static final long serialVersionUID = 1L;

	public boolean game = false;

	public StartPanel Start;

	public GamePanel Game;

	public void updataWindow() {
		Start.setVisible(!game);
		Game.setVisible(game);
	}

	public SaveyouselfClient() {
		super();
		Constant.client = this;
		Start = new StartPanel();
		Game = new GamePanel();
		basePanel.add(Start);
		basePanel.add(Game);
	}

	public static void main(String[] args) {
		new SaveyouselfClient();
	}

}
