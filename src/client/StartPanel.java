package client;


import javax.swing.JPanel;

import constant.Constant;

public class StartPanel extends GridBagPanel {

	private static final long serialVersionUID = 1L;

	protected JPanel left;
	protected StartMenu menu;
	protected JPanel right;
	private StartHelp help;
	
	// 加载左侧容器组件布局
	private void loadLeft() {
		left = new BlockPanel();
		left.setBackground(Constant.COLOR);
	}

	// 加载中间容器组件布局
	private void loadMid() {
		menu = new StartMenu();
	}

	/**
	 * 开启/关闭帮助
	 * 
	 * @param aFlag
	 *            true->开启帮助 false->关闭帮助
	 */
	public void openHelp(boolean aFlag) {
		help.setVisible(aFlag);
		left.setVisible(!aFlag);
		menu.setVisible(!aFlag);
		right.setVisible(!aFlag);
	}

	// 加载右侧容器组件布局
	private void loadRight() {
		right = new BlockPanel();
		right.setBackground(Constant.COLOR);
	}

	private void loadHelp() {
		help = new StartHelp();
		openHelp(false);
	}

	// 设置组件
	@Override
	void setComponents() {
		loadLeft();
		loadMid();
		loadRight();
		loadHelp();
	}

	// 设置组件布局
	@Override
	void setComponentGcs() {
		setGcs(left, 0, 0, 1, 1);
		setGcs(menu, 1, 0, 1, 1);
		setGcs(right, 2, 0, 1, 1);
		setGcs(help, 0, 0, 3, 1);
	}

}
