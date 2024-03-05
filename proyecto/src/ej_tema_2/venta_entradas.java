package ej_tema_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class venta_entradas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					venta_entradas frame = new venta_entradas();
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
	public venta_entradas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("seccion F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entradas dialog = new entradas();
				dialog.setVisible(true);
				setVisible(false);
			
			}
		});
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("seccion A");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				entradas dialog = new entradas();
				dialog.setVisible(true);
				setVisible(false);
			
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("seccion B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entradas dialog = new entradas();
				dialog.setVisible(true);
				setVisible(false);
			
			}
		});
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton btnNewButton_3 = new JButton("seccion E");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entradas dialog = new entradas();
				dialog.setVisible(true);
				setVisible(false);
			
			}
		});
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("seccion D");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entradas dialog = new entradas();
				dialog.setVisible(true);
				setVisible(false);
			
			}
		});
		panel_2.add(btnNewButton_5);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_4 = new JButton("seccion C");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entradas dialog = new entradas();
				dialog.setVisible(true);
				setVisible(false);
			
			}
		});
		panel_3.add(btnNewButton_4);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("escenario");
		lblNewLabel.setBounds(91, 73, 88, 39);
		panel_4.add(lblNewLabel);
	}

}
