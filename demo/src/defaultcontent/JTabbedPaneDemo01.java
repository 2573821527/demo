package defaultcontent;

import java.awt.Container;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame frame=new JFrame("welcome to mldn");
       Container cont=frame.getContentPane();
       JTabbedPane tab=null;
       tab=new JTabbedPane(JTabbedPane.TOP);
       JPanel pan1=new JPanel();
       JPanel pan2=new JPanel();
       JButton but=new JButton("��ť");
       JLabel lab=new JLabel("��ǩ");
       pan1.add(but);
       pan2.add(lab);
       //String path="";
       tab.addTab("aa", new ImageIcon("images/20090112112114631.jpg"),pan1,"ͼ��");
       //tab.addTab("ͼƬѡ��", pan1);
       //tab.addTab("����ѡ��", pan2);
       tab.addTab("����ѡ��", pan2);
       cont.add(tab);
       frame.setSize(230, 120);
       frame.setVisible(true);
       frame.setLocation(300,200);
	}

}
