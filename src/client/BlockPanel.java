package client;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import constant.Constant;

@SuppressWarnings("serial")
public class BlockPanel extends JPanel {

	private final JLabel lable;

	public BlockPanel(String info, Color color) {
		lable = new JLabel(info);
		lable.setFont(Constant.FONT);
		lable.setBackground(color);
		add(lable);
		setBackground(color);
	}

	public BlockPanel() {
		this("", Constant.COLOR);
	}
}
