import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaAcoes {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAcoes window = new TelaAcoes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public TelaAcoes() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Do Cliente");
		lblNewLabel.setBounds(10, 31, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(117, 28, 173, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N* da Mesa");
		lblNewLabel_1.setBounds(10, 62, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 59, 36, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(177, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(117, 90, 152, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Pedidos");
		lblNewLabel_2.setBounds(10, 94, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Cadastrar Produto");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Excluir Produto");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Alterar");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Opcoes");
		menuBar.add(mnNewMenu_4);
		
		
		JMenu mnNewMenu_5 = new JMenu(new JanelaSair());
		mnNewMenu_5.setText("Sair");
		mnNewMenu_4.add(mnNewMenu_5);
		;
	
	}
}
