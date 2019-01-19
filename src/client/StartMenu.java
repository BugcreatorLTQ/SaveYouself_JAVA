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

	// �������
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

	// �����������
	@Override
	void setComponentGcs() {
		setGcs(Start, 0, 0, 1, 2);
		setGcs(Help, 0, 2, 1, 2);
		setGcs(startHelp, 0, 0, 1, 4);
	}

	// ���ؿ�ʼ�˵�
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

	// �������������¼�
	private void loadMouseClick() {
		// ���start��ť
		Start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.game = true;
				Constant.client.updataWindow();
			}
		});
		// ���help��ť
		Help.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.start.openHelp(true);
			}
		});
	}

}
