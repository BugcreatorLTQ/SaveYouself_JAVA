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
		String info = "Rule:\n" // 标题
				+ "this is rule\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test\n" // 正文
				+ "test" // 正文
		;
		return info;
	}

	// 创建帮助窗口
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
		Text.setEditable(false); // 设置只读
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
