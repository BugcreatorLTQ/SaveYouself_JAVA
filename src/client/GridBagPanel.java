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
		// ���ò���ģʽ
		setLayout(glt);
		// �������
		setComponents();
		// �������λ��
		setComponentGcs();
	}

	// �������
	abstract void setComponents();

	// �����������
	abstract void setComponentGcs();

	/**
	 * �����������
	 * 
	 * @param comp
	 *            ��ӵ����
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
