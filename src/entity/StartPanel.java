package entity;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StartPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private GridBagLayout glt = new GridBagLayout();

	private GridBagConstraints gcs = new GridBagConstraints();

	/**
	 * 容器组件
	 */
	protected JPanel left = new JPanel();
	protected JPanel mid = new JPanel();
	protected JPanel right = new JPanel();

	// 加载左侧容器组件布局
	private void loadLeft() {
	}

	// 加载中间容器组件布局
	private void loadMid() {
		GridBagLayout gl = new GridBagLayout();
		mid.setLayout(gl);
		mid.add(new JButton("Test1"));
		mid.add(new JButton("Test2"));
		mid.add(new JButton("Test3"));
		mid.add(new JButton("Test4"));
		
		
	}

	// 加载右侧容器组件布局
	private void loadRight() {
	}

	// 创建开始菜单
	public StartPanel() {

		// 添加GridBag容器
		setLayout(glt);

		// 加载容器组件布局
		loadLeft();
		loadMid();
		loadRight();

		// 添加容器组件
		add(left);
		add(mid);
		add(right);

		// 设置容器組件位置
		setGcs(0, 0, 1, 3);
		glt.setConstraints(left, gcs);
		setGcs(1, 0, 1, 3);
		glt.setConstraints(mid, gcs);
		setGcs(2, 0, 1, 3);
		glt.setConstraints(right, gcs);

	}

	/**
	 * 设置组件位置
	 * 
	 * @param gridx
	 *            组件的横坐标
	 * @param gridy
	 *            组件的纵坐标
	 * @param gridwight
	 *            组件的宽度
	 * @param gridhight
	 *            组件的高度
	 */
	private void setGcs(int gridx, int gridy, int gridwight, int gridhight) {
		gcs.gridx = gridx;
		gcs.gridy = gridy;
		gcs.gridwidth = gridwight;
		gcs.gridheight = gridhight;
		gcs.weightx = 1;
		gcs.weighty = 1;
		gcs.fill = GridBagConstraints.BOTH;
		gcs.insets = new Insets(0, 0, 0, 0);
	}

}
