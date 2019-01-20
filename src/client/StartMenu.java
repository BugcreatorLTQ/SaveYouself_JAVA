package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import constant.Constant;

@SuppressWarnings("serial")
public class StartMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public StartMenu() {
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblSaveYouself = new JLabel("Save Youself");
		lblSaveYouself.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		GridBagConstraints gbc_lblSaveYouself = new GridBagConstraints();
		gbc_lblSaveYouself.gridheight = 3;
		gbc_lblSaveYouself.insets = new Insets(0, 0, 0, 0);
		gbc_lblSaveYouself.gridx = 0;
		gbc_lblSaveYouself.gridy = 0;
		add(lblSaveYouself, gbc_lblSaveYouself);

		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.openGame(true);
			}
		});
		btnStart.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		btnStart.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.gridheight = 2;
		gbc_btnStart.fill = GridBagConstraints.BOTH;
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 3;
		add(btnStart, gbc_btnStart);

		JButton btnHelp = new JButton("Help");
		btnHelp.setFont(new Font("Calibri", Font.BOLD, 20));
		btnHelp.setBackground(Color.WHITE);
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.startPanel.openHelp(true);
			}
		});
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.gridheight = 2;
		gbc_btnHelp.fill = GridBagConstraints.BOTH;
		gbc_btnHelp.gridx = 0;
		gbc_btnHelp.gridy = 5;
		add(btnHelp, gbc_btnHelp);

		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		btnExit.setBackground(Color.WHITE);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.gridheight = 2;
		gbc_btnExit.fill = GridBagConstraints.BOTH;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 7;
		add(btnExit, gbc_btnExit);

	}

}
