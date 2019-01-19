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
	 * �������
	 */
	protected JPanel left = new JPanel();
	protected JPanel mid = new JPanel();
	protected JPanel right = new JPanel();

	// ������������������
	private void loadLeft() {
	}

	// �����м������������
	private void loadMid() {
		GridBagLayout gl = new GridBagLayout();
		mid.setLayout(gl);
		mid.add(new JButton("Test1"));
		mid.add(new JButton("Test2"));
		mid.add(new JButton("Test3"));
		mid.add(new JButton("Test4"));
		
		
	}

	// �����Ҳ������������
	private void loadRight() {
	}

	// ������ʼ�˵�
	public StartPanel() {

		// ���GridBag����
		setLayout(glt);

		// ���������������
		loadLeft();
		loadMid();
		loadRight();

		// ����������
		add(left);
		add(mid);
		add(right);

		// ���������M��λ��
		setGcs(0, 0, 1, 3);
		glt.setConstraints(left, gcs);
		setGcs(1, 0, 1, 3);
		glt.setConstraints(mid, gcs);
		setGcs(2, 0, 1, 3);
		glt.setConstraints(right, gcs);

	}

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
		gcs.insets = new Insets(0, 0, 0, 0);
	}

}
