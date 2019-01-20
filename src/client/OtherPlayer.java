package client;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;

import entity.Player;
import util.ImageUtil;

import java.awt.Color;

@SuppressWarnings("serial")
public class OtherPlayer extends JPanel {

	private JLabel lblImage;
	private JTextPane txtStatus;
	private Player player = new Player(ImageUtil.Player.bullet, 2);

	/**
	 * Create the panel.
	 */
	public OtherPlayer() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblImage = new JLabel("");
		GridBagConstraints gbc_lblImage = new GridBagConstraints();
		gbc_lblImage.gridwidth = 3;
		gbc_lblImage.gridx = 0;
		gbc_lblImage.gridy = 0;
		add(lblImage, gbc_lblImage);
		lblImage.setIcon(new ImageIcon(player.image));

		txtStatus = new JTextPane();
		txtStatus.setText("Status");
		txtStatus.setEditable(false);
		GridBagConstraints gbc_txtStatus = new GridBagConstraints();
		gbc_txtStatus.fill = GridBagConstraints.VERTICAL;
		gbc_txtStatus.gridx = 3;
		gbc_txtStatus.gridy = 0;
		add(txtStatus, gbc_txtStatus);

	}

	public void setColor(Color color) {
		this.txtStatus.setBackground(color);
	}

}
