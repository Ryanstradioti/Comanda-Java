import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Janela extends JFrame{
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("corinthians-1.jpg"));
	JLabel label = new JLabel(imagem);
	
	public Janela() {
		add(label);
		setTitle("Controle De Vendas");
		setSize(600,300);
		setLocation(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenuBar menu = new JMenuBar();
		JMenu menuArquivo = new JMenu("Arquivo");
		JMenu menuEditar = new JMenu("Editar");
		
		JMenuItem itemNovo = new JMenuItem("Novo Produto");
		
		JMenuItem itemExcluir = new JMenuItem("Excluir Produto");
				
		JMenuItem itemEditar = new JMenuItem("Editar Produto");
		
		JMenuItem itemSair = new JMenuItem(new JanelaSair());
		itemSair.setText("Sair");
		
		menuEditar.add(itemNovo);
		menuEditar.add(itemEditar);
		menuEditar.add(itemExcluir);
		
		menuArquivo.add(itemSair);
		
		menu.add(menuEditar);
		menu.add(menuArquivo);
		

		setJMenuBar(menu);		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		
		new Janela();
		

	}

}
