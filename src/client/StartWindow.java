package client;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class StartWindow extends JPanel {

	private JPanel left;
	private JPanel right;
	private StartMenu menu;

	/**
	 * Create the panel.
	 */
	public StartWindow() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		left = new JPanel();
		left.setBackground(Color.WHITE);
		GridBagConstraints gbc_left = new GridBagConstraints();
		gbc_left.fill = GridBagConstraints.BOTH;
		gbc_left.gridwidth = 4;
		gbc_left.gridx = 0;
		gbc_left.gridy = 0;
		add(left, gbc_left);
		left.setLayout(new CardLayout(0, 0));

		right = new JPanel();
		right.setBackground(Color.WHITE);
		GridBagConstraints gbc_right = new GridBagConstraints();
		gbc_right.fill = GridBagConstraints.BOTH;
		gbc_right.gridwidth = 4;
		gbc_right.gridx = 11;
		gbc_right.gridy = 0;
		add(right, gbc_right);

		menu = new StartMenu();
		menu.setBackground(Color.WHITE);
		GridBagConstraints gbc_menu = new GridBagConstraints();
		gbc_menu.fill = GridBagConstraints.BOTH;
		gbc_menu.gridwidth = 7;
		gbc_menu.gridx = 4;
		gbc_menu.gridy = 0;
		add(menu, gbc_menu);

	}

	public void openHelp(boolean aFlag) {
		menu.setVisible(aFlag);
		left.setVisible(!aFlag);
		right.setVisible(!aFlag);
	}
}
