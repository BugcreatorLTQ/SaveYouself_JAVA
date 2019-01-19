package client;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import constant.Constant;

public class StartHelp extends GridBagPanel {

	private static final long serialVersionUID = 1L;

	private JTextArea Text;

	private JLabel Back;

	private String helpInfo() {
		String info = "Rule:\n" // 标题
				+ "this is rule"// 正文
		;
		return info;
	}

	// 创建帮助窗口
	public StartHelp() {
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.start.openHelp(false);
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
		// Back
		Back = new JLabel("BACK");
		Back.setFont(Constant.FONT);
		;
	}

	@Override
	void setComponentGcs() {
		setGcs(Text, 0, 0, 1, 3);
		setGcs(Back, 0, 3, 1, 1);
	}
}
