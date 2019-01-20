package client;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public GamePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel other = new JPanel();
		GridBagConstraints gbc_other = new GridBagConstraints();
		gbc_other.fill = GridBagConstraints.BOTH;
		gbc_other.gridwidth = 6;
		gbc_other.gridheight = 2;
		gbc_other.gridx = 0;
		gbc_other.gridy = 0;
		add(other, gbc_other);

		JPanel help = new JPanel();
		GridBagConstraints gbc_help = new GridBagConstraints();
		gbc_help.fill = GridBagConstraints.BOTH;
		gbc_help.gridheight = 4;
		gbc_help.gridwidth = 3;
		gbc_help.gridx = 6;
		gbc_help.gridy = 0;
		add(help, gbc_help);

		JPanel card = new JPanel();
		GridBagConstraints gbc_card = new GridBagConstraints();
		gbc_card.fill = GridBagConstraints.BOTH;
		gbc_card.gridwidth = 6;
		gbc_card.gridheight = 2;
		gbc_card.gridx = 0;
		gbc_card.gridy = 2;
		add(card, gbc_card);

		JPanel player = new JPanel();
		GridBagConstraints gbc_player = new GridBagConstraints();
		gbc_player.fill = GridBagConstraints.BOTH;
		gbc_player.gridwidth = 5;
		gbc_player.gridheight = 2;
		gbc_player.gridx = 0;
		gbc_player.gridy = 4;
		add(player, gbc_player);

		JPanel info = new JPanel();
		GridBagConstraints gbc_info = new GridBagConstraints();
		gbc_info.fill = GridBagConstraints.BOTH;
		gbc_info.gridwidth = 4;
		gbc_info.gridx = 5;
		gbc_info.gridy = 4;
		add(info, gbc_info);

	}

}
