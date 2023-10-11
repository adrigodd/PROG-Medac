package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actividades3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividades3 frame = new Actividades3();
					
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
	public Actividades3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(118, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(117, 57, 76, 14);
		panel.add(lblNewLabel);
		
		usuario = new JTextField();
		usuario.setBounds(192, 11, 86, 20);
		panel.add(usuario);
		usuario.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(192, 53, 86, 20);
		panel.add(pass);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Inicio");
		
		btnNewButton_1.setBounds(14, 5, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Salir");
		
		btnNewButton.setBounds(14, 39, 89, 23);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea textArea = new JTextArea();
		panel_3.add(textArea);
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
					}
				}else {
					Dialog2 Dialog = new Dialog2();
					Dialog.setVisible(true);
					
					
				}
			
					if(seguir) {
						Actividades Dialog = new Actividades();
						Dialog.setVisible(true);
					}else {
						Dialog2 Dialog = new Dialog2();
						Dialog.setVisible(true);
					}
				
				
				
					
					
				
				
					
				
			}
		});
	}
	
}
