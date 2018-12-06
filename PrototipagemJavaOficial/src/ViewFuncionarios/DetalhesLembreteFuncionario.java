package ViewFuncionarios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

import VO.LembreteVO;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class DetalhesLembreteFuncionario extends JDialog {
	private JTextField txtAssunto;
	private JTextField txtData;
	private JTextArea txtDesc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DetalhesLembreteFuncionario dialog = new DetalhesLembreteFuncionario(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DetalhesLembreteFuncionario(LembreteVO lVO) {
		setBounds(100, 100, 484, 487);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBackground(new Color(17, 144, 147));
			getContentPane().add(panel, BorderLayout.CENTER);
			{
				JLabel label = new JLabel("Data:");
				label.setFont(new Font("Segoe UI", Font.BOLD, 12));
				label.setBounds(10, 113, 46, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Descri\u00E7\u00E3o:");
				label.setFont(new Font("Segoe UI", Font.BOLD, 12));
				label.setBounds(10, 181, 65, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Assunto:");
				label.setFont(new Font("Segoe UI", Font.BOLD, 12));
				label.setBounds(10, 320, 65, 14);
				panel.add(label);
			}
			{
				txtAssunto = new JTextField();
				txtAssunto.setEnabled(false);
				txtAssunto.setColumns(10);
				txtAssunto.setBounds(96, 309, 355, 28);
				panel.add(txtAssunto);
			}
			{
				JLabel lblDetalhesDoLembrete = new JLabel("Detalhes do Lembrete");
				lblDetalhesDoLembrete.setIcon(new ImageIcon(DetalhesLembreteFuncionario.class.getResource("/imagens/icons8-ver-detalhes-25.png")));
				lblDetalhesDoLembrete.setFont(new Font("Segoe UI", Font.BOLD, 24));
				lblDetalhesDoLembrete.setBounds(98, 6, 317, 54);
				panel.add(lblDetalhesDoLembrete);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(96, 176, 355, 109);
				panel.add(scrollPane);
				{
					txtDesc = new JTextArea();
					txtDesc.setEnabled(false);
					scrollPane.setViewportView(txtDesc);
				}
			}
			{
				JButton btnVoltar = new JButton("Voltar");
				btnVoltar.setIcon(new ImageIcon(DetalhesLembreteFuncionario.class.getResource("/imagens/icons8-voltar-25.png")));
				btnVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				btnVoltar.setActionCommand("Cancel");
				btnVoltar.setBounds(39, 377, 105, 37);
				panel.add(btnVoltar);
			}
			
			txtData = new JTextField();
			txtData.setEnabled(false);
			txtData.setBounds(96, 106, 168, 28);
			panel.add(txtData);
			txtData.setColumns(10);
			
			detalhaLembrete(lVO);
		}
	}

	private void detalhaLembrete(LembreteVO lVO) {
		
		txtData.setText(String.valueOf(lVO.getData()));
		txtDesc.setText(lVO.getDescricao());
		txtAssunto.setText(lVO.getAssunto());
		
	}
}
