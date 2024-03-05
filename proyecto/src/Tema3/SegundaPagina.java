package Tema3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SegundaPagina extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SegundaPagina dialog = new SegundaPagina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SegundaPagina() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		contentPanel.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("PANTALLA");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPanel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("1");
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("2");
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("3");
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("4");
		panel_9.add(lblNewLabel_4);
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("5");
		panel_8.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_10.add(panel_16);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TerceraPagina comprar=new TerceraPagina();
				comprar.setVisible(true);
			
			}
				
		});
		panel_16.add(btnNewButton);
		
		JPanel panel_17 = new JPanel();
		panel_10.add(panel_17);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		panel_17.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		contentPanel.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		panel_11.add(lblNewLabel_6);
		
		JPanel panel_14 = new JPanel();
		panel_3.add(panel_14);
		
		JLabel lblNewLabel_7 = new JLabel("2");
		panel_14.add(lblNewLabel_7);
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15);
		
		JLabel lblNewLabel_8 = new JLabel("3");
		panel_15.add(lblNewLabel_8);
		
		JPanel panel_13 = new JPanel();
		panel_3.add(panel_13);
		
		JLabel lblNewLabel_9 = new JLabel("4");
		panel_13.add(lblNewLabel_9);
		
		JPanel panel_12 = new JPanel();
		panel_3.add(panel_12);
		
		JLabel lblNewLabel_10 = new JLabel("5");
		panel_12.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		contentPanel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(5, 5, 0, 0));
		
		JButton Fila1Columna1 = new JButton("");
		Fila1Columna1.setBackground(Color.white);
		Fila1Columna1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila1Columna1.getBackground()==Color.white) {
					Fila1Columna1.setBackground(Color.GREEN);
				}else if(Fila1Columna1.getBackground()==Color.GREEN) {
					Fila1Columna1.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila1Columna1.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila1Columna1);
		
		JButton Fila2Columna1 = new JButton("");
		Fila2Columna1.setBackground(Color.white);
		Fila2Columna1.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		Fila2Columna1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila2Columna1.getBackground()==Color.white) {
					Fila2Columna1.setBackground(Color.GREEN);
				}else if(Fila2Columna1.getBackground()==Color.GREEN) {
					Fila2Columna1.setBackground(Color.white);
				}
				
			}
			
			
		});
		panel_4.add(Fila2Columna1);
		
		JButton Fila3Columna1 = new JButton("");
		Fila3Columna1.setBackground(Color.white);
		Fila3Columna1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila3Columna1.getBackground()==Color.white) {
					Fila3Columna1.setBackground(Color.GREEN);
				}else if(Fila3Columna1.getBackground()==Color.GREEN) {
					Fila3Columna1.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila3Columna1.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila3Columna1);
		
		JButton Fila4Columna1 = new JButton("");
		Fila4Columna1.setBackground(Color.white);
		Fila4Columna1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila4Columna1.getBackground()==Color.white) {
					Fila4Columna1.setBackground(Color.GREEN);
				}else if(Fila4Columna1.getBackground()==Color.GREEN) {
					Fila4Columna1.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila4Columna1.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila4Columna1);
		
		JButton Fila5Columna1 = new JButton("");
		Fila5Columna1.setBackground(Color.white);
		Fila5Columna1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila5Columna1.getBackground()==Color.white) {
					Fila5Columna1.setBackground(Color.GREEN);
				}else if(Fila5Columna1.getBackground()==Color.GREEN) {
					Fila5Columna1.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila5Columna1.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila5Columna1);
		
		JButton Fila1Columna2 = new JButton("");
		Fila1Columna2.setBackground(Color.white);
		Fila1Columna2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila1Columna2.getBackground()==Color.white) {
					Fila1Columna2.setBackground(Color.GREEN);
				}else if(Fila1Columna2.getBackground()==Color.GREEN) {
					Fila1Columna2.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila1Columna2.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila1Columna2);
		
		JButton Fila2Columna2 = new JButton("");
		Fila2Columna2.setBackground(Color.red);
		Fila2Columna2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila2Columna2.getBackground()==Color.white) {
					Fila2Columna2.setBackground(Color.GREEN);
				}else if(Fila2Columna2.getBackground()==Color.GREEN) {
					Fila2Columna2.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila2Columna2.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila2Columna2);
		
		JButton Fila3Columna2 = new JButton("");
		Fila3Columna2.setBackground(Color.red);
		Fila3Columna2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila3Columna2.getBackground()==Color.white) {
					Fila3Columna2.setBackground(Color.GREEN);
				}else if(Fila3Columna2.getBackground()==Color.GREEN) {
					Fila3Columna2.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila3Columna2.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila3Columna2);
		
		JButton Fila4Columna2 = new JButton("");
		Fila4Columna2.setBackground(Color.red);
		Fila4Columna2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila4Columna2.getBackground()==Color.white) {
					Fila4Columna2.setBackground(Color.GREEN);
				}else if(Fila4Columna2.getBackground()==Color.GREEN) {
					Fila4Columna2.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila4Columna2.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila4Columna2);
		
		JButton Fila5Columna2 = new JButton("");
		Fila5Columna2.setBackground(Color.white);
		Fila5Columna2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila5Columna2.getBackground()==Color.white) {
					Fila5Columna2.setBackground(Color.GREEN);
				}else if(Fila5Columna2.getBackground()==Color.GREEN) {
					Fila5Columna2.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila5Columna2.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila5Columna2);
		
		JButton Fila1Columna3 = new JButton("");
		Fila1Columna3.setBackground(Color.white);
		Fila1Columna3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila1Columna3.getBackground()==Color.white) {
					Fila1Columna3.setBackground(Color.GREEN);
				}else if(Fila1Columna3.getBackground()==Color.GREEN) {
					Fila1Columna3.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila1Columna3.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila1Columna3);
		
		JButton Fila2Columna3 = new JButton("");
		Fila2Columna3.setBackground(Color.white);
		Fila2Columna3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila2Columna3.getBackground()==Color.white) {
					Fila2Columna3.setBackground(Color.GREEN);
				}else if(Fila2Columna3.getBackground()==Color.GREEN) {
					Fila2Columna3.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila2Columna3.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila2Columna3);
		
		JButton Fila3Columna3 = new JButton("");
		Fila3Columna3.setBackground(Color.white);
		Fila3Columna3.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		Fila3Columna3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila3Columna3.getBackground()==Color.white) {
					Fila3Columna3.setBackground(Color.GREEN);
				}else if(Fila3Columna3.getBackground()==Color.GREEN) {
					Fila3Columna3.setBackground(Color.white);
				}
				
			}
			
			
		});
		panel_4.add(Fila3Columna3);
		
		JButton Fila4Columna3 = new JButton("");
		Fila4Columna3.setBackground(Color.white);
		Fila4Columna3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila4Columna3.getBackground()==Color.white) {
					Fila4Columna3.setBackground(Color.GREEN);
				}else if(Fila4Columna3.getBackground()==Color.GREEN) {
					Fila4Columna3.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila4Columna3.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila4Columna3);
		
		JButton Fila5Columna3 = new JButton("");
		Fila5Columna3.setBackground(Color.white);
		Fila5Columna3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila5Columna3.getBackground()==Color.white) {
					Fila5Columna3.setBackground(Color.GREEN);
				}else if(Fila5Columna3.getBackground()==Color.GREEN) {
					Fila5Columna3.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila5Columna3.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila5Columna3);
		
		JButton Fila1Columna4 = new JButton("");
		Fila1Columna4.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		Fila1Columna4.setBackground(Color.white);
		Fila1Columna4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila1Columna4.getBackground()==Color.white) {
					Fila1Columna4.setBackground(Color.GREEN);
				}else if(Fila1Columna4.getBackground()==Color.GREEN) {
					Fila1Columna4.setBackground(Color.white);
				}
				
			}
			
			
		});
		panel_4.add(Fila1Columna4);
		
		JButton Fila2Columna4 = new JButton("");
		Fila2Columna4.setBackground(Color.white);
		Fila2Columna4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila2Columna4.getBackground()==Color.white) {
					Fila2Columna4.setBackground(Color.GREEN);
				}else if(Fila2Columna4.getBackground()==Color.GREEN) {
					Fila2Columna4.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila2Columna4.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila2Columna4);
		
		JButton Fila3Columna4 = new JButton("");
		Fila3Columna4.setBackground(Color.white);
		Fila3Columna4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila3Columna4.getBackground()==Color.white) {
					Fila3Columna4.setBackground(Color.GREEN);
				}else if(Fila3Columna4.getBackground()==Color.GREEN) {
					Fila3Columna4.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila3Columna4.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila3Columna4);
		
		JButton Fila4Columna4 = new JButton("");
		Fila4Columna4.setBackground(Color.white);
		Fila4Columna4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila4Columna4.getBackground()==Color.white) {
					Fila4Columna4.setBackground(Color.GREEN);
				}else if(Fila4Columna4.getBackground()==Color.GREEN) {
					Fila4Columna4.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila4Columna4.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila4Columna4);
		
		JButton Fila5Columna4 = new JButton("");
		Fila5Columna4.setBackground(Color.red);
		Fila5Columna4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila5Columna4.getBackground()==Color.white) {
					Fila5Columna4.setBackground(Color.GREEN);
				}else if(Fila5Columna4.getBackground()==Color.GREEN) {
					Fila5Columna4.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila5Columna4.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila5Columna4);
		
		JButton Fila1Columna5 = new JButton("");
		Fila1Columna5.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila1Columna5);
		
		JButton Fila2Columna5 = new JButton("");
		Fila2Columna5.setBackground(Color.white);
		Fila2Columna5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila2Columna5.getBackground()==Color.white) {
					Fila2Columna5.setBackground(Color.GREEN);
				}else if(Fila2Columna5.getBackground()==Color.GREEN) {
					Fila2Columna5.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila1Columna5.setBackground(Color.white);
		Fila1Columna5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila1Columna5.getBackground()==Color.white) {
					Fila1Columna5.setBackground(Color.GREEN);
				}else if(Fila2Columna5.getBackground()==Color.GREEN) {
					Fila1Columna5.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila2Columna5.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila2Columna5);
		
		JButton Fila3Columna5 = new JButton("");
		Fila3Columna5.setBackground(Color.white);
		Fila3Columna5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila3Columna5.getBackground()==Color.white) {
					Fila3Columna5.setBackground(Color.GREEN);
				}else if(Fila3Columna5.getBackground()==Color.GREEN) {
					Fila3Columna5.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila3Columna5.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila3Columna5);
		
		JButton Fila4Columna5 = new JButton("");
		Fila4Columna5.setBackground(Color.white);
		Fila4Columna5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila4Columna5.getBackground()==Color.white) {
					Fila4Columna5.setBackground(Color.GREEN);
				}else if(Fila4Columna5.getBackground()==Color.GREEN) {
					Fila4Columna5.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila4Columna5.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila4Columna5);
		
		JButton Fila5Columna5 = new JButton("");
		Fila5Columna5.setBackground(Color.red);
		Fila5Columna5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fila5Columna5.getBackground()==Color.white) {
					Fila5Columna5.setBackground(Color.GREEN);
				}else if(Fila5Columna5.getBackground()==Color.GREEN) {
					Fila5Columna5.setBackground(Color.white);
				}
				
			}
			
			
		});
		Fila5Columna5.setIcon(new ImageIcon(SegundaPagina.class.getResource("/Imagen/85671 (1).png")));
		panel_4.add(Fila5Columna5);
		
	}
}


