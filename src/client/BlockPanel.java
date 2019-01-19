package client;

import javax.swing.JLabel;
import javax.swing.JPanel;

import constant.Constant;

public class BlockPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final JLabel lable;
	
	public BlockPanel() {
		lable = new JLabel("");
		lable.setFont(Constant.FONT);
		lable.setBackground(Constant.COLOR);
		setBackground(Constant.COLOR);
	}

}
