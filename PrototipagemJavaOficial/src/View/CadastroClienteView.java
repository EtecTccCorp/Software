package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JSeparator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import CEP.WebServiceCep;
import Controller.ClienteController;
import Controller.ProdutoController;
import VO.ClienteVO;
import VO.ProdutoVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JToggleButton;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;

public class CadastroClienteView extends JInternalFrame {

	public JFrame frmCadastroDeCliente;
	public static JTextField txtCodigo;
	public static JTextField txtNome;
	public static JTextField txtRua;
	public static JTextField txtCep;
	public static JComboBox comboBox;
	public  JComboBox comboBox2;
	private JTextField txtPesquisa;
	public static String codigo;
	public static String nome;
	public static String fixo;
	public static String nextel;
	public static String celular;
	public static String cnpj;
	public static String cpf;
	public static String frmPag;
	public static String rua;
	public static String bairro;
	public static String num;
	public static String cep;
	public static String cidade;
	private MaskFormatter ftmTelefone;
	private MaskFormatter ftmCelular;
	private MaskFormatter ftmNextel;
	private MaskFormatter ftmCnpj;
	private MaskFormatter ftmCpf;
	private MaskFormatter ftmCep;
	public static JTextField txtFixo;
	public static JTextField txtNextel;
	public static JTextField txtCelular;
	public static JTextField txtCnpj;
	public static JTextField txtCpf;
	public static JTextField txtBairro;
	public static JTextField txtNumero;
	public static JTextField txtCidade;
	private static JTable table;
	public static JTextField txtrua;
	public static JTextField txtemail;
	public static JTextField txtcomplemento;
	public static JLabel lblId;
	public static JLabel lblNome;
	public static JLabel lblTelResidencial;
	public static JLabel lblCpfopcional;
	public static JLabel lblCnpj;
	public static JLabel lblTelCelular;
	public static JLabel lblTelComercial;
	public static JLabel lblCep;
	public static JLabel lblBairro;
	public static JLabel lblNmero;
	public static JLabel lblRua;
	public static JLabel lblCidade; 
	public static JLabel lblCadastroCliente;
	public static JLabel lblPesquisarPorCdigo;
	public static JLabel lblComplemento;
	public static JLabel lblEmail;
	public static JLabel lblFormaDePagamento;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClienteView window = new CadastroClienteView();
					window.setVisible(true);

					pesquisarClienteTodos();
					window.setLocation(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroClienteView() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmCadastroDeCliente = new JFrame();
		frmCadastroDeCliente.setResizable(false);
		frmCadastroDeCliente.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 12));
		frmCadastroDeCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		frmCadastroDeCliente.setTitle("Cadastro de Cliente");
		frmCadastroDeCliente.setBounds(100, 100, 953, 805);
		frmCadastroDeCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		

		Panel Painel = new Panel();
		Painel.setBounds(0, 0, 272, 777);
		Painel.setBackground(new Color(17, 144, 147));

		JLabel lblVarejoSantos = new JLabel("Varej\u00E3o Santos");
		lblVarejoSantos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVarejoSantos.setBounds(10, 45, 199, 32);
		lblVarejoSantos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		lblVarejoSantos.setIcon(
				new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		lblVarejoSantos.setForeground(new Color(240, 248, 255));
		lblVarejoSantos.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 199, 2);

		JButton btnNewButton_3 = new JButton("Cadastro de Clientes");
		btnNewButton_3 .setMnemonic(KeyEvent.VK_1);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setBounds(0, 131, 270, 48);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteView windowCliente = new CadastroClienteView();
				windowCliente.frmCadastroDeCliente.setVisible(true);
				windowCliente.frmCadastroDeCliente.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setIcon(
				new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(17, 144, 147));
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JButton btnCadastroDeFornecedores = new JButton("Cadastro de Fornecedores");
		btnCadastroDeFornecedores.setMnemonic(KeyEvent.VK_2);
		btnCadastroDeFornecedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastroDeFornecedores.setBounds(0, 191, 270, 48);
		btnCadastroDeFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				CadastroFornecedorView cadastroFornecedorView = new CadastroFornecedorView();
				cadastroFornecedorView.frame.setVisible(true);
				cadastroFornecedorView.frame.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();
			}
		});
		btnCadastroDeFornecedores
				.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		btnCadastroDeFornecedores.setOpaque(true);
		btnCadastroDeFornecedores.setForeground(Color.WHITE);
		btnCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeFornecedores.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeFornecedores.setBackground(new Color(17, 144, 147));

		JButton btnCadastroDeProdutos = new JButton("Cadastro de Produtos");
		btnCadastroDeProdutos.setMnemonic(KeyEvent.VK_3);
		btnCadastroDeProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastroDeProdutos.setBounds(0, 251, 270, 48);
		btnCadastroDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				produto.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnCadastroDeProdutos
				.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-produto-25.png")));
		btnCadastroDeProdutos.setOpaque(true);
		btnCadastroDeProdutos.setForeground(Color.WHITE);
		btnCadastroDeProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnCadastroDeProdutos.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnCadastroDeProdutos.setBackground(new Color(17, 144, 147));

		JButton btnVendas = new JButton("Vendas");
		btnVendas.setMnemonic(KeyEvent.VK_4);
		btnVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVendas.setBounds(0, 311, 270, 48);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				vendas.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnVendas.setIcon(
				new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		btnVendas.setOpaque(true);
		btnVendas.setForeground(Color.WHITE);
		btnVendas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnVendas.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnVendas.setBackground(new Color(17, 144, 147));

		JButton btnEstoque = new JButton("Estoque");
		btnEstoque .setMnemonic(KeyEvent.VK_5);
		btnEstoque.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEstoque.setBounds(0, 371, 270, 48);
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				estoque.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();

			}
		});
		btnEstoque.setIcon(
				new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		btnEstoque.setOpaque(true);
		btnEstoque.setForeground(Color.WHITE);
		btnEstoque.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnEstoque.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		btnEstoque.setBackground(new Color(17, 144, 147));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 490, 270, 2);

		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setBounds(24, 523, 79, 16);
		lblAdministrador.setForeground(new Color(255, 255, 255));
		lblAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 12));

		lblId = new JLabel("C\u00D3DIGO:");
		lblId.setBounds(314, 74, 50, 14);
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		

		txtCodigo = new JTextField();
		txtCodigo.setBounds(314, 99, 89, 30);
		txtCodigo.setColumns(10);

		lblNome = new JLabel("NOME:");
		lblNome.setBounds(425, 74, 38, 14);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));

		txtNome = new JTextField();
		txtNome.setBounds(425, 99, 249, 30);
		txtNome.setColumns(10);

		lblTelResidencial = new JLabel("TEL. FIXO:");
		lblTelResidencial.setBounds(314, 165, 161, 14);
		lblTelResidencial.setFont(new Font("Arial", Font.BOLD, 12));

		lblTelComercial = new JLabel("TEL. NEXTEL:");
		lblTelComercial.setBounds(530, 164, 144, 15);
		lblTelComercial.setFont(new Font("Segoe UI", Font.BOLD, 12));

		lblTelCelular = new JLabel("TEL. CELULAR:");
		lblTelCelular.setBounds(739, 164, 136, 15);
		lblTelCelular.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(314, 455, 621, 250);
		panel_3.setAlignmentX(10.0f);
		panel_3.setBorder(new TitledBorder(null, "Clientes Cadastrados", TitledBorder.LEFT, TitledBorder.TOP, null,
				new Color(0, 0, 0)));

		lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(314, 244, 161, 14);
		lblCnpj.setFont(new Font("Segoe UI", Font.BOLD, 12));

		
		
		lblCpfopcional = new JLabel("CPF:");
		lblCpfopcional.setBounds(540, 244, 82, 14);
		lblCpfopcional.setFont(new Font("Segoe UI", Font.BOLD, 12));

		comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(739, 276, 142, 30);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "BOLETO", "DINHEIRO", "CART\u00C3O", "CHEQUE"}));

		lblFormaDePagamento = new JLabel("FORMA DE PAGAMENTO:");
		lblFormaDePagamento.setBounds(739, 244, 152, 14);
		lblFormaDePagamento.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-alterar-25.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					alterarCliente();
					pesquisarClienteTodos();
					limpar();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBounds(508, 716, 107, 37);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-excluir-25.png")));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBounds(808, 716, 99, 37);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Warning",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
					// Saving code here
					try {
						excluirCliente();
						pesquisarClienteTodos();
						limpar();
					} catch (Exception e) {

						// JOptionPane.showMessageDialog(frmCadastroDeCliente,
						// e.getMessage());
						e.printStackTrace();

					}
				} else if (dialogButton == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(frmCadastroDeCliente, "Cliente não excluido");

				}

			}
		});

		lblRua = new JLabel("RUA:");
		lblRua.setBounds(452, 318, 161, 14);
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));

		lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(314, 394, 99, 14);
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));

		lblNmero = new JLabel("N\u00DAMERO:");
		lblNmero.setBounds(761, 325, 55, 14);
		lblNmero.setFont(new Font("Segoe UI", Font.BOLD, 12));

		lblCep = new JLabel("CEP");
		lblCep.setBounds(314, 325, 161, 14);
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		
		
		txtCep = new JTextField();
		try {
			ftmCep = new MaskFormatter("#####-###");
			txtCep = new JFormattedTextField(ftmCep);
			txtCep.setBounds(755, 192, 117, 29);
		} catch (ParseException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}

		txtCep.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String cp = txtCep.getText();
				cp = cp.replaceAll("\\D*", "");
				int cont = cp.length();

				if (cont == 8) {
					try {
						PesquisarPorCep();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			}

		});
		txtCep.setBounds(314, 344, 122, 30);

		lblCidade = new JLabel("CIDADE");
		lblCidade.setBounds(452, 394, 57, 14);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));

		lblCadastroCliente = new JLabel("CADASTRO CLIENTE");
		lblCadastroCliente.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-filled-25.png")));
		//lblCadastroCliente.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-filled-25.png")));
		lblCadastroCliente.setBounds(487, 22, 242, 30);
		lblCadastroCliente.setFont(new Font("Segoe UI", Font.BOLD, 22));

		lblPesquisarPorCdigo = new JLabel("Pesquisar");
		lblPesquisarPorCdigo.setBounds(16, 30, 62, 16);
		lblPesquisarPorCdigo.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		txtPesquisa = new JTextField();
		txtPesquisa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				try {
					Pattern patternString = Pattern.compile("[A-Z]");
					Pattern patternNumeros = Pattern.compile("[0-9]");

					if (patternNumeros.matcher(txtPesquisa.getText()).find()) {

						addDadosTable(pesquisaPorCodigo(Integer.parseInt(txtPesquisa.getText())));

					} else /*
							 * if
							 * (patternString.matcher(textPesquisar.getText()).
							 * find())
							 */ {

						pesquisarPorNome(txtPesquisa.getText());

					}
				//	pesquisarPorNome(nome);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		txtPesquisa.setBounds(88, 24, 174, 28);
		txtPesquisa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtPesquisa.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-salvar-25 (2).png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(314, 716, 117, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cadastraCliente();
					pesquisarClienteTodos();
					limpar();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(488, 50, 207, 2);

		try {
			ftmTelefone = new MaskFormatter("(##)####-####");
			txtFixo = new JFormattedTextField(ftmTelefone);
			txtFixo.setBounds(314, 191, 117, 30);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		//try {
			//ftmNextel = new MaskFormatter("(####)####-####");
			txtNextel = new JFormattedTextField(ftmNextel);
			txtNextel.setBounds(530, 191, 117, 30);
		//} catch (ParseException e3) {
			// TODO Auto-generated catch block
		//	e3.printStackTrace();
	//	}

		try {

			ftmCelular = new MaskFormatter("(##)####-#####");
			txtCelular = new JFormattedTextField(ftmCelular);
			txtCelular.setBounds(739, 192, 136, 29);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		txtCnpj = new JTextField();

		try {
			ftmCnpj = new MaskFormatter("##.###.###/####-##");
			txtCnpj = new JFormattedTextField(ftmCnpj);

		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		txtCnpj.setBounds(314, 276, 149, 30);

		txtCpf = new JTextField();
		try {
			ftmCpf = new MaskFormatter("###.###.###-##");
			txtCpf = new JFormattedTextField(ftmCpf);
		} catch (ParseException e2) {
			
			e2.printStackTrace();
		}
			txtCpf.setBounds(530, 277, 117, 29);
		

		txtBairro = new JTextField();
		txtBairro.setBounds(314, 414, 117, 29);

		txtNumero = new JTextField();
		txtNumero.setBounds(761, 345, 64, 29);
		frmCadastroDeCliente.getContentPane().setLayout(null);
		frmCadastroDeCliente.getContentPane().add(Painel);
		Painel.setLayout(null);
		Painel.add(separator_1);
		Painel.add(btnNewButton_3);
		Painel.add(btnEstoque);
		Painel.add(btnCadastroDeFornecedores);
		Painel.add(btnCadastroDeProdutos);
		Painel.add(btnVendas);
		Painel.add(separator);
		Painel.add(lblVarejoSantos);
		Painel.add(lblAdministrador);

		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.setMnemonic(KeyEvent.VK_6);
		btnRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
				relatorios.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frmCadastroDeCliente);

				((Window) comp).dispose();
			}
		});
		btnRelatorios.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-pdf-25.png")));
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		btnRelatorios.setBounds(0, 431, 268, 48);
		Painel.add(btnRelatorios);
		frmCadastroDeCliente.getContentPane().add(separator_2);
		frmCadastroDeCliente.getContentPane().add(lblCadastroCliente);
		frmCadastroDeCliente.getContentPane().add(lblId);
		frmCadastroDeCliente.getContentPane().add(lblNome);
		frmCadastroDeCliente.getContentPane().add(txtCodigo);
		frmCadastroDeCliente.getContentPane().add(txtNome);
		frmCadastroDeCliente.getContentPane().add(lblTelResidencial);
		frmCadastroDeCliente.getContentPane().add(lblTelComercial);
		frmCadastroDeCliente.getContentPane().add(lblTelCelular);
		frmCadastroDeCliente.getContentPane().add(txtFixo);
		frmCadastroDeCliente.getContentPane().add(txtNextel);
		frmCadastroDeCliente.getContentPane().add(txtCelular);
		frmCadastroDeCliente.getContentPane().add(lblCnpj);
		frmCadastroDeCliente.getContentPane().add(lblCpfopcional);
		frmCadastroDeCliente.getContentPane().add(lblFormaDePagamento);
		frmCadastroDeCliente.getContentPane().add(txtCnpj);
		frmCadastroDeCliente.getContentPane().add(txtCpf);
		frmCadastroDeCliente.getContentPane().add(comboBox);
		frmCadastroDeCliente.getContentPane().add(lblRua);
		frmCadastroDeCliente.getContentPane().add(lblBairro);
		frmCadastroDeCliente.getContentPane().add(lblNmero);
		frmCadastroDeCliente.getContentPane().add(txtBairro);
		frmCadastroDeCliente.getContentPane().add(txtNumero);
		frmCadastroDeCliente.getContentPane().add(lblCep);
		frmCadastroDeCliente.getContentPane().add(lblCidade);
		frmCadastroDeCliente.getContentPane().add(txtCep);
		frmCadastroDeCliente.getContentPane().add(btnNewButton);
		frmCadastroDeCliente.getContentPane().add(btnNewButton_1);
		frmCadastroDeCliente.getContentPane().add(btnNewButton_2);
		frmCadastroDeCliente.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(lblPesquisarPorCdigo);
		panel_3.add(txtPesquisa);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 58, 571, 174);
		panel_3.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Codigo", "Nome", "CNPJ", "CPF", "Pagamento" }));

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar
				.setIcon(new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
		btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					pesquisarClienteTodos();
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Erro Interno: " + e.getMessage(), "Atenção",
							JOptionPane.ERROR_MESSAGE);

				}

			}
		});
		btnAtualizar.setBounds(486, 24, 111, 28);
		panel_3.add(btnAtualizar);

		JButton btnPreencherCampos = new JButton("Preencher Campos");
		btnPreencherCampos.setIcon(
				new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-cor-de-preenchimento-25.png")));
		btnPreencherCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					preencherCampos();
				} catch (Exception e1) {

					e1.printStackTrace();
				}

			}

		});
		btnPreencherCampos.setBounds(299, 24, 165, 28);
		panel_3.add(btnPreencherCampos);

		txtCidade = new JTextField();
		txtCidade.setBounds(452, 414, 120, 28);
		frmCadastroDeCliente.getContentPane().add(txtCidade);
		txtCidade.setColumns(10);

		txtrua = new JTextField();
		txtrua.setBounds(452, 347, 290, 28);
		frmCadastroDeCliente.getContentPane().add(txtrua);
		txtrua.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setIcon(
				new ImageIcon(CadastroClienteView.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnLimpar.setBounds(656, 716, 107, 37);
		frmCadastroDeCliente.getContentPane().add(btnLimpar);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(314, 191, 89, 28);
		frmCadastroDeCliente.getContentPane().add(formattedTextField);
		
		lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(739, 73, 55, 16);
		frmCadastroDeCliente.getContentPane().add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBounds(739, 100, 168, 28);
		frmCadastroDeCliente.getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		txtcomplemento = new JTextField();
		txtcomplemento.setBounds(584, 414, 158, 28);
		frmCadastroDeCliente.getContentPane().add(txtcomplemento);
		txtcomplemento.setColumns(10);
		
		lblComplemento = new JLabel("COMPLEMENTO");
		lblComplemento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplemento.setBounds(584, 393, 111, 16);
		frmCadastroDeCliente.getContentPane().add(lblComplemento);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA",
				"PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		comboBox2.setBounds(761, 415, 64, 26);
		frmCadastroDeCliente.getContentPane().add(comboBox2);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblUf.setBounds(761, 393, 55, 16);
		frmCadastroDeCliente.getContentPane().add(lblUf);

		
	}


	public JTable getTable() {

		return table;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	private void cadastraCliente() throws Exception {
		ClienteVO cVO = new ClienteVO();
		ClienteController cController = new ClienteController();

		cVO = getDados();
		//limpar();

		cController.cadastroDeCliente(cVO);

	}

	private ClienteVO getDados() {

		ClienteVO clienteVO = new ClienteVO();

		String pagamento = comboBox.getSelectedItem().toString();
		if (! txtCodigo.getText().trim().equals("")) {
			try{
				clienteVO.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite apenas números no campo do Código","Inválido",JOptionPane.WARNING_MESSAGE);
				}
		}
		
		clienteVO.setNome(txtNome.getText().trim());
		clienteVO.setFixo(txtFixo.getText().trim());
		clienteVO.setNextel(txtNextel.getText().trim());
		clienteVO.setFormaDePagamento(pagamento);
		clienteVO.setCel(txtCelular.getText().trim());
		clienteVO.setCnpj(txtCnpj.getText().trim());
		clienteVO.setCpf(txtCpf.getText().trim());
		clienteVO.setRua(txtrua.getText().trim());
		clienteVO.setBairro(txtBairro.getText().trim());
		clienteVO.setNumero(txtNumero.getText().trim());
		clienteVO.setCep(txtCep.getText().trim());
		clienteVO.setCidade(txtCidade.getText().trim());
		clienteVO.setComplemento(txtcomplemento.getText().trim());
		clienteVO.setEmail(txtemail.getText().trim());
		String uf = comboBox2.getSelectedItem().toString();
		clienteVO.setUf(uf);
	

		return clienteVO;
	}


	private void limpar() {

		
		txtCodigo.setText("");
		txtNome.setText("");
		txtFixo.setText("");
		txtNextel.setText("");
		txtCelular.setText("");
		txtCnpj.setText("");
		txtCpf.setText("");
		txtrua.setText("");
		txtBairro.setText("");
		txtNumero.setText("");
		txtCep.setText("");
		txtCidade.setText("");
		txtcomplemento.setText("");
		txtemail.setText("");
		comboBox2.setSelectedIndex(0);
		comboBox.setSelectedIndex(0);
		txtCodigo.requestFocus();
		
		CadastroClienteView.lblId.setForeground(Color.BLACK);
		CadastroClienteView.lblCnpj.setForeground(Color.BLACK);
		CadastroClienteView.lblComplemento.setForeground(Color.BLACK);
		CadastroClienteView.lblCidade.setForeground(Color.BLACK);
		CadastroClienteView.lblCpfopcional.setForeground(Color.BLACK);
		CadastroClienteView.lblEmail.setForeground(Color.BLACK);
		CadastroClienteView.lblTelResidencial.setForeground(Color.BLACK);
		CadastroClienteView.lblTelCelular.setForeground(Color.BLACK);
		CadastroClienteView.lblTelComercial.setForeground(Color.BLACK);
		CadastroClienteView.lblNome.setForeground(Color.BLACK);
		CadastroClienteView.lblNmero.setForeground(Color.BLACK);
		CadastroClienteView.lblRua.setForeground(Color.BLACK);
		CadastroClienteView.lblFormaDePagamento.setForeground(Color.BLACK);
		
	}

	private static void pesquisarClienteTodos() throws Exception {
		ClienteController cController = new ClienteController();
		List<ClienteVO> lista = new ArrayList<ClienteVO>();
		lista = cController.pesquisarClienteTodos();
		cleanTable(table);

		for (ClienteVO clienteVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String Codigo = Integer.toString(clienteVO.getCodigo());

			dados.addRow(new String[] { Codigo, clienteVO.getNome(), clienteVO.getCnpj(), clienteVO.getCpf(),
					clienteVO.getFormaDePagamento() });

		}

	}

	private void excluirCliente() throws Exception {
		txtCodigo.enable(true);
		ClienteController clienteController = new ClienteController();

		JOptionPane.showMessageDialog(frmCadastroDeCliente,
				clienteController.excluirCliente(Integer.parseInt(txtCodigo.getText())));

	}

	private static void cleanTable(JTable tabela) {

		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}

	private void preencherCampos() throws Exception {
		int linhaSelecionada = table.getSelectedRow();

		if (linhaSelecionada != -1) {

			String codigo = table.getValueAt(linhaSelecionada, 0).toString();

			ClienteVO clienteVO = pesquisaPorCodigo(Integer.parseInt(codigo));



			txtCodigo.enable(false);
			txtCodigo.setText(Integer.toString(clienteVO.getCodigo()));
			txtNome.setText(clienteVO.getNome());
			txtFixo.setText(clienteVO.getFixo());
			txtNextel.setText(clienteVO.getNextel());
			txtCelular.setText(clienteVO.getCel());
			comboBox.setSelectedItem(clienteVO.getFormaDePagamento());
			comboBox2.setSelectedItem(clienteVO.getUf());
			txtCnpj.setText(clienteVO.getCnpj());
			txtCpf.setText(clienteVO.getCpf());
			txtrua.setText(clienteVO.getRua());
			txtBairro.setText(clienteVO.getBairro());
			txtNumero.setText(clienteVO.getNumero());
			txtCep.setText(clienteVO.getCep());
			txtCidade.setText(clienteVO.getCidade());
			txtemail.setText(clienteVO.getEmail());
			txtcomplemento.setText(clienteVO.getComplemento());

		} else {

			JOptionPane.showMessageDialog(frmCadastroDeCliente, "Favor selecionar uma linha", "Atenção",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	private ClienteVO pesquisaPorCodigo(int codigo) throws Exception {
		ClienteController clienteController = new ClienteController();

		return clienteController.pesquisarPorCodigo(codigo);
	}

	private void addDadosTable(ClienteVO clienteVO) {

		cleanTable(table);

		DefaultTableModel dados = (DefaultTableModel) table.getModel();

		String Codigo = Integer.toString(clienteVO.getCodigo());

		dados.addRow(new String[] { Codigo, clienteVO.getNome(), clienteVO.getCnpj(), clienteVO.getCpf(),
				clienteVO.getFormaDePagamento() });

	}

	private void alterarCliente() throws Exception {

		txtCodigo.enable(true);

		ClienteVO clienteVO = new ClienteVO();

		String pagamento = comboBox.getSelectedItem().toString();
		clienteVO.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
		clienteVO.setNome(txtNome.getText().trim());
		clienteVO.setFixo(txtFixo.getText().trim());
		clienteVO.setNextel(txtNextel.getText().trim());
		clienteVO.setFormaDePagamento(pagamento);
		clienteVO.setCel(txtCelular.getText().trim());
		clienteVO.setCnpj(txtCnpj.getText().trim());
		clienteVO.setCpf(txtCpf.getText().trim());
		clienteVO.setRua(txtrua.getText().trim());
		clienteVO.setBairro(txtBairro.getText().trim());
		clienteVO.setNumero(txtNumero.getText().trim());
		clienteVO.setCep(txtCep.getText().trim());
		clienteVO.setCidade(txtCidade.getText().trim());
		String uf = comboBox2.getSelectedItem().toString();
		clienteVO.setUf(uf);
		clienteVO.setEmail(txtemail.getText().trim());
		clienteVO.setComplemento(txtcomplemento.getText().trim());

		ClienteController controller = new ClienteController();
		controller.alteraCliente(clienteVO);

		//limpar();
	}

	private void pesquisarPorNome(String nome) throws Exception {
		cleanTable(table);
		ClienteController controller = new ClienteController();

		List<ClienteVO> lista = controller.pesquisarNome(nome);

		for (ClienteVO clienteVO : lista) {

			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String codigo = Integer.toString(clienteVO.getCodigo());

			dados.addRow(new String[] { codigo, clienteVO.getNome(), clienteVO.getCnpj(), clienteVO.getCpf(),
					clienteVO.getFormaDePagamento() });
		}

	}

	private void PesquisarPorCep() {
		String cep = txtCep.getText();
		String uf = comboBox2.getSelectedItem().toString();
		WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

		if (webServiceCep.wasSuccessful()) {

			
			txtrua.setText(webServiceCep.getLogradouroFull());
			txtBairro.setText(webServiceCep.getBairro());
			txtCidade.setText(webServiceCep.getCidade());
			comboBox2.setSelectedItem(webServiceCep.getUf());

		} else {
			JOptionPane.showMessageDialog(null,"Cep não encontrado");

		}

	}
}

	