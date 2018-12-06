package View;

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

import Controller.AlterarSenhaController;
import Controller.LembreteController;
import DAO.LembreteDAO;
import VO.AlterarSenhaVO;
import VO.LembreteVO;
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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class ViewAlterarSenha extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtlogin;
	private JTextField txtemail;
	private JPasswordField txtsenha;
	private JPasswordField txtsenhanova;

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

					ViewMenuDesign frameMenu = new ViewMenuDesign();
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
	public ViewAlterarSenha() {
		setResizable(false);
//		
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		int width = (int) screenSize.getWidth();
//		int height = (int) screenSize.getHeight();
//		
//		setSize(width-50,height-50);
//		setVisible(true);
//		setLocationRelativeTo(null);

		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 674, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel_1 = new JPanel();
		
		panel_1.setBounds(0, 0, 854, 97);
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(910, 256, 38, 16);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
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
						login.setLocationRelativeTo(null);
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
		lblNewLabel_1.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-sair-25 (1).png")));
		
		JLabel lblAlterarSenha = new JLabel("Alterar Senha");
		lblAlterarSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				ViewAlterarSenha senha = new ViewAlterarSenha();
				senha.setVisible(true);
				senha.setLocationRelativeTo(null);
				dispose();
			}
		});
		lblAlterarSenha.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-cadeado-2-25.png")));
		lblAlterarSenha.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblAlterarSenha.setForeground(Color.WHITE);
		lblAlterarSenha.setBounds(541, 63, 111, 28);
		panel_1.add(lblAlterarSenha);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ViewMenuDesign menu = new ViewMenuDesign();
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);
				dispose();
			}
		});
		lblMenu.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-p\u00E1gina-inicial-25.png")));
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setBounds(29, 18, 85, 22);
		panel_1.add(lblMenu);
		
		JLabel lblCadastrarUsuario = new JLabel("Cadastrar Usuario");
		lblCadastrarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CadastroUsuarioView usuario = new CadastroUsuarioView();
				usuario.setVisible(true);
				usuario.setLocationRelativeTo(null);
				dispose();
			}
		});
		lblCadastrarUsuario.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-administrador-masculino-25 (3).png")));
		lblCadastrarUsuario.setForeground(Color.WHITE);
		lblCadastrarUsuario.setBounds(29, 65, 131, 27);
		panel_1.add(lblCadastrarUsuario);
		
		JLabel lblAlterarSenha_1 = new JLabel("Alterar Senha");
		lblAlterarSenha_1.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-senha-filled-25.png")));
		lblAlterarSenha_1.setForeground(Color.BLACK);
		lblAlterarSenha_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblAlterarSenha_1.setBounds(250, 130, 134, 25);
		contentPane.add(lblAlterarSenha_1);
		
		txtnome = new JTextField();
		txtnome.setBorder(null);
		txtnome.setBackground(new Color(214,217,223));
		txtnome.setBounds(221, 209, 234, 28);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtlogin = new JTextField();
		txtlogin.setBorder(null);
		txtlogin.setBackground(new Color(214,217,223));
		txtlogin.setColumns(10);
		txtlogin.setBounds(221, 271, 234, 28);
		contentPane.add(txtlogin);
		
		txtemail = new JTextField();
		txtemail.setBorder(null);
		txtemail.setBackground(new Color(214,217,223));
		txtemail.setColumns(10);
		txtemail.setBounds(221, 329, 234, 28);
		contentPane.add(txtemail);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBackground(Color.WHITE);
		separator_6.setBounds(221, 297, 234, 2);
		contentPane.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBackground(Color.WHITE);
		separator_7.setBounds(221, 355, 234, 2);
		contentPane.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.WHITE);
		separator_8.setBackground(Color.WHITE);
		separator_8.setBounds(221, 412, 234, 2);
		contentPane.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.WHITE);
		separator_9.setBackground(Color.WHITE);
		separator_9.setBounds(221, 477, 234, 2);
		contentPane.add(separator_9);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBackground(Color.WHITE);
		separator_5.setBounds(221, 236, 234, 2);
		contentPane.add(separator_5);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-usu\u00E1rio-25.png")));
		label_2.setBounds(177, 266, 32, 25);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-usu\u00E1rio-filled-25.png")));
		label_3.setBounds(177, 209, 25, 25);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(467, 326, 55, 33);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-nova-mensagem-filled-25.png")));
		label_5.setBounds(177, 319, 32, 33);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-cadeado-2-filled-25.png")));
		label_6.setBounds(177, 381, 32, 33);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-verifica\u00E7\u00E3o-de-senha-filled-25.png")));
		label_7.setBounds(177, 436, 38, 33);
		contentPane.add(label_7);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-senha-25.png")));
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					alterarSenha();
					limpar();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			private void alterarSenha() throws Exception {
				AlterarSenhaVO senha = new AlterarSenhaVO();
				senha.setNome(txtnome.getText());
				senha.setLogin(txtlogin.getText());
				senha.setEmail(txtemail.getText());
				senha.setSenhaAtual(txtsenha.getText());
				senha.setSenhaNova(txtsenhanova.getText());
				
				AlterarSenhaController controller = new AlterarSenhaController();
				controller.alterarSenha(senha);
				
			}
		});
		btnAlterarSenha.setBounds(177, 521, 134, 37);
		contentPane.add(btnAlterarSenha);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				limpar();

			}
		});
		btnLimpar.setIcon(new ImageIcon(ViewAlterarSenha.class.getResource("/imagens/icons8-vassoura-filled-25.png")));
		btnLimpar.setBounds(360, 521, 111, 37);
		contentPane.add(btnLimpar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNome.setBounds(221, 196, 55, 16);
		contentPane.add(lblNome);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblLogin.setBounds(221, 249, 55, 22);
		contentPane.add(lblLogin);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblEmail.setBounds(221, 311, 55, 16);
		contentPane.add(lblEmail);
		
		JLabel lblSenhaAtual = new JLabel("Senha Atual");
		lblSenhaAtual.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSenhaAtual.setBounds(221, 369, 84, 16);
		contentPane.add(lblSenhaAtual);
		
		JLabel lblNovaSenha = new JLabel("Nova Senha");
		lblNovaSenha.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNovaSenha.setBounds(221, 426, 84, 16);
		contentPane.add(lblNovaSenha);
		
		txtsenha = new JPasswordField();
		txtsenha.setBorder(null);
		txtsenha.setBackground(new Color(214,217,223));
		txtsenha.setBounds(221, 386, 234, 28);
		contentPane.add(txtsenha);
		
		txtsenhanova = new JPasswordField();
		txtsenhanova.setBackground(new Color(214,217,223));
		txtsenhanova.setBorder(null);
		txtsenhanova.setBounds(221, 451, 234, 28);
		contentPane.add(txtsenhanova);
	}
	
	
	private void limpar() {

		txtnome.setText("");
		txtlogin.setText("");
		txtemail.setText("");
		txtsenha.setText("");
		txtsenhanova.setText("");
		txtnome.requestFocus(true);
	}
}