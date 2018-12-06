package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JSeparator;
import com.toedter.calendar.JDateChooser;

import Controller.AlterarSenhaController;
import VO.AlterarSenhaVO;

import java.util.Date;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transferidor extends JFrame {

	private JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;
   
    public Transferidor()
    {
        super( "Usando o JColorChooser" );
       
        colorJPanel = new JPanel();
        colorJPanel.setBackground( color );
       
        changeColorJButton = new JButton( "Escolher a cor" );
        changeColorJButton.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed( ActionEvent event )
                    {
                        color = JColorChooser.showDialog(
                                Transferidor.this, "Escolher a color", color );
                       
                        if( color == null )
                            color = Color.LIGHT_GRAY;
                        colorJPanel.setBackground( color );
                    }
                }
                );
       
        add( colorJPanel, BorderLayout.CENTER );
        add( changeColorJButton, BorderLayout.SOUTH );
       
        setSize( 400, 130 );
        setVisible( true );
    }
}
