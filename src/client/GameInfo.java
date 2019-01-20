package client;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
public class GameInfo extends JPanel {

	private static Color color = Color.ORANGE;
	public JTextArea txtInfo;
	
	/**
	 * Create the panel.
	 */
	public GameInfo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		txtInfo = new JTextArea();
		txtInfo.setTabSize(16);
		txtInfo.setText("\u6D4B\u8BD5");
		txtInfo.setEditable(false);
		GridBagConstraints gbc_txtInfo = new GridBagConstraints();
		gbc_txtInfo.fill = GridBagConstraints.BOTH;
		gbc_txtInfo.gridwidth = 7;
		gbc_txtInfo.gridheight = 6;
		gbc_txtInfo.gridx = 0;
		gbc_txtInfo.gridy = 0;
		add(txtInfo, gbc_txtInfo);

		for(Component comp : getComponents()){
			comp.setBackground(color);
		}

	}

}
