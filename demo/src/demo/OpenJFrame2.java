package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OpenJFrame2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenJFrame2 window = new OpenJFrame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OpenJFrame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(380,245);
		 //���ô˴�����ԶΪ���Ϸ� ��window�ķ���
		frame.setAlwaysOnTop(true);
		 //�������û��ı䴰�ڵĴ�С
		frame.setResizable(false);
		//�ô�������Ļ�����м���ʾ
		frame.setLocationRelativeTo(null); 
		frame.setTitle("�û�");
		frame.getContentPane().setLayout(null);
		
		
	
		frame.setVisible(true);
		JLabel label = new JLabel("��¼�ɹ�");
		label.setBounds(10, 10, 54, 15);
		frame.getContentPane().add(label);
		demo d=new demo();
		//String a=d.getClass().
		//JLabel label1 = new JLabel();
		
	}
	 public OpenJFrame2(JFrame frame){
	      frame.setVisible(false);
	      initialize();
		 }
}

