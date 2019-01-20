package client;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;
import java.awt.Color;
import java.awt.Component;

@SuppressWarnings("serial")
public class GameOther extends JPanel {

	private static Color color = Color.RED;
	public List<OtherPlayer> players;

	/**
	 * Create the panel.
	 */
	public GameOther() {
		setBackground(color);
		setLayout(new GridLayout(1, 3, 0, 0));

		players = new LinkedList<>();

		for (int i = 0; i < 3; i++) {
			players.add(new OtherPlayer());
		}

		for (OtherPlayer player : players) {
			player.setColor(color);
			add(player);
		}

		for (Component comp : getComponents()) {
			comp.setBackground(color);
		}

	}

}
