package client;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

import constant.Constant;

public class StartMenu extends GridBagPanel {

	private static final long serialVersionUID = 1L;
	private JButton start;
	private JButton help;
	private JButton exit;
	private JLabel title;

	// �������
	@Override
	void setComponents() {
		// title
		title = new JLabel("Save Youself", JLabel.CENTER);
		title.setFont(Constant.FONT);
		// Start
		start = new JButton("start");
		start.setFont(Constant.FONT);
		start.setBackground(Constant.COLOR);
		// Help
		help = new JButton("help");
		help.setFont(Constant.FONT);
		help.setBackground(Constant.COLOR);
		// Exit
		exit = new JButton("exit");
		exit.setFont(Constant.FONT);
		exit.setBackground(Constant.COLOR);
	}

	// �����������
	@Override
	void setComponentGcs() {
		setGcs(new BlockPanel(), 0, 0, 1, 2);
		setGcs(title, 0, 2, 1, 2);
		setGcs(new BlockPanel(), 0, 4, 1, 3);
		setGcs(start, 0, 7, 1, 2);
		setGcs(help, 0, 9, 1, 2);
		setGcs(exit, 0, 11, 1, 2);
	}

	// ���ؿ�ʼ�˵�
	public StartMenu() {
		super();
		loadMouseClick();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	// �������������¼�
	private void loadMouseClick() {
		// ���start��ť
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.game = true;
				Constant.client.updataWindow();
			}
		});
		// ���help��ť
		help.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Constant.client.Start.openHelp(true);
			}
		});
		// ���exit��ť
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}

}
