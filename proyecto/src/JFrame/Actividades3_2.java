package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Actividades3_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton porcentaje;
	private int valor;
	private String aux;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividades3_2 frame = new Actividades3_2();
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
	public Actividades3_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea Texto = new JTextArea();
		panel.add(Texto);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 4, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton AC = new JButton("AC");
		AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.setText("");
			}
		});
		panel_2.add(AC);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton CambioSumaResta = new JButton("+/-");
		CambioSumaResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux=Texto.getText();
				double cambio=Double.parseDouble(aux);
				if(cambio>0) {
					cambio=Math.abs(cambio);
					aux=String.valueOf(cambio);
					Texto.setText("-"+aux);
				}else {
					cambio=Math.abs(cambio);
					aux=String.valueOf(cambio);
					Texto.setText(aux);
					
				}
				
			}
		});
		panel_3.add(CambioSumaResta);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		porcentaje = new JButton("%");
		porcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String porcentaje=Texto.getText();
				int Porcentaje=Integer.parseInt(porcentaje);
				double resultado=(double)Porcentaje/100;
				String resultadoString=String.valueOf(resultado);
				Texto.setText(resultadoString);
			}
		});
		panel_4.add(porcentaje);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux=Texto.getText();
				Texto.setText("");
			
				valor=4;
			}
		});
		panel_5.add(division);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero7 = new JButton("7");
		numero7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("7");
			}
		});
		panel_6.add(numero7);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero8 = new JButton("8");
		numero8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("8");
			}
		});
		panel_7.add(numero8);
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero9 = new JButton("9");
		numero9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("9");
			}
		});
		panel_8.add(numero9);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux=Texto.getText();
				Texto.setText("");
				valor=3;
			}
		});
		panel_9.add(multiplicar);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero4 = new JButton("4");
		numero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("4");
			}
		});
		panel_10.add(numero4);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero5 = new JButton("5");
		numero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("5");
			}
		});
		panel_11.add(numero5);
		
		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero6 = new JButton("6");
		numero6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("6");
			}
		});
		panel_12.add(numero6);
		
		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton Restar = new JButton("-");
		Restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux=Texto.getText();
				Texto.setText("");
				valor=2;
			}
		});
		panel_13.add(Restar);
		
		JPanel panel_14 = new JPanel();
		panel_1.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero1 = new JButton("1");
		numero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("1");
			}
		});
		panel_14.add(numero1);
		
		JPanel panel_15 = new JPanel();
		panel_1.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero2 = new JButton("2");
		numero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("2");
			}
		});
		panel_15.add(numero2);
		
		JPanel panel_16 = new JPanel();
		panel_1.add(panel_16);
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero3 = new JButton("3");
		numero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("3");
			}
		});
		panel_16.add(numero3);
		
		JPanel panel_17 = new JPanel();
		panel_1.add(panel_17);
		panel_17.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aux=Texto.getText();
				Texto.setText("");
				valor=1;
			}
		});
		panel_17.add(sumar);
		
		JPanel panel_18 = new JPanel();
		panel_1.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton numero0 = new JButton("0");
		numero0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("0");
				
			}
		});
		panel_18.add(numero0);
		
		JPanel panel_19 = new JPanel();
		panel_1.add(panel_19);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton boton0 = new JButton("00");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append("00");
			}
		});
		panel_19.add(boton0);
		
		JPanel panel_20 = new JPanel();
		panel_1.add(panel_20);
		panel_20.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton coma = new JButton(",");
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto.append(".");
			}
		});
		panel_20.add(coma);
		
		JPanel panel_21 = new JPanel();
		panel_1.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton Resultado = new JButton("=");
		Resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux2=Texto.getText();
				double PrimerNumero=Double.parseDouble(aux);
				double SegundoNumero=Double.parseDouble(aux2);
				if(valor==1) {
					double resultado=PrimerNumero+SegundoNumero;
					String ValorFinal=String.valueOf(resultado);
					Texto.setText(ValorFinal);
					
				}else if(valor==2) {
					double resultado=PrimerNumero-SegundoNumero;
					String ValorFinal=String.valueOf(resultado);
					Texto.setText(ValorFinal);
				}else if(valor==3) {
					double resultado=PrimerNumero*SegundoNumero;
					String ValorFinal=String.valueOf(resultado);
					Texto.setText(ValorFinal);
				}else if(valor==4) {
					double resultado=PrimerNumero/SegundoNumero;
					String ValorFinal=String.valueOf(resultado);
					Texto.setText(ValorFinal);
				}
				

				
			}
		});
		panel_21.add(Resultado);
	}

}
