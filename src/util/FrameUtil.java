package util;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import constant.Constant;

public class FrameUtil extends JFrame {

	private static final long serialVersionUID = 1L;

	protected JPanel basePanel = new JPanel();

	void loadPanel() {

		this.basePanel.setLayout(new CardLayout());
		add(basePanel);

	}

	void loadFrame() {
		// set title
		this.setTitle("SaveYouself");
		// set size
		this.setSize(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		// set location
		this.setLocationRelativeTo(null);
		// set visible
		this.setVisible(true);
		// set Resize able
		this.setResizable(false);
		// set default close
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public FrameUtil() {
		// load Frame
		loadFrame();
		// set repaint thread
		new FlushThread().start();
		// load Panel
		loadPanel();
	}

	class FlushThread extends Thread {
		@Override
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	/**
	 * ˫����
	 */
	// ���ͼƬ��˸�����⣬��˫���巽�������˸����
	Image backImg = null;

	// ��дupdate()�������ڴ��ڵ�������һ�������ͼƬ
	@Override
	public void update(Graphics g) {
		if (backImg == null) {
			// �������ͼƬ�����ڣ�����һ���ʹ���һ����С��ͼƬ
			backImg = createImage(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		}
		// ��ȡ������ͼƬ�Ļ���
		Graphics backg = backImg.getGraphics();
		Color c = backg.getColor();
		backg.setColor(Color.white);
		backg.fillRect(0, 0, Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		backg.setColor(c);
		// ��������ͼƬ��paint()������ÿ50msˢ��һ��
		paint(backg);
		g.drawImage(backImg, 0, 0, null);
	}

}
