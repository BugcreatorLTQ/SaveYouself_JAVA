package client;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import constant.Constant;

public class StartMenu extends GridBagPanel {

	private static final long serialVersionUID = 1L;
	private JButton Start;
	private JButton Help;
	private StartHelp startHelp;

	// 设置组件
	@Override
	void setComponents() {
		// Start
		Start = new JButton("start");
		Start.setFont(Constant.FONT);
		Start.setBackground(Constant.COLOR);
		// Help
		Help = new JButton("help");
		Help.setFont(Constant.FONT);
		Help.setBackground(Constant.COLOR);
		// startHelp
		startHelp = new StartHelp();
	}

	// 设置组件布局
	@Override
	void setComponentGcs() {
		setGcs(Start, 0, 0, 1, 2);
		setGcs(Help, 0, 2, 1, 2);
		setGcs(startHelp, 0, 0, 1, 4);
	}

	// 加载开始菜单
	public StartMenu() {
		super();
		Constant.start = this;
		loadMouseClick();

	}

	public void openHelp(boolean aFlag) {
		startHelp.setVisible(aFlag);
		Start.setVisible(!aFlag);
		Help.setVisible(!aFlag);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	// 设置组件鼠标点击事件
	private void loadMouseClick() {
		// 点击start按钮
		Start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.game = true;
				Constant.client.updataWindow();
			}
		});
		// 点击help按钮
		Help.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.start.openHelp(true);
			}
		});
	}

}
