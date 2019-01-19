package entity;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StartPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel panel = new JPanel();

	private GridBagLayout glt = new GridBagLayout();

	private GridBagConstraints gcs = new GridBagConstraints();

	protected JButton b1 = new JButton("Test");

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
		gcs.insets = new Insets(5, 5, 5, 5);
	}

	public StartPanel() {
		// 添加GridBag容器
		panel.setLayout(glt);

		// 添加组件
		panel.add(b1);

		// 设置组件位置
		setGcs(0, 0, 1, 2);
		glt.setConstraints(b1, gcs);

	}

}
