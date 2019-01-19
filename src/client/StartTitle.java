package client;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import constant.Constant;

public class StartTitle extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel title = new JLabel("Save Youself", JLabel.CENTER);

	public StartTitle() {
		this.setBackground(Constant.COLOR);
		
		setLayout(new GridLayout(3, 1));
		
		add(new BlockPanel());
		
		add(title);
		title.setFont(Constant.FONT);
		
		add(new BlockPanel());
	}
}
