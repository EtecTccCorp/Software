package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

import Controller.RelatorioClienteController;
import Controller.RelatorioController;
import Controller.RelatorioEstoqueController;
import Controller.RelatroioProdutoController;
import VO.RelatorioClienteVO;
import VO.RelatorioEstoqueVO;
import VO.RelatorioProdutosVO;
import VO.RelatorioVendasVO;

public class Relatorios extends JFrame {

	private JPanel contentPane;
	static Relatorios frameRelatorio = new Relatorios();
	private JDateChooser txtdatainicio;
	private JDateChooser txtdatafinal;
	private JDateChooser txtdataInicioCliente;
	private JDateChooser txtDataFinalCliente;

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
					frameRelatorio.setVisible(true);
					frameRelatorio.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Relatorios() {

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

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 970, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(new Color(17, 144, 147));
		panel.setBounds(0, 0, 268, 775);
		contentPane.add(panel);
		setContentPane(contentPane);
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 83, 204, 18);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(216, 91, 0, 2);
		panel.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(216, 99, 0, 2);
		panel.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 492, 0, 2);
		panel.add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 492, 270, 2);
		panel.add(separator_4);

		JLabel label = new JLabel("Administrador");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label.setBounds(24, 525, 79, 16);
		panel.add(label);

		JButton button = new JButton("Cadastro de Clientes");
		button.setMnemonic(KeyEvent.VK_1);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteView windowCliente = new CadastroClienteView();
				windowCliente.frmCadastroDeCliente.setVisible(true);
				windowCliente.frmCadastroDeCliente.setLocationRelativeTo(null);

				dispose();
			}
		});
		button.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(17, 144, 147));
		button.setBounds(0, 132, 270, 48);
		panel.add(button);

		JButton button_1 = new JButton("Cadastro de Fornecedores");
		button_1.setMnemonic(KeyEvent.VK_2);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Fornecedor fornecedor = new Fornecedor();
				fornecedor.frame.setVisible(true);
				fornecedor.frame.setLocationRelativeTo(null);

				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(17, 144, 147));
		button_1.setBounds(0, 192, 270, 48);
		panel.add(button_1);

		JButton button_2 = new JButton("Cadastro de Produtos");
		button_2.setMnemonic(KeyEvent.VK_3);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosView produto = new CadastroProdutosView();
				produto.setVisible(true);
				produto.setLocationRelativeTo(null);

				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-produto-25.png")));
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(17, 144, 147));
		button_2.setBounds(0, 252, 270, 48);
		panel.add(button_2);

		JButton button_3 = new JButton("Vendas");
		button_3.setMnemonic(KeyEvent.VK_4);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VendasView vendas = new VendasView();
				vendas.setVisible(true);
				vendas.setLocationRelativeTo(null);

				dispose();
			}
		});
		button_3.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-performance-de-vendas-25.png")));
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(17, 144, 147));
		button_3.setBounds(0, 312, 270, 48);
		panel.add(button_3);

		JButton button_4 = new JButton("Estoque");
		button_4.setMnemonic(KeyEvent.VK_5);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesign estoque = new ViewEstoqueDesign();
				estoque.setVisible(true);
				estoque.setLocationRelativeTo(null);

				dispose();
			}

		});
		button_4.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_4.setOpaque(true);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_4.setBackground(new Color(17, 144, 147));
		button_4.setBounds(0, 372, 270, 48);
		panel.add(button_4);

		JLabel label_1 = new JLabel("Varej\u00E3o Santos");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);

				dispose();
			}
		});
		label_1.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label_1.setForeground(new Color(240, 248, 255));
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		label_1.setBounds(6, 45, 260, 32);
		panel.add(label_1);

		JButton btnRelatorios = new JButton("Relatorios");
		btnRelatorios.setMnemonic(KeyEvent.VK_6);
		btnRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios relatorio = new Relatorios();
				relatorio.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnRelatorios.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-pdf-25.png")));
		btnRelatorios.setForeground(Color.WHITE);
		btnRelatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnRelatorios.setBackground(new Color(17, 144, 147));
		btnRelatorios.setBounds(0, 432, 268, 48);
		panel.add(btnRelatorios);

		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBounds(269, 372, 353, 2);
		panel.add(separator_7);

		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(269, 372, 353, 16);
		panel.add(separator_8);

		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(269, 358, 693, 2);
		panel.add(separator_5);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(268, 0, 361, 375);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblRelatrioDeVendas = new JLabel("Relat\u00F3rio De vendas");
		lblRelatrioDeVendas.setBounds(126, 6, 147, 33);
		lblRelatrioDeVendas.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-arquivo-25.png")));
		lblRelatrioDeVendas.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblRelatrioDeVendas.setForeground(Color.WHITE);
		panel_1.add(lblRelatrioDeVendas);

		JLabel lblCliqueNoBoto = new JLabel(
				"Clique no bot\u00E3o abaixo para exibir um relat\u00F3rio completo \r\n\r\n");
		lblCliqueNoBoto.setBounds(6, 51, 356, 23);
		lblCliqueNoBoto.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCliqueNoBoto.setForeground(Color.WHITE);
		panel_1.add(lblCliqueNoBoto);

		JLabel lblNeleIrConter = new JLabel(
				"Nele ir\u00E1 conter informa\u00E7\u00F5es sobre a maior venda no m\u00EAs\r\n");
		lblNeleIrConter.setBounds(6, 94, 334, 16);
		lblNeleIrConter.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNeleIrConter.setForeground(Color.WHITE);
		panel_1.add(lblNeleIrConter);

		JLabel lblAMenorVenda = new JLabel(". Qual foi menor venda");
		lblAMenorVenda.setBounds(16, 133, 321, 16);
		lblAMenorVenda.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblAMenorVenda.setForeground(Color.WHITE);
		panel_1.add(lblAMenorVenda);

		JLabel lblMaximoVendido = new JLabel(". Maximo vendido");
		lblMaximoVendido.setBounds(16, 190, 321, 16);
		lblMaximoVendido.setForeground(Color.WHITE);
		lblMaximoVendido.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_1.add(lblMaximoVendido);

		JLabel lblQualFoi = new JLabel(". Qual foi a maior venda");
		lblQualFoi.setBounds(19, 161, 321, 16);
		lblQualFoi.setForeground(Color.WHITE);
		lblQualFoi.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_1.add(lblQualFoi);

		txtdatainicio = new JDateChooser();
		txtdatainicio.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		txtdatainicio.setBounds(72, 341, 114, 28);
		panel_1.add(txtdatainicio);

		JLabel lblDe = new JLabel("De:");
		lblDe.setForeground(Color.WHITE);
		lblDe.setBounds(16, 341, 55, 16);
		panel_1.add(lblDe);

		JLabel label_2 = new JLabel(". Qual mais vende\r\n");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_2.setBounds(19, 218, 321, 16);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel(". Qual tem mais saida\r\n\r\n");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_3.setBounds(19, 246, 321, 16);
		panel_1.add(label_3);

		JLabel label_6 = new JLabel(". Produto menos Vendido\r\n\r\n\r\n");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		label_6.setBounds(19, 274, 321, 16);
		panel_1.add(label_6);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground((new Color(0, 128, 128)));
		panel_3.setBounds(268, 367, 361, 375);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JButton btnNewButton = new JButton("Gerar Relat\u00F3rio de vendas");
		btnNewButton.setBounds(66, 165, 201, 37);
		panel_3.add(btnNewButton);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					RelatorioVendasVO relatorioVendasVO = new RelatorioVendasVO();
					relatorioVendasVO = getDadosRelatoriosVendas();
					gravaPdf(relatorioVendasVO);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-pdf-25.png")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));

		txtdatafinal = new JDateChooser();
		txtdatafinal.setBounds(73, 38, 114, 28);
		panel_3.add(txtdatafinal);

		JLabel lblAt = new JLabel("At\u00E9:");
		lblAt.setBounds(21, 38, 55, 16);
		panel_3.add(lblAt);
		lblAt.setForeground(Color.WHITE);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground((new Color(0, 128, 128)));
		panel_4.setBounds(636, 0, 328, 742);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblRelatrioDeCliente = new JLabel("Relat\u00F3rio de Clientes");
		lblRelatrioDeCliente.setBounds(114, 6, 171, 25);
		lblRelatrioDeCliente.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-arquivo-25.png")));
		lblRelatrioDeCliente.setForeground(Color.WHITE);
		lblRelatrioDeCliente.setFont(new Font("SansSerif", Font.BOLD, 12));
		panel_4.add(lblRelatrioDeCliente);

		JLabel label_7 = new JLabel("Clique no bot\u00E3o abaixo para exibir um relat\u00F3rio \r\n\r\n\r\n");
		label_7.setBounds(16, 43, 356, 23);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_4.add(label_7);

		JLabel lblNeleIrConter_3 = new JLabel("Nele ir\u00E1 conter informa\u00E7\u00F5es sobre o Cliente\r\n");
		lblNeleIrConter_3.setBounds(16, 91, 262, 16);
		lblNeleIrConter_3.setForeground(Color.WHITE);
		lblNeleIrConter_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_4.add(lblNeleIrConter_3);

		JLabel lblQualClienteCompra = new JLabel(". Qual cliente mais compra\r\n");
		lblQualClienteCompra.setBounds(33, 132, 286, 16);
		lblQualClienteCompra.setForeground(Color.WHITE);
		lblQualClienteCompra.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_4.add(lblQualClienteCompra);

		JButton btnGerarRelatrioDe_2 = new JButton("Gerar Relat\u00F3rio de Clientes");
		btnGerarRelatrioDe_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					RelatorioClienteVO relatorioClienteVO = new RelatorioClienteVO();

					relatorioClienteVO = getDadosRelatoriosCliente();
					gravaPdfCliente(relatorioClienteVO);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		btnGerarRelatrioDe_2.setBounds(58, 531, 220, 37);
		btnGerarRelatrioDe_2.setIcon(new ImageIcon(Relatorios.class.getResource("/imagens/icons8-pdf-25.png")));
		btnGerarRelatrioDe_2.setForeground(Color.WHITE);
		btnGerarRelatrioDe_2.setBackground(new Color(0, 128, 128));
		panel_4.add(btnGerarRelatrioDe_2);

		JLabel lblQualCliente = new JLabel(". Qual cliente menos compra\r\n");
		lblQualCliente.setBounds(33, 159, 286, 16);
		lblQualCliente.setForeground(Color.WHITE);
		lblQualCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		panel_4.add(lblQualCliente);

		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(321, 6, -317, 2);
		panel_4.add(separator_10);

		txtdataInicioCliente = new JDateChooser();
		txtdataInicioCliente.setBounds(78, 340, 114, 28);
		panel_4.add(txtdataInicioCliente);

		txtDataFinalCliente = new JDateChooser();
		txtDataFinalCliente.setBounds(78, 396, 114, 28);
		panel_4.add(txtDataFinalCliente);

		JLabel label_4 = new JLabel("De");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(16, 352, 55, 16);
		panel_4.add(label_4);

		JLabel label_5 = new JLabel("At\u00E9:");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(16, 396, 55, 16);
		panel_4.add(label_5);
	}

	private void gravaPdf(RelatorioVendasVO relatorioVendasVO) {

		Document document = new Document();
		
		RelatorioProdutosVO relatorioProdutoVO = new RelatorioProdutosVO();
		RelatroioProdutoController controller = new RelatroioProdutoController();
		
		try {
			
			relatorioProdutoVO = controller.getDadosRelatoriosProdutos(txtdatainicio.getDate(), txtdatafinal.getDate());
			
			SimpleDateFormat out = new SimpleDateFormat("dd-MM-yyyy");
			
			String dataInicio = out.format(relatorioVendasVO.getDataInicio());

			String dataFinal = out.format(relatorioVendasVO.getDataFinal());
			
			String nomeArq = "Relatorio Vendas "+ dataInicio + " até " + dataFinal; 
			
			PdfWriter.getInstance(document, new FileOutputStream("C:/temp/"+nomeArq+".pdf"));

			document.open();
			document.add(new Paragraph("Relatório de Vendas\n"));
			document.add(
					new Paragraph(
							"\nFrangos resfriados vendidos: " + relatorioVendasVO.getResfriados()
									+ "; \nFrangos Congelados:" + relatorioVendasVO.getCongelados()
									+ "; \nFrangos Temperados Vendidos:" + relatorioVendasVO.getTemperados()
									+ ";\n \nTotal vendido no mês: " + (relatorioVendasVO.getResfriados()
											+ relatorioVendasVO.getCongelados() + relatorioVendasVO.getTemperados())
									+ ";"
									+ "\n O Produto mais vendido foi: " + " " + relatorioProdutoVO.getNomeProdutoMaior()
									+ ";" + "\nUnidades Vendidas: " + relatorioProdutoVO.getMaiorVenda()
									+ "\nProduto que menos vendeu:" + relatorioProdutoVO.getNomeProduto()
									+ "\n Unidades vendidas" + " " + relatorioProdutoVO.getMenorVenda()));
			

			try {
				Desktop.getDesktop().open(new File("C:/temp/"+nomeArq+".pdf"));
			} catch (IOException ex) {
				System.out.println("Error:" + ex);
			}
		} catch (Exception ex) {
			System.out.println("Error:" + ex);
			ex.printStackTrace();
			
		}finally {
			document.close();
		}

		


	}

	private RelatorioVendasVO getDadosRelatoriosVendas() throws Exception {

		RelatorioController relatorioController = new RelatorioController();

		RelatorioVendasVO relatorio = new RelatorioVendasVO();
		relatorio.setDataInicio(txtdatainicio.getDate());
		relatorio.setDataFinal(txtdatafinal.getDate());

		return relatorioController.getDadosRelatoriosVendas(relatorio.getDataInicio(), relatorio.getDataFinal());

	}

	private RelatorioProdutosVO getDadosRelatoriosProduto() throws Exception {
		RelatroioProdutoController controller = new RelatroioProdutoController();
		RelatorioProdutosVO relatorioProduto = new RelatorioProdutosVO();

		return controller.getDadosRelatoriosProdutos(relatorioProduto.getDataInicio(), relatorioProduto.getDataFinal());

	}

	private RelatorioClienteVO getDadosRelatoriosCliente() throws Exception {
		RelatorioClienteController controller = new RelatorioClienteController();
		RelatorioClienteVO RelatorioCliente = new RelatorioClienteVO();
		RelatorioCliente.setDataInicio(txtdataInicioCliente.getDate());
		RelatorioCliente.setDataFinal(txtDataFinalCliente.getDate());

		return controller.getDadosRelatoriosCliente(RelatorioCliente.getDataInicio(), RelatorioCliente.getDataFinal());
	}

	private void gravaPdfCliente(RelatorioClienteVO relatorioClienteVO) {
		Document document = new Document();

		SimpleDateFormat out = new SimpleDateFormat("dd-MM-yyyy");
		
		String dataInicio = out.format(relatorioClienteVO.getDataInicio());

		String dataFinal = out.format(relatorioClienteVO.getDataFinal());
		
		String nomeArq = "Relatorio Cliente "+ dataInicio + " até " + dataFinal; 
		
		try {

			
			PdfWriter.getInstance(document, new FileOutputStream("C:/temp/"+nomeArq+".pdf"));
			

			document.open();
			document.add(new Paragraph("Relatório de Clientes\n"));
			document.add(
					new Paragraph("\n O Cliente que mais comprou foi: " + " " + relatorioClienteVO.getNomeClienteMaior()
							+ "\n Número de compras realizadas" + " " + relatorioClienteVO.getQuantidadeComprada()
							+ "\n Total Comprado:" + " " + relatorioClienteVO.getValorMaior()));

		} catch (DocumentException ex) {
			System.out.println("Error:" + ex);
		} catch (FileNotFoundException ex) {
			System.out.println("Error:" + ex);
		} finally {
			document.close();
		}

		try {
			Desktop.getDesktop().open(new File("C:/temp/"+nomeArq+".pdf"));
		} catch (IOException ex) {
			System.out.println("Error:" + ex);
		}

	}
}
