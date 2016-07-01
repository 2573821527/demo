package text;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class text2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					text2 frame = new text2();
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
	public text2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JFrame frame = new JFrame("Welcome To MLDN"); 	// ���崰��
		JTextArea text = new JTextArea(); 		// �����ı���
		text.setEditable(true); 			// �����ı�����ɱ༭
		frame.getContentPane().add(new JScrollPane(text)); // ������м����ı��򼰹�����
		JMenu menuFile = new JMenu("�ļ�");
		menuFile.setHorizontalAlignment(SwingConstants.RIGHT);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		JMenuItem newItem = new JMenuItem("�½�");	// ����JMenuItem
		JMenuItem openItem = new JMenuItem("��");	// ����JMenuItem
		JMenuItem closeItem = new JMenuItem("�ر�");	// ����JMenuItem
		JMenuItem exitItem = new JMenuItem("�˳�");	// ����JMenuItem
		newItem.setMnemonic('N') ;						// ���ÿ�ݼ�N
		openItem.setMnemonic('O') ;					// ���ÿ�ݼ�O
		closeItem.setMnemonic('C') ;					// ���ÿ�ݼ�C
		exitItem.setMnemonic('E') ;					// ���ÿ�ݼ�E
		newItem.setAccelerator(KeyStroke.getKeyStroke('N',java.awt.Event.CTRL_MASK));		// Ctrl + N
		openItem.setAccelerator(KeyStroke.getKeyStroke('O',java.awt.Event.CTRL_MASK));		// Ctrl + O
		closeItem.setAccelerator(KeyStroke.getKeyStroke('C',java.awt.Event.ALT_MASK));		// Alt + C
		exitItem.setAccelerator(KeyStroke.getKeyStroke('E',	java.awt.Event.ALT_MASK));		// Alt + E
		menuFile.add(newItem) ;					// ����˵���
		menuFile.add(openItem) ;					// ����˵���
		menuFile.add(closeItem) ;					// ����˵���
		menuFile.addSeparator() ;					// ����ָ���
		menuFile.add(exitItem) ;					// ����˵���
		menuBar.add(menuFile);					// ����JMenu
		contentPane.add(menuBar);
	}

}
