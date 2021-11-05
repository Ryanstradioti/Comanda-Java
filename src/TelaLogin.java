import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;		
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public void TelaLogin() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setBounds(25, 93, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(82, 90, 164, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(25, 118, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(157, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);	
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 118, 164, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/9691ba098c800a1e467ae564c8856cf2.jpg")));
		lblNewLabel_2.setBounds(-11, 0, 445, 261);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
