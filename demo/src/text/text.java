package text;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class text {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					text window = new text();
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
	public text() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8BB0\u4E8B\u672C");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cont=frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(textArea);
		frame.getContentPane().add(new JScrollPane(textArea));
		JMenu menufile=new JMenu("�ļ�");
		JMenuBar menubar=new JMenuBar();
		
//		frame.addWindowListener(new WindowAdapter(){
//			public void windowClosing(WindowEvent arg0){
//				System.exit(1);
//			}
//		});
		
		JMenuItem newItem = new JMenuItem("�½�");	// ����JMenuItem
		JMenuItem openItem = new JMenuItem("��");
		JMenuItem closeItem = new JMenuItem("�ر�");
		JMenuItem exitItem = new JMenuItem("�˳�");
		newItem.setMnemonic('N') ;						// ���ÿ�ݼ�N
		openItem.setMnemonic('O') ;					// ���ÿ�ݼ�O
		closeItem.setMnemonic('C') ;					// ���ÿ�ݼ�C
		exitItem.setMnemonic('E') ;					// ���ÿ�ݼ�E
		newItem.setAccelerator(KeyStroke.getKeyStroke('N',java.awt.Event.CTRL_MASK));		// Ctrl + N
		openItem.setAccelerator(KeyStroke.getKeyStroke('O',java.awt.Event.CTRL_MASK));		// Ctrl + O
		closeItem.setAccelerator(KeyStroke.getKeyStroke('C',java.awt.Event.ALT_MASK));		// Alt + C
		exitItem.setAccelerator(KeyStroke.getKeyStroke('E',	java.awt.Event.ALT_MASK));		// Alt + E
		menufile.add(newItem) ;					// ����˵���
		menufile.add(openItem) ;					// ����˵���
		menufile.add(closeItem) ;					// ����˵���
		menufile.addSeparator() ;					// ����ָ���
		menufile.add(exitItem) ;                    // ����˵���
		menubar.add(menufile);                      // ����˵���
		menubar.add(exitItem); 
		menubar.add(closeItem);
		menubar.add(openItem);
		menubar.add(newItem);
		frame.setJMenuBar(menubar);
	}
}
