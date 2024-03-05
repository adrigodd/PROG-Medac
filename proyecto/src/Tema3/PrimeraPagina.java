package Tema3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PrimeraPagina extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraPagina frame = new PrimeraPagina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeraPagina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("ENTRADAS CINE");
		panel_5.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("La monja");
		lblNewLabel_1.setBounds(75, 25, 82, 14);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SegundaPagina a=new SegundaPagina();
				a.setVisible(true);
			}
		});
		btnNewButton.setBounds(280, 21, 89, 23);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Saw = new JLabel("Saw");
		Saw.setBounds(75, 25, 43, 14);
		panel_3.add(Saw);
		
		JButton btnNewButton_1 = new JButton("Comprar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SegundaPagina a=new SegundaPagina();
				a.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(280, 21, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Smile = new JLabel("Smile");
		Smile.setBounds(75, 25, 43, 14);
		panel_4.add(Smile);
		
		JButton btnNewButton_2 = new JButton("Comprar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SegundaPagina a=new SegundaPagina();
				a.setVisible(true);
			
			}
		});
		btnNewButton_2.setBounds(280, 21, 89, 23);
		panel_4.add(btnNewButton_2);
	}
}
