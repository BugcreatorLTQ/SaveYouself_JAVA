package client;


import javax.swing.JPanel;

import constant.Constant;

public class StartPanel extends GridBagPanel {

	private static final long serialVersionUID = 1L;

	protected JPanel left;
	protected StartMenu menu;
	protected JPanel right;
	private StartHelp help;
	
	// ������������������
	private void loadLeft() {
		left = new BlockPanel();
		left.setBackground(Constant.COLOR);
	}

	// �����м������������
	private void loadMid() {
		menu = new StartMenu();
	}

	/**
	 * ����/�رհ���
	 * 
	 * @param aFlag
	 *            true->�������� false->�رհ���
	 */
	public void openHelp(boolean aFlag) {
		help.setVisible(aFlag);
		left.setVisible(!aFlag);
		menu.setVisible(!aFlag);
		right.setVisible(!aFlag);
	}

	// �����Ҳ������������
	private void loadRight() {
		right = new BlockPanel();
		right.setBackground(Constant.COLOR);
	}

	private void loadHelp() {
		help = new StartHelp();
		openHelp(false);
	}

	// �������
	@Override
	void setComponents() {
		loadLeft();
		loadMid();
		loadRight();
		loadHelp();
	}

	// �����������
	@Override
	void setComponentGcs() {
		setGcs(left, 0, 0, 1, 1);
		setGcs(menu, 1, 0, 1, 1);
		setGcs(right, 2, 0, 1, 1);
		setGcs(help, 0, 0, 3, 1);
	}

}
