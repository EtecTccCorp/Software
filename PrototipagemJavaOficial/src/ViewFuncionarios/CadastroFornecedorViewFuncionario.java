package ViewFuncionarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.jgoodies.looks.common.ComboBoxEditorTextField;

import CEP.WebServiceCep;
import Controller.FornecedorController;
import VO.ClienteVO;
import VO.FornecedorVO;
import Validator.FornecedorValidation;
import View.CadastroFornecedorView;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ComboBoxUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CadastroFornecedorViewFuncionario extends JFrame {

	public JFrame frame;
	public static JTextField textEmpresa;
	public static JTextField textCnpj;
	public static JTextField textCnpj_1;
	public static JTextField textRua;
	public static JTextField textCep;
	public static JTextField textNumero;
	public static JTextField textBairro;
	public static JTextField textTelefone;
	public static JTextField textCelular;
	public static JTextField textPesquisar;
	public static JTextField textCidade;
	public static JTextField textcodigo;
	public static JComboBox comboBox;
	private MaskFormatter ftmCep;
	private MaskFormatter ftmTelefone;
	private MaskFormatter ftmCelular;
	private MaskFormatter ftmCnpj_1;
	private MaskFormatter ftmNextel;
	public static JTextField textEmail;
	public static JTextField textNextel;
	public static JTextField textComplemento;
	private JTable table;

	
	public static JLabel lblId;
	public static JLabel lblEmpresa; 
	public static JLabel lblCnpj;
	public static JLabel lblRua;
	public static JLabel lblCep;
	public static JLabel lblNumero;
	public static JLabel lblBairro;
	public static JLabel lblCidade;
	public static JLabel lblTelefone;
	public static JLabel lblTelefone_1;
	public static JLabel lblEmail; 
	public static JLabel lblNextel;
	public static JLabel lblComplemento; 
	
	
	
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
					CadastroFornecedorViewFuncionario windowFornecedor = new CadastroFornecedorViewFuncionario();
					windowFornecedor.setVisible(true);
					windowFornecedor.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroFornecedorViewFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 12));
		frame.setBounds(100, 100, 953, 804);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblId = new JLabel("C\u00D3DIGO:");
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblId.setBounds(268, 55, 63, 18);
		frame.getContentPane().add(lblId);

		textEmpresa = new JTextField();
		textEmpresa.setColumns(10);
		textEmpresa.setBounds(455, 74, 310, 31);
		frame.getContentPane().add(textEmpresa);

	    lblEmpresa = new JLabel("NOME:");
		lblEmpresa.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmpresa.setBounds(455, 57, 85, 14);
		frame.getContentPane().add(lblEmpresa);

	    lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCnpj.setBounds(268, 114, 85, 14);
		frame.getContentPane().add(lblCnpj);

		textCnpj_1 = new JTextField();
		textCnpj_1.addKeyListener(new KeyAdapter() {

		});
		try {
			ftmCnpj_1 = new MaskFormatter("##.###.###/####-##");
		} catch (ParseException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		textCnpj_1 = new JFormattedTextField(ftmCnpj_1);
		textCnpj_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		textCnpj_1.setColumns(10);
		textCnpj_1.setBounds(268, 140, 180, 30);
		frame.getContentPane().add(textCnpj_1);

		textRua = new JTextField();
		textRua.setColumns(10);
		textRua.setBounds(455, 217, 305, 30);
		frame.getContentPane().add(textRua);

		lblRua = new JLabel("RUA:");
		lblRua.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblRua.setBounds(455, 191, 46, 14);
		frame.getContentPane().add(lblRua);

		textCep = new JTextField();
		try {
			ftmCep = new MaskFormatter("#####-###");
			textCep = new JFormattedTextField(ftmCep);
			textCep.setBounds(268, 217, 180, 30);
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		textCep.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String cp = textCep.getText();
				cp = cp.replaceAll("\\D*", "");
				int cont = cp.length();

				if (cont == 8) {
					try {
						correio();
					} catch (Exception e3) {
						JOptionPane.showMessageDialog(null, e3);
					}
				}

			}
		});
		textCep.setColumns(10);

		frame.getContentPane().add(textCep);

		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(268, 191, 46, 14);
		frame.getContentPane().add(lblCep);

		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(772, 217, 50, 30);
		frame.getContentPane().add(textNumero);

	    lblNumero = new JLabel("NUMERO:");
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNumero.setBounds(772, 191, 86, 14);
		frame.getContentPane().add(lblNumero);

		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(268, 290, 180, 30);
		frame.getContentPane().add(textBairro);

		lblBairro = new JLabel("BAIRRO:");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(268, 264, 73, 14);
		frame.getContentPane().add(lblBairro);

	    lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(455, 264, 85, 14);
		frame.getContentPane().add(lblCidade);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblUf.setBounds(844, 264, 46, 14);
		frame.getContentPane().add(lblUf);

		lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(268, 348, 74, 14);
		frame.getContentPane().add(lblTelefone);

		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		try {
			ftmTelefone = new MaskFormatter("(##)####-####");
			textTelefone = new JFormattedTextField(ftmTelefone);

		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		textTelefone.setBounds(268, 374, 180, 30);

		frame.getContentPane().add(textTelefone);

	    lblTelefone_1 = new JLabel("TELEFONE CELULAR:");
		lblTelefone_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone_1.setBounds(455, 348, 132, 14);
		frame.getContentPane().add(lblTelefone_1);

		textCelular = new JTextField();
		textCelular.addKeyListener(new KeyAdapter() {

		});
		try {
			ftmCelular = new MaskFormatter("(##)####-#####");
			textCelular = new JFormattedTextField(ftmCelular);

		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		textCelular.setColumns(10);
		textCelular.setBounds(455, 374, 180, 30);
		frame.getContentPane().add(textCelular);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"LISTA DE FORNECEDORES CADASTRADOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(263, 417, 672, 294);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 55, 637, 224);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00D3DIGO", "EMPRESA", "CNPJ", "CEP", "CELULAR", "TELEFONE"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(141);
		table.getColumnModel().getColumn(2).setPreferredWidth(136);
		table.getColumnModel().getColumn(3).setPreferredWidth(122);
		table.getColumnModel().getColumn(4).setPreferredWidth(105);
		scrollPane.setViewportView(table);

		textPesquisar = new JTextField();
		textPesquisar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {

				// String nome = textPesquisar.getText();
				// String cnpj = textPesquisar.getText();
				try {

					Pattern patternString = Pattern.compile("[A-Z]");
					Pattern patternNumeros = Pattern.compile("[0-9]");

					if (patternNumeros.matcher(textPesquisar.getText()).find()) {

						addDadosTable(pesquisarPorCodigo(Integer.parseInt(textPesquisar.getText())));

					} else /*
							 * if
							 * (patternString.matcher(textPesquisar.getText()).
							 * find())
							 */ {

						pesquisarPorNome(textPesquisar.getText());

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		textPesquisar.setBounds(107, 21, 122, 28);
		panel_2.add(textPesquisar);
		textPesquisar.setColumns(10);

		JLabel lblNewLabel = new JLabel("Pesquisar");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(16, 27, 55, 16);
		panel_2.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setIgnoreRepaint(true);
		panel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.setFocusTraversalPolicyProvider(true);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(new Color(0, 0, 0));
		panel.setToolTipText("");
		panel.setForeground(new Color(72, 61, 139));
		panel.setBounds(0, -6, 251, 781);
		frame.getContentPane().add(panel);

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesignFuncionario menu = new ViewMenuDesignFuncionario();
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		label.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setBounds(17, 52, 199, 32);
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator = new JSeparator();
		separator.setBounds(17, 96, 199, 10);

		JButton button_2 = new JButton("Cadastro de Clientes");
		button_2 .setMnemonic(KeyEvent.VK_1);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button_2.setBounds(0, 136, 247, 48);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				CadastroClienteViewFuncionario window = new CadastroClienteViewFuncionario();
				window.frmCadastroDeCliente.setVisible(true);
				window.frmCadastroDeCliente.setLocationRelativeTo(null);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(0, 0, 0));

		JButton button_3 = new JButton("Cadastro de Fornecedores");
		button_3 .setMnemonic(KeyEvent.VK_2);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroFornecedorViewFuncionario cadastroFornecedorView = new CadastroFornecedorViewFuncionario();
				cadastroFornecedorView.frame.setVisible(true);
				cadastroFornecedorView.frame.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		button_3.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_3.setBounds(2, 196, 247, 48);
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(0, 0, 0));

		JButton button_4 = new JButton("Cadastro de Produtos");
		button_4 .setMnemonic(KeyEvent.VK_3);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setVisible(true);
				produto.setLocationRelativeTo(null);

				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();
			}
		});
		button_4.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-produto-25.png")));
		button_4.setBounds(0, 256, 247, 48);
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(0, 0, 0));

		JButton button_6 = new JButton("Estoque");
		button_6 .setMnemonic(KeyEvent.VK_4);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = new ViewEstoqueDesignFuncionario();
				estoque.setVisible(true);
				estoque.setLocationRelativeTo(null);
				Component comp = SwingUtilities.getRoot(frame);

				((Window) comp).dispose();

			}
		});
		button_6.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_6.setBounds(0, 316, 247, 48);
		button_6.setOpaque(true);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_6.setBackground(new Color(0, 0, 0));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(2, 497, 270, 2);

		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setBounds(30, 531, 79, 16);
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel.setLayout(null);
		panel.add(label);
		panel.add(separator);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_6);
		panel.add(separator_1);
		panel.add(lblFuncionario);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(637, 55, 154, 1);
		frame.getContentPane().add(horizontalStrut);

		comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA",
						"PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
		comboBox.setBounds(839, 290, 73, 30);
		frame.getContentPane().add(comboBox);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-salvar-25 (2).png")));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					cadastrarFonercecor();
					pesquisarFornecedorTodos();
					limpar();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		btnCadastrar.setBounds(283, 722, 124, 37);
		frame.getContentPane().add(btnCadastrar);

		JLabel lblCadastroDeFornecedores = new JLabel("CADASTRO DE FORNECEDORES");
		lblCadastroDeFornecedores.setIcon(new ImageIcon(
				CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-interestadual-filled-25.png")));
		lblCadastroDeFornecedores.setForeground(Color.BLACK);
		lblCadastroDeFornecedores.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblCadastroDeFornecedores.setBounds(403, 22, 393, 23);
		frame.getContentPane().add(lblCadastroDeFornecedores);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.WHITE);
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(390, 44, 388, 18);
		frame.getContentPane().add(separator_2);

		textCidade = new JTextField();
		textCidade.setBounds(455, 291, 180, 28);
		frame.getContentPane().add(textCidade);
		textCidade.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();

			}

		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnLimpar.setBounds(637, 722, 104, 37);
		frame.getContentPane().add(btnLimpar);

		textcodigo = new JTextField();
		textcodigo.addKeyListener(new KeyAdapter() {

		});
		textcodigo.setColumns(10);
		textcodigo.setBounds(268, 74, 116, 31);
		frame.getContentPane().add(textcodigo);

		lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setBounds(455, 114, 85, 14);
		frame.getContentPane().add(lblEmail);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(454, 140, 310, 31);
		frame.getContentPane().add(textEmail);

		lblNextel = new JLabel("NEXTEL");
		lblNextel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNextel.setBounds(647, 348, 74, 14);
		frame.getContentPane().add(lblNextel);

		textNextel = new JTextField();
		

		
		textNextel.setColumns(10);
		textNextel.setBounds(647, 375, 180, 30);
		frame.getContentPane().add(textNextel);

		textComplemento = new JTextField();
		textComplemento.setColumns(10);
		textComplemento.setBounds(647, 292, 180, 28);
		frame.getContentPane().add(textComplemento);

		lblComplemento = new JLabel("COMPLEMENTO");
		lblComplemento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplemento.setBounds(647, 265, 104, 14);
		frame.getContentPane().add(lblComplemento);
		
				JButton btnPreencherCampos = new JButton("Detalhes");
				btnPreencherCampos.setBounds(442, 723, 165, 36);
				frame.getContentPane().add(btnPreencherCampos);
				btnPreencherCampos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							preencherCampos();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				});
				btnPreencherCampos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnPreencherCampos
						.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-ver-detalhes-25.png")));
				
						JButton btnAtualizar = new JButton("Atualizar");
						btnAtualizar.setBounds(789, 723, 122, 36);
						frame.getContentPane().add(btnAtualizar);
						btnAtualizar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								try {
									pesquisarFornecedorTodos();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									JOptionPane.showMessageDialog(null, "Erro Interno" + e.getMessage(), "Atenção",
											JOptionPane.ERROR_MESSAGE);
								}

							}
						});
						btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnAtualizar.setIcon(new ImageIcon(CadastroFornecedorViewFuncionario.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
	}

	private void cadastrarFonercecor() throws Exception {
		/*
		 * if(textcodigo.getText().equals("lucas")){
		 * textcodigo.setBackground(Color.red);
		 * 
		 * }
		 */
		FornecedorVO fornecedorVO = new FornecedorVO();
		String uf = comboBox.getSelectedItem().toString();
		if (! textcodigo.getText().trim().equals("")) {
			try {
				fornecedorVO.setCodigoFornecedor(Integer.parseInt(textcodigo.getText()));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Digite apenas números no campo do Código");
			}
		}
		fornecedorVO.setEmpresa(textEmpresa.getText());
		fornecedorVO.setCnpj(textCnpj_1.getText());
		fornecedorVO.setCep(textCep.getText());
		fornecedorVO.setRua(textRua.getText());
		fornecedorVO.setComplemento(textComplemento.getText());
		fornecedorVO.setNumero(textNumero.getText());
		fornecedorVO.setUf(uf);
		fornecedorVO.setBairro(textBairro.getText());
		fornecedorVO.setCidade(textCidade.getText());
		fornecedorVO.setEmail(textEmail.getText());
		fornecedorVO.setTelefoneCelular(textCelular.getText());
		fornecedorVO.setTelefone(textTelefone.getText());
		fornecedorVO.setNextel(textNextel.getText());

		FornecedorController controller = new FornecedorController();
		controller.cadastrarFornecedorFuncionario(fornecedorVO);
		deixarEmBranco();

	}

	private void deixarEmBranco() {
		textcodigo.setBackground(Color.white);
		textEmpresa.setBackground(Color.white);
		textCnpj_1.setBackground(Color.WHITE);
		textNumero.setBackground(Color.WHITE);
		textRua.setBackground(Color.WHITE);
		textCep.setBackground(Color.WHITE);
		textBairro.setBackground(Color.WHITE);
		textCidade.setBackground(Color.WHITE);
	}

	private void excluirFornecedor() throws Exception {
		int codigo = Integer.parseInt(textcodigo.getText());
		FornecedorController fornecedorController = new FornecedorController();
		fornecedorController.excluirFornecedor(codigo);
	}

	private void limpar() {

		textcodigo.setText("");
		textBairro.setText("");
		textCelular.setText("");
		textCep.setText("");
		textCidade.setText("");
		textCnpj_1.setText("");
		textEmpresa.setText("");
		textNumero.setText("");
		textTelefone.setText("");
		textRua.setText("");
		comboBox.setSelectedItem("");
		textcodigo.requestFocus();
		textPesquisar.setText("");
		textEmail.setText("");
		textNextel.setText("");
		textComplemento.setText("");
		//cleanTable(table);
		textcodigo.enable(true);
		
		CadastroFornecedorViewFuncionario.lblId.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblCnpj.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblComplemento.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblCidade.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblEmail.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblTelefone.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblTelefone_1.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblNextel.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblEmpresa.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblNumero.setForeground(Color.BLACK);
		CadastroFornecedorViewFuncionario.lblRua.setForeground(Color.BLACK);


	}

	private void alterarFornecedor() throws Exception {
		FornecedorVO fornecedorVO = new FornecedorVO();
		String uf = comboBox.getSelectedItem().toString();
		fornecedorVO.setCodigoFornecedor(Integer.parseInt(textcodigo.getText()));
		fornecedorVO.setBairro(textBairro.getText());
		fornecedorVO.setCep(textCep.getText());
		fornecedorVO.setCidade(textCidade.getText());
		fornecedorVO.setCnpj(textCnpj_1.getText());
		fornecedorVO.setEmail(textEmail.getText());
		fornecedorVO.setComplemento(textComplemento.getText());
		fornecedorVO.setNextel(textNextel.getText());
		fornecedorVO.setEmpresa(textEmpresa.getText());
		fornecedorVO.setNumero(textNumero.getText());
		fornecedorVO.setRua(textRua.getText());
		fornecedorVO.setTelefone(textTelefone.getText());
		fornecedorVO.setTelefoneCelular(textCelular.getText());
		fornecedorVO.setUf(uf);

		FornecedorController controller = new FornecedorController();
		controller.alterarFornecedor(fornecedorVO);

	}

	private void preencherCampos() throws Exception {
		int linhaSelecionada = table.getSelectedRow();
		if (linhaSelecionada != -1) {

			String codigo = table.getValueAt(linhaSelecionada, 0).toString();

			FornecedorVO fornecedorVO = pesquisarPorCodigo(Integer.parseInt(codigo));

			textcodigo.enable(false);
			textcodigo.setText(Integer.toString(fornecedorVO.getCodigoFornecedor()));
			textEmpresa.setText(fornecedorVO.getEmpresa());
			textCnpj_1.setText(fornecedorVO.getCnpj());
			textEmail.setText(fornecedorVO.getEmail());
			textNumero.setText(fornecedorVO.getNumero());
			textRua.setText(fornecedorVO.getRua());
			textComplemento.setText(fornecedorVO.getComplemento());
			textCep.setText(fornecedorVO.getCep());
			comboBox.setSelectedItem(fornecedorVO.getUf());
			textBairro.setText(fornecedorVO.getBairro());
			textCidade.setText(fornecedorVO.getCidade());
			textTelefone.setText(fornecedorVO.getTelefone());
			textCelular.setText(fornecedorVO.getTelefoneCelular());
			textNextel.setText(fornecedorVO.getNextel());

		} else {
			JOptionPane.showMessageDialog(frame, "Favor selecionar uma linha", "Atenção", JOptionPane.ERROR_MESSAGE);
		}

	}

	private FornecedorVO pesquisarPorCodigo(int codigo) throws Exception {
		FornecedorController fornecedorController = new FornecedorController();
		return fornecedorController.pesquisarPorCodigo(codigo);
	}

	private void addDadosTable(FornecedorVO fornecedorVO) {
		cleanTable(table);
		DefaultTableModel dados = (DefaultTableModel) table.getModel();
		String Codigo = Integer.toString(fornecedorVO.getCodigoFornecedor());
		dados.addRow(new String[] { Codigo, fornecedorVO.getEmpresa(), fornecedorVO.getCnpj(), fornecedorVO.getCep(),
				fornecedorVO.getTelefoneCelular(), fornecedorVO.getTelefone() });
	}

	private void cleanTable(JTable tabela) {
		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}

	private void pesquisarFornecedorTodos() throws Exception {
		FornecedorController fornecedorController = new FornecedorController();
		List<FornecedorVO> lista = new ArrayList<FornecedorVO>();
		lista = fornecedorController.pesquisarFornecedorTodos();
		cleanTable(table);

		for (FornecedorVO fornecedorVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();

			String Codigo = Integer.toString(fornecedorVO.getCodigoFornecedor());
			dados.addRow(new String[] { Codigo, fornecedorVO.getEmpresa(), fornecedorVO.getCnpj(),
					fornecedorVO.getCep(), fornecedorVO.getTelefoneCelular(), fornecedorVO.getTelefone() });

		}

	}

	private void pesquisarPorNome(String nome) throws Exception {
		cleanTable(table);
		FornecedorController controller = new FornecedorController();
		List<FornecedorVO> lista = controller.pesquisarNome(nome);
		for (FornecedorVO fornecedorVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();
			String codigo = Integer.toString(fornecedorVO.getCodigoFornecedor());
			dados.addRow(new String[] { codigo, fornecedorVO.getEmpresa(), fornecedorVO.getCnpj(),
					fornecedorVO.getCep(), fornecedorVO.getTelefoneCelular(), fornecedorVO.getTelefone() });
		}

	}

	private void correio() {
		String cep = textCep.getText();
		String uf = comboBox.getSelectedItem().toString();
		WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
		if (webServiceCep.wasSuccessful()) {
			textRua.setText(webServiceCep.getLogradouroFull());
			textBairro.setText(webServiceCep.getBairro());
			textCidade.setText(webServiceCep.getCidade());
			comboBox.setSelectedItem(webServiceCep.getUf());

		} else {
			JOptionPane.showMessageDialog(null, "cep não encontrado");
		}
	}
}
