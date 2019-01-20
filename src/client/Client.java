package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import constant.Constant;

import java.awt.CardLayout;

@SuppressWarnings("serial")
public class Client extends JFrame {

	private JPanel contentPane;
	public GamePanel gamePanel;
	public StartPanel startPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		gamePanel = new GamePanel();
		startPanel = new StartPanel();
		
		contentPane.add(gamePanel);
		contentPane.add(startPanel);
		updataWindow(false);
		
		Constant.client = this;
		
		this.setSize(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setTitle("Save Youself");
	}
	
	public void updataWindow(boolean aFlag){
		gamePanel.setVisible(aFlag);
		startPanel.setVisible(!aFlag);
	}

}
