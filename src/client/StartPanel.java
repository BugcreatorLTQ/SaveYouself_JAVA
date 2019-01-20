package client;

import javax.swing.JPanel;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class StartPanel extends JPanel {

	private StartWindow start;
	private StartHelp help;

	/**
	 * Create the panel.
	 */
	public StartPanel() {
		setLayout(new CardLayout(0, 0));
		start = new StartWindow();
		help = new StartHelp();
		add(start);
		add(help);
		openHelp(false);
	}

	public void openHelp(boolean aFlag) {
		help.setVisible(aFlag);
		start.setVisible(!aFlag);
	}

}
