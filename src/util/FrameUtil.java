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
	 * 双缓冲
	 */
	// 解决图片闪烁的问题，用双缓冲方法解决闪烁问题
	Image backImg = null;

	// 重写update()方法，在窗口的里层添加一个虚拟的图片
	@Override
	public void update(Graphics g) {
		if (backImg == null) {
			// 如果虚拟图片不存在，创建一个和窗口一样大小的图片
			backImg = createImage(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		}
		// 获取到虚拟图片的画笔
		Graphics backg = backImg.getGraphics();
		Color c = backg.getColor();
		backg.setColor(Color.white);
		backg.fillRect(0, 0, Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		backg.setColor(c);
		// 调用虚拟图片的paint()方法，每50ms刷新一次
		paint(backg);
		g.drawImage(backImg, 0, 0, null);
	}

}
