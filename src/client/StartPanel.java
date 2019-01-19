package client;

import java.awt.GridLayout;

import javax.swing.JPanel;

import constant.Constant;

public class StartPanel extends GridBagPanel {

	private static final long serialVersionUID = 1L;

	protected JPanel left;
	protected JPanel mid;
	protected JPanel right;

	// 加载左侧容器组件布局
	private void loadLeft() {
		left = new JPanel();
		left.setBackground(Constant.COLOR);
	}

	// 加载中间容器组件布局
	private void loadMid() {
		mid = new JPanel(new GridLayout(2, 1));
		mid.add(new StartTitle());
		mid.add(new StartMenu());
	}

	// 加载右侧容器组件布局
	private void loadRight() {
		right = new JPanel();
		right.setBackground(Constant.COLOR);
	}

	// 设置组件
	@Override
	void setComponents() {
		loadLeft();
		loadMid();
		loadRight();
	}

	// 设置组件布局
	@Override
	void setComponentGcs() {
		setGcs(left, 0, 0, 1, 3);
		setGcs(mid, 1, 0, 1, 3);
		setGcs(right, 2, 0, 1, 3);
	}

}
