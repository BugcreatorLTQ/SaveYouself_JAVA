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
	 * �������λ��
	 * 
	 * @param gridx
	 *            ����ĺ�����
	 * @param gridy
	 *            �����������
	 * @param gridwight
	 *            ����Ŀ��
	 * @param gridhight
	 *            ����ĸ߶�
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
		// ���GridBag����
		panel.setLayout(glt);

		// ������
		panel.add(b1);

		// �������λ��
		setGcs(0, 0, 1, 2);
		glt.setConstraints(b1, gcs);

	}

}
