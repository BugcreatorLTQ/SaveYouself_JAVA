package client;

import javax.swing.JPanel;

import entity.Card;
import entity.Player;
import util.ImageUtil;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

@SuppressWarnings("serial")
public class GamePlayer extends JPanel {

	private static Color color = Color.CYAN;
	public Player player = new Player(ImageUtil.Player.gun, 2);

	/**
	 * Create the panel.
	 */
	public GamePlayer() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblStatus = new JLabel("status");
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.gridheight = 2;
		gbc_lblStatus.gridwidth = 5;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.fill = GridBagConstraints.BOTH;
		gbc_lblStatus.gridx = 0;
		gbc_lblStatus.gridy = 0;
		add(lblStatus, gbc_lblStatus);
		
				JButton btnOk = new JButton("\u51FA\u724C");
				btnOk.setFont(new Font("µ»œﬂ Light", Font.PLAIN, 20));
				btnOk.setBackground(Color.WHITE);
				GridBagConstraints gbc_btnOk = new GridBagConstraints();
				gbc_btnOk.gridheight = 2;
				gbc_btnOk.fill = GridBagConstraints.BOTH;
				gbc_btnOk.insets = new Insets(0, 0, 5, 0);
				gbc_btnOk.gridx = 5;
				gbc_btnOk.gridy = 0;
				add(btnOk, gbc_btnOk);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.gridwidth = 6;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		for (Card card : player.cards) {
			panel.add(new CardLabel(card));
		}

		for(Component comp : getComponents()){
			comp.setBackground(color);
		}

	}

}
