package ViewFuncionarios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

import Controller.LembreteController;
import DAO.LembreteDAO;
import VO.LembreteVO;
import View.ViewAlterarSenha;
import View.ViewLoginDesign;
import ViewFuncionarios.ViewMenuDesignFuncionario;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ViewMenuDesignFuncionario extends JFrame {

	private JPanel contentPane;
	private static JTable table;

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
			
			PesquisarLembreteTodos();
		} catch (Exception ex) {
			System.err.println(ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ViewMenuDesignFuncionario frameMenu = new ViewMenuDesignFuncionario();
					frameMenu.setVisible(true);
					frameMenu.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMenuDesignFuncionario() {
		setResizable(false);

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			
			PesquisarLembreteTodos();
		} catch (Exception ex) {
			System.err.println(ex);
		}

		
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 953, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(270, 28, 678, 97);
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setLayout(null);

		JLabel lblSejaBemVindo = new JLabel("Seja bem Vindo!");
		lblSejaBemVindo.setForeground(Color.WHITE);
		lblSejaBemVindo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSejaBemVindo.setBounds(26, 10, 163, 39);
		panel_1.add(lblSejaBemVindo);

		Panel panel = new Panel();
		panel.setBounds(0, 0, 270, 776);
		panel.setBackground(new Color(0, 0, 0));

		JSeparator separator = new JSeparator();

		JButton button = new JButton("Cadastro de Clientes");
		button.setMnemonic(KeyEvent.VK_1);
		button.addKeyListener(new KeyAdapter() {

		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setIcon(
				new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-gest\u00E3o-de-cliente-25.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroClienteViewFuncionario clientes = new CadastroClienteViewFuncionario();
				clientes.frmCadastroDeCliente.setVisible(true);
				clientes.frmCadastroDeCliente.setLocationRelativeTo(null);
				dispose();
			}
		});
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button.setBackground(new Color(0, 0, 0));

		JButton button_1 = new JButton("Estoque");
		button_1.setMnemonic(KeyEvent.VK_5);
		button_1.addKeyListener(new KeyAdapter() {

		});
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-procurar-estoque-25.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewEstoqueDesignFuncionario estoque = new ViewEstoqueDesignFuncionario();
				estoque.setVisible(true);
				estoque.setLocationRelativeTo(null);
				dispose();
			}
		});
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_1.setBackground(new Color(0, 0, 0));

		JButton button_2 = new JButton("Cadastro de Fornecedores");
		button_2.setMnemonic(KeyEvent.VK_2);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-caminh\u00E3o-25.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroFornecedorViewFuncionario cadastroFornecedorView = new CadastroFornecedorViewFuncionario();
				cadastroFornecedorView.frame.setVisible(true);
				cadastroFornecedorView.frame.setLocationRelativeTo(null);
				dispose();
			}
		});
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_2.setBackground(new Color(0, 0, 0));

		JButton button_3 = new JButton("Cadastro de Produtos");
		button_3.setMnemonic(KeyEvent.VK_3);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-produto-25.png")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProdutosViewFuncionario produto = new CadastroProdutosViewFuncionario();
				produto.setLocationRelativeTo(null);
				produto.setVisible(true);
				
				dispose();
			}
		});
		button_3.setOpaque(true);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		button_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), null));
		button_3.setBackground(new Color(0, 0, 0));

		JLabel label = new JLabel("Varej\u00E3o Santos");
		label.setDisplayedMnemonic(KeyEvent.VK_F1);
		label.addKeyListener(new KeyAdapter() {
			
		});
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Segoe UI", Font.BOLD, 24));

		JSeparator separator_1 = new JSeparator();

		JSeparator separator_2 = new JSeparator();

		JSeparator separator_3 = new JSeparator();

		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setFont(new Font("Segoe UI", Font.BOLD, 12));

		JSeparator separator_4 = new JSeparator();

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(306, 134, 623, 400);
		panel_2.setBorder(new TitledBorder(null, "Lembretes", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(59, 59, 59)));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 52, 595, 333);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(
				new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00BA", "Data", "Descri\u00E7\u00E3o", "Assunto"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(97);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(2).setPreferredWidth(354);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(910, 256, 38, 16);
		
		JButton btnNewButton_1 = new JButton("Mostrar Detalhes");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					detalharLembrete();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-ver-detalhes-25.png")));
		btnNewButton_1.setBounds(279, 12, 182, 28);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Add Lembrete");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-mais-25 (1).png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddLembreteFuncionario addLembrete = new AddLembreteFuncionario();
				addLembrete.setVisible(true);
			}
		});
		btnNewButton.setBounds(332, 630, 146, 28);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(btnNewButton_1);
		panel_2.add(scrollPane);
		
				JButton btnatualizar = new JButton("Atualizar");
				btnatualizar.setBounds(473, 12, 136, 28);
				panel_2.add(btnatualizar);
				btnatualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnatualizar.setBackground(Color.LIGHT_GRAY);
				btnatualizar.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-actualizar-25 (1).png")));
				btnatualizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {

							PesquisarLembreteTodos();

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				});
		contentPane.add(panel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
				.addComponent(button, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
				.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
				.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(lblFuncionario))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(label)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(117)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(lblFuncionario))
		);
		panel.setLayout(gl_panel);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("Sair");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Atenção",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
					try {
						JOptionPane.showMessageDialog(null, "Obrigado, volte Sempre!");
						ViewLoginDesign login = new ViewLoginDesign();
						login.setVisible(true);
						dispose();
					} catch (Exception e) {

						e.printStackTrace();
					}
				}
			}
		});
		lblNewLabel_1.addKeyListener(new KeyAdapter() {

		});
		lblNewLabel_1.setBounds(541, 18, 57, 28);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-sair-25 (1).png")));
		
		JLabel lblAlterarSenha = new JLabel("Alterar Senha");
		lblAlterarSenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAlterarSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
			ViewAlterarSenha senha = new ViewAlterarSenha();
				senha.setVisible(true);
				dispose();
			}
		});
		lblAlterarSenha.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-cadeado-2-25.png")));
		lblAlterarSenha.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblAlterarSenha.setForeground(Color.WHITE);
		lblAlterarSenha.setBounds(541, 63, 111, 28);
		panel_1.add(lblAlterarSenha);

		JButton btnDeletarLembrete = new JButton("Deletar Lembrete");
		btnDeletarLembrete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Warning",
						dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {

					try {
						deletarLembrete();
						removeSelecionado();

					} catch (Exception e) {

						e.printStackTrace();
					}
				}

			}

		});
		btnDeletarLembrete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletarLembrete.setBackground(Color.LIGHT_GRAY);
		btnDeletarLembrete.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-excluir-25.png")));
		btnDeletarLembrete.setBounds(748, 630, 153, 28);
		contentPane.add(btnDeletarLembrete);
		
		JButton btnExcluirTodosLembretes = new JButton("Excluir Todos Lembretes");
		btnExcluirTodosLembretes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluirTodosLembretes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					deletarTodos();
					PesquisarLembreteTodos();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnExcluirTodosLembretes.setBackground(Color.LIGHT_GRAY);
		btnExcluirTodosLembretes.setIcon(new ImageIcon(ViewMenuDesignFuncionario.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnExcluirTodosLembretes.setBounds(490, 630, 246, 28);
		contentPane.add(btnExcluirTodosLembretes);
	}

	private LembreteVO getLinha() throws Exception {
		int linha = table.getSelectedRow();
		DefaultTableModel dt2 = (DefaultTableModel) table.getModel();

		String codigo = dt2.getValueAt(linha, 0).toString();
		String data = dt2.getValueAt(linha, 1).toString();
		String desc = dt2.getValueAt(linha, 2).toString();
		String assunto = dt2.getValueAt(linha, 3).toString();

        String pattern = "yyyy-MM-dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Date date = df.parse(data);

		LembreteVO lVO = new LembreteVO();
		lVO.setCodigo(Integer.parseInt(codigo));
		lVO.setData(date);
		lVO.setDescricao(desc);
		lVO.setAssunto(assunto);
		return lVO;

	}

	private void removeSelecionado() {
		int linha = table.getSelectedRow();
		removeIndice(linha);

	}

	private void removeIndice(int indice) {
		DefaultTableModel dt2 = getTableModel();
		dt2.removeRow(indice);
	}

	private DefaultTableModel getTableModel() {
		return (DefaultTableModel) table.getModel();

	}

	private void deletarLembrete() throws Exception {
		LembreteVO l = getLinha();
		LembreteDAO dao = new LembreteDAO();
		JOptionPane.showMessageDialog(null, dao.delete(l));
		// removeSelecionado();

	}

	private static void PesquisarLembreteTodos() throws Exception {
		LembreteController controller = new LembreteController();
		List<LembreteVO> lista = new ArrayList<LembreteVO>();

		lista = controller.pesquisarLembreteTodos();

		cleanTable(table);

		for (LembreteVO lembreteVO : lista) {
			DefaultTableModel dados = (DefaultTableModel) table.getModel();
			SimpleDateFormat out = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");

			String result = out.format(in.parse(lembreteVO.getData().toString()));

			dados.addRow(new String[] { String.valueOf(lembreteVO.getCodigo()),result, lembreteVO.getDescricao(), lembreteVO.getAssunto()});

		}

	}

	private static void cleanTable(JTable tabela) {

		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

		dtm.setNumRows(0);

	}
	

	private void deletarTodos() throws Exception {
		LembreteController controller = new LembreteController();
		
		controller.excluirTodos();
		
	}
	
	private void detalharLembrete() throws Exception {
		LembreteVO lVO = getLinha();
		
		LembreteController controller = new LembreteController();
		
		int codigo = lVO.getCodigo();
		
		lVO = controller.pesquisaPorCodigo(codigo);
		
		DetalhesLembreteFuncionario detalhes = new DetalhesLembreteFuncionario(lVO);
		
		detalhes.setVisible(true);
		detalhes.setLocationRelativeTo(null);
	}
}
