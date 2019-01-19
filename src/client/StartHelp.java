package client;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import constant.Constant;

public class StartHelp extends GridBagPanel {

	private static final long serialVersionUID = 1L;

	private JScrollPane jsPane;

	private JTextArea Text;

	private JButton Back;

	private String helpInfo() {
		String info = "Rule:\n" // ����
				+ "this is rule\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test\n" // ����
				+ "test" // ����
		;
		return info;
	}

	// ������������
	public StartHelp() {
		super();
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.Start.openHelp(false);
			}
		});
	}

	@Override
	void setComponents() {
		// Text
		Text = new JTextArea();
		Text.setText(helpInfo());
		Text.setFont(Constant.FONT);
		Text.setEditable(false); // ����ֻ��
		// SPane
		jsPane = new JScrollPane(Text);
		// Back
		Back = new JButton("BACK");
		Back.setFont(Constant.FONT);
		Back.setBackground(Constant.COLOR);
	}

	@Override
	void setComponentGcs() {
		setGcs(jsPane, 0, 0, 4, 5);
		setGcs(Back, 4, 0, 1, 5);
	}
}
