package InterfazSVG;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ActividadesTema3.PrimerEjercicio.Actividades;
import ActividadesTema3.PrimerEjercicio.Dialog2;
import java.awt.Color;
import javax.swing.UIManager;

public class PrimeraPag extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraPag frame = new PrimeraPag();
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
	public PrimeraPag() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(118, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(117, 57, 76, 14);
		panel.add(lblNewLabel);
		
		JTextField usuario = new JTextField();
		usuario.setBounds(192, 11, 86, 20);
		panel.add(usuario);
		usuario.setColumns(10);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(192, 53, 86, 20);
		panel.add(pass);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Button.light"));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Inicio");
		
		btnNewButton_1.setBounds(14, 5, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Salir");
		
		btnNewButton.setBounds(325, 5, 89, 23);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[]password= {'1','2','3','4'};
				char[]pass1=pass.getPassword();
				boolean seguir=false;
				if(usuario.getText().equals("admin")|| usuario.getText().equals("Admin")) {
					if(pass1.length==password.length) {
						
					
					seguir=true;
					for(int i=0;i<password.length;i++) {
						if(pass1[i]!=password[i]) {
							seguir=false;
						}
							
						
						
					}
					if(seguir) {
						Actividades Dialog = new Actividades();
						Dialog.setVisible(true);
					}else {
						Dialog2 Dialog = new Dialog2();
						Dialog.setVisible(true);
					}
					}else {
						Dialog2 Dialog = new Dialog2();
						Dialog.setVisible(true);
					}
				}else {
					Dialog2 Dialog = new Dialog2();
					Dialog.setVisible(true);
					
					
				}
			
					
				
				
				
					
					
				
				
					
				
			}
		});
	}
}
