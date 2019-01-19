package client;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public abstract class GridBagPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	protected GridBagLayout glt = new GridBagLayout();

	protected GridBagConstraints gcs = new GridBagConstraints();

	public GridBagPanel() {
		// 设置布局模式
		setLayout(glt);
		// 设置组件
		setComponents();
		// 设置组件位置
		setComponentGcs();
	}

	// 设置组件
	abstract void setComponents();

	// 设置组件布局
	abstract void setComponentGcs();

	/**
	 * 设置组件布局
	 * 
	 * @param comp
	 *            添加的组件
	 * @param gridx
	 * @param gridy
	 * @param gridwight
	 * @param gridhight
	 */
	protected void setGcs(Component comp, int gridx, int gridy, int gridwight, int gridhight) {
		gcs.gridx = gridx;
		gcs.gridy = gridy;
		gcs.gridwidth = gridwight;
		gcs.gridheight = gridhight;
		gcs.weightx = 1;
		gcs.weighty = 1;
		gcs.fill = GridBagConstraints.BOTH;
		gcs.insets = new Insets(0, 0, 0, 0);
		this.add(comp);
		glt.setConstraints(comp, gcs);
	}
}
