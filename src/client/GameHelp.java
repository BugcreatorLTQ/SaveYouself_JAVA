package client;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;

@SuppressWarnings("serial")
public class GameHelp extends JPanel {

	private static Color color = Color.PINK;

	/**
	 * Create the panel.
	 */
	public GameHelp() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JTextPane txtCard = new JTextPane();
		txtCard.setEditable(false);
		txtCard.setText("\u8FD8\u52691\u5F20\u5361");
		GridBagConstraints gbc_txtCard = new GridBagConstraints();
		gbc_txtCard.insets = new Insets(0, 0, 5, 0);
		gbc_txtCard.fill = GridBagConstraints.VERTICAL;
		gbc_txtCard.gridx = 0;
		gbc_txtCard.gridy = 0;
		add(txtCard, gbc_txtCard);
		
		JLabel lblCardImage = new JLabel("");
		lblCardImage.setBackground(Color.WHITE);
		lblCardImage.setIcon(new ImageIcon(GameHelp.class.getResource("/img/player/gun.png")));
		GridBagConstraints gbc_lblCardImage = new GridBagConstraints();
		gbc_lblCardImage.insets = new Insets(0, 0, 5, 0);
		gbc_lblCardImage.gridx = 0;
		gbc_lblCardImage.gridy = 1;
		add(lblCardImage, gbc_lblCardImage);
		
		JTextArea txtHelp = new JTextArea();
		txtHelp.setEditable(false);
		txtHelp.setText("\u8FD9\u5F20\u5361\u53EF\u4EE5\u6253\u4E00\u4E2A\u4EBA");
		GridBagConstraints gbc_txtHelp = new GridBagConstraints();
		gbc_txtHelp.insets = new Insets(0, 0, 5, 0);
		gbc_txtHelp.gridheight = 3;
		gbc_txtHelp.fill = GridBagConstraints.VERTICAL;
		gbc_txtHelp.gridx = 0;
		gbc_txtHelp.gridy = 2;
		add(txtHelp, gbc_txtHelp);
		
		for(Component comp : getComponents()){
			comp.setBackground(color);
		}


	}

}
