package client;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	public GameOther other;
	public GameHelp help;
	public GameInfo info;
	public GamePlayer player;

	/**
	 * Create the panel.
	 */
	public GamePanel() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		other = new GameOther();
		other.setBackground(Color.BLUE);
		GridBagConstraints gbc_other = new GridBagConstraints();
		gbc_other.insets = new Insets(0, 0, 0, 0);
		gbc_other.gridwidth = 8;
		gbc_other.fill = GridBagConstraints.BOTH;
		gbc_other.gridx = 0;
		gbc_other.gridy = 0;
		add(other, gbc_other);

		help = new GameHelp();
		help.setBackground(Color.PINK);
		GridBagConstraints gbc_help = new GridBagConstraints();
		gbc_help.fill = GridBagConstraints.BOTH;
		gbc_help.gridheight = 3;
		gbc_help.insets = new Insets(0, 0, 0, 0);
		gbc_help.gridx = 8;
		gbc_help.gridy = 0;
		add(help, gbc_help);

		JPanel card = new JPanel();
		card.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_card = new GridBagConstraints();
		gbc_card.gridheight = 2;
		gbc_card.insets = new Insets(0, 0, 0, 0);
		gbc_card.fill = GridBagConstraints.BOTH;
		gbc_card.gridwidth = 8;
		gbc_card.gridx = 0;
		gbc_card.gridy = 1;
		add(card, gbc_card);

		info = new GameInfo();
		info.setBackground(Color.ORANGE);
		GridBagConstraints gbc_info = new GridBagConstraints();
		gbc_info.insets = new Insets(0, 0, 0, 0);
		gbc_info.weightx = 1.0;
		gbc_info.gridheight = 3;
		gbc_info.fill = GridBagConstraints.BOTH;
		gbc_info.gridx = 8;
		gbc_info.gridy = 3;
		add(info, gbc_info);

		player = new GamePlayer();
		player.setBackground(Color.CYAN);
		GridBagConstraints gbc_player = new GridBagConstraints();
		gbc_player.fill = GridBagConstraints.BOTH;
		gbc_player.gridwidth = 8;
		gbc_player.gridheight = 3;
		gbc_player.gridx = 0;
		gbc_player.gridy = 3;
		add(player, gbc_player);

	}

	public void setInfo(String text) {
		this.info.txtInfo.setText(text);

	}

}
