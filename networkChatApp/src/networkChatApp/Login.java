package networkChatApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddr;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtPort;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(31, 88, 167, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(31, 63, 59, 20);
		contentPane.add(lblNewLabel);
		
		txtAddr = new JTextField();
		txtAddr.setBounds(31, 154, 167, 20);
		contentPane.add(txtAddr);
		txtAddr.setColumns(10);
		
		lblNewLabel_1 = new JLabel("IP Address:");
		lblNewLabel_1.setBounds(31, 131, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Port No.:");
		lblNewLabel_2.setBounds(31, 202, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(31, 225, 167, 20);
		contentPane.add(txtPort);
		
		JButton btnLogin = new JButton("Login");
		
		
		btnLogin.addActionListener(new ActionListener() {		// This listener listen whenever we click our Login Button
			public void actionPerformed(ActionEvent arg0) {		// Instead of making a new class and implementing ActionListener we declared an anonymous class here itself.
				System.out.println("Button Pressed");
				String name = txtName.getText();
				String addr = txtAddr.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, addr, port);
			}

			
		});
		
		
		btnLogin.setBounds(98, 302, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("Start a Conversation..");
		lblNewLabel_3.setFont(new Font("Source Code Pro Black", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setBounds(31, 24, 218, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	private void login(String name, String addr, int port) {
		dispose();		//  to close the Login Window..
		new Client(name,addr,port);
		
	}
}
