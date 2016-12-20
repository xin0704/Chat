package xin_demo_main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Chat
{
	private static JFrame jFrame;
	private static JList jListName = null;
	private static JList jListCon = null;
	private static JTextField textFieldCon;
	private static JButton btn_to_send;

	/**
	 * 在此加载图形界面
	 */
	public void init()
	{

		jFrame = new JFrame("聊天室");
		jFrame.setSize(500, 500);
		jFrame.setLocation(500, 300);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jPanel = new JPanel();
		jPanel.setSize(500, 500);
		jPanel.setLocation(500, 300);
		jPanel.setLayout(null);

		jFrame.add(jPanel);

		jListName = new JList<>();
		jListName.setSize(100, 480);
		jListName.setLocation(400, 10);

		jPanel.add(jListName);

		textFieldCon = new JTextField();
		textFieldCon.setSize(380, 50);
		textFieldCon.setLocation(10, 370);
		jPanel.add(textFieldCon);

		btn_to_send = new JButton("发送");
		btn_to_send.setSize(60, 30);
		btn_to_send.setLocation(330, 430);
		jPanel.add(btn_to_send);

		jListCon = new JList<>();
		jListCon.setSize(380, 350);
		jListCon.setLocation(10, 10);
		jPanel.add(jListCon);

		jFrame.setVisible(true);
	}
}
