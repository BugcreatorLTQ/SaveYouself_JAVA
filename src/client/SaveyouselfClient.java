package client;



import entity.GamePanel;
import entity.StartPanel;
import util.FrameUtil;

public class SaveyouselfClient extends FrameUtil {

	private static final long serialVersionUID = 1L;

	private boolean game = false;

	private StartPanel Start = new StartPanel();

	private GamePanel Game = new GamePanel();

	private void showWindow() {
		Game.setVisible(game);
		Start.setVisible(!game);
	}

	private SaveyouselfClient() {
		super();
		basePanel.add(Game);
		basePanel.add(Start);
		showWindow();
	}

	public static void main(String[] args) {
		new SaveyouselfClient();
	}

}
