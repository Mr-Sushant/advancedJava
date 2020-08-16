package networkChatApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// We removed the Main becoz we dont want it to start automatically...
	
	private String name,addr;
	int port;
	
	public Client(String name, String addr, int port) {
		setTitle("Network Chat - Client");
		
		this.name = name;
		this.addr = addr;
		this.port = port;
		createWindow();
	}
	
	public void createWindow(){
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(880,550);
		setLocationRelativeTo(null);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{16,857,7}; // Sum should be equal to 880
		gbl_contentPane.rowHeights = new int[]{35, 475, 40}; // Sum should be equal to 550
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JTextArea history = new JTextArea();
		GridBagConstraints gbc_history = new GridBagConstraints();
		gbc_history.insets = new Insets(0, 0, 5, 5);
		gbc_history.fill = GridBagConstraints.BOTH;
		gbc_history.gridx = 1;
		gbc_history.gridy = 1;
		contentPane.add(history, gbc_history);
		
		JButton send = new JButton("Send");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_send = new GridBagConstraints();
		gbc_send.insets = new Insets(0, 0, 0, 5);
		gbc_send.gridx = 1;
		gbc_send.gridy = 2;
		contentPane.add(send, gbc_send);
		
		
		setVisible(true);
	}

}
