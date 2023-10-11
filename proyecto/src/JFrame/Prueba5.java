package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba5 frame = new Prueba5();
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
	public Prueba5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 11, 184, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 66, 184, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(34, 14, 79, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero");
		lblNewLabel_1.setBounds(34, 69, 79, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Area Triángulo");
		
		btnNewButton.setBounds(44, 102, 123, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Area Cuadrado");
		
		btnNewButton_1.setBounds(249, 102, 116, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JTextArea textArea = new JTextArea();
		panel_1.add(textArea);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base=Integer.parseInt(textField.getText());
				double altura=Integer.parseInt(textField_1.getText());
				textArea.append("El area del triangulo  es"+(base*altura)/2);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base=Integer.parseInt(textField.getText());
				double altura=Integer.parseInt(textField_1.getText());
				textArea.append("El area del cuadrado  es"+(base*altura));
			}
		});
	}
}
