package text;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Savepoint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class text4 extends JFrame {
    private String filename;
	private JPanel contentPane;
	private String filepath;
	private JTextArea ja = new JTextArea(5, 6);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					text4 frame = new text4();
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
	public text4() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 20, 434, 242);
		contentPane.add(textArea);
		setTitle("���±�");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 183, 21);
		contentPane.add(menuBar);
		
		JMenu file = new JMenu("�ļ�");
		menuBar.add(file);
		JMenu bj =new JMenu("�༭");
		menuBar.add(bj);
		JMenu gs=new JMenu("��ʽ");
		menuBar.add(gs);
		JMenu ck=new JMenu("�鿴");
		menuBar.add(ck);
		
		
		JMenuItem create = new JMenuItem("�½�");
		create.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		file.add(create);
		create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text4.this.setTitle("�ޱ���-���±�.txt");
				textArea.setText("");
			}
		});
		
		JMenuItem open = new JMenuItem("��");
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		file.add(open);
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser jfc = new JFileChooser();
				jfc.showSaveDialog(null);
				File f = jfc.getSelectedFile();			
				try {
				    
					FileReader fr=new FileReader(f);
					BufferedReader br=new BufferedReader(fr);
					String open=f.getAbsolutePath();
					String input="";
					try {
						while((input=br.readLine())!=null){
							textArea.append(input);
							
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JMenuItem save = new JMenuItem("����");
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		file.add(save);
		save.addActionListener(new ActionListener() {
           
			@Override
			public void actionPerformed(ActionEvent e){
				/* filename = text4.this.getTitle();
				// TODO Auto-generated method stub
				 System.out.println("save");
			try {
				FileWriter fw=new FileWriter(filename+".txt");
				String save= textArea.getText();
				fw.write(save);
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "�ļ��Ѿ�����ɹ�", "�ļ�����", JOptionPane.INFORMATION_MESSAGE);*/
				filename=text4.this.getTitle();
				JFileChooser jfc = new JFileChooser();
				jfc.showSaveDialog(null);
				File f = jfc.getSelectedFile();
				if( ! f.exists() ){
					try {
						f.createNewFile();
						
						FileWriter fw=new FileWriter(f);
						String save=textArea.getText();
						fw.write(save);
					    fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					int n=JOptionPane.showConfirmDialog(save, "�ļ��Ѵ����Ƿ񸲸�", "�ļ�����", JOptionPane.YES_NO_CANCEL_OPTION);
					System.out.println(n);
					if(n==0){
						FileWriter fw;
						try {
							fw = new FileWriter(f);
							String save=textArea.getText();
							fw.write(save);
						    fw.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				}
			}
		});
		
		JMenuItem saveas= new JMenuItem("���Ϊ");
		saveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		file.add(saveas);
		saveas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog fd=new FileDialog(text4.this, "���Ϊ",FileDialog.SAVE);
				fd.setFile("*.txt");
				fd.setVisible(true);
				filepath=fd.getDirectory();
				filename=fd.getFile();
				try {
					FileWriter fw=new FileWriter(filepath+filename);
					BufferedWriter bw=new BufferedWriter(fw);
					PrintWriter pw=new PrintWriter(bw);
					pw.println(textArea.getText());
					pw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JMenuItem page = new JMenuItem("ҳ������");
		file.add(page);
		
		JMenuItem print=new JMenuItem("��ӡ");
		file.add(print);
		
		JMenuItem exit=new JMenuItem("�˳�");
		file.add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});

	}
}
