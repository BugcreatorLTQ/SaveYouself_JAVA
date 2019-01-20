package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import constant.Constant;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class StartHelp extends JPanel {

	/**
	 * Create the panel.
	 */
	public StartHelp() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 12;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		
		JTextArea txtrHelp = new JTextArea();
		txtrHelp.setEditable(false);
		txtrHelp.setTabSize(16);
		txtrHelp.setWrapStyleWord(true);
		txtrHelp.setLineWrap(true);
		txtrHelp.setText("HELP");
		scrollPane.setViewportView(txtrHelp);

		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Constant.client.startPanel.openHelp(false);
			}
		});
		btnBack.setBackground(Color.WHITE);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("MV Boli", Font.BOLD, 20));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.gridheight = 2;
		gbc_btnBack.gridwidth = 2;
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.gridx = 12;
		gbc_btnBack.gridy = 0;
		add(btnBack, gbc_btnBack);
 
		
	}


}
