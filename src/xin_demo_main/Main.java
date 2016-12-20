package xin_demo_main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

import xin_demo_constant.Code;
import xin_demo_imp.LoginImp;
import xin_demo_impl.LoginImpl;

public class Main
{

	private static LoginImp login = new LoginImpl();
	private static JFrame jFrame;
	private static JTextField textFieldName;
	private static JPasswordField textFieldPwd;
	private static JButton btn_to_login;
	private static JButton btn_to_register;
	
	private static JDialog jDialog;

	/**
	 * 在此加载图形界面
	 */
	public void init()
	{

		jFrame = new JFrame("登录");
		jFrame.setSize(400, 300);
		jFrame.setLocation(500, 300);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jPanel = new JPanel();
		jPanel.setSize(400, 300);
		jPanel.setLocation(500, 300);
		jPanel.setLayout(null);

		jFrame.add(jPanel);
		
		
		JLabel jLabelName = new JLabel("用户名：");
		jLabelName.setSize(60, 40);
		jLabelName.setLocation(50, 30);
		jPanel.add(jLabelName);
		
		textFieldName = new JTextField();
		textFieldName.setSize(200, 40);
		textFieldName.setLocation(120, 30);
		jPanel.add(textFieldName);
		
		
		
		JLabel jLabelPwd = new JLabel("密     码：");
		jLabelPwd.setSize(60, 40);
		jLabelPwd.setLocation(50, 90);
		jPanel.add(jLabelPwd);
	
		textFieldPwd = new JPasswordField();
		textFieldPwd.setSize(200, 40);
		textFieldPwd.setLocation(120, 90);
		jPanel.add(textFieldPwd);
		
		btn_to_login = new JButton("login");
		btn_to_login.setSize(80, 30);
		btn_to_login.setLocation(120, 180);
		jPanel.add(btn_to_login);
		
		
		btn_to_register = new JButton("register");
		btn_to_register.setSize(80, 30);
		btn_to_register.setLocation(240, 180);
		jPanel.add(btn_to_register);
		
		

		jFrame.setVisible(true);
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.init();

		btn_to_login.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{

				String name = textFieldName.getText().toString().trim();
				String pwd = textFieldPwd.getText().toString().trim();

				int result_code = login.login(name, pwd);
				
				if (result_code == Code.LOGIN_SUCCESS_CODE)
				{
					
					jFrame.dispose();
					
					//进入聊天面板页面
					Chat chat = new Chat();
					chat.init();
					
					
				}else {
					
					JOptionPane.showMessageDialog(jFrame, "用户名或密码错误", "提示",JOptionPane.WARNING_MESSAGE); 
											
				}

			}
		});

	}

}
